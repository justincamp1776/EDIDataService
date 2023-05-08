package com.remichel.edi.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.remichel.core.dao.AbstractDAO;
import com.remichel.core.db.DBConnectionFactory;
import com.remichel.core.db.util.DBUtil;
import com.remichel.edi.model.EDIAudit;
import com.remichel.edi.model.EDIOEHeader;
import com.remichel.edi.model.EDIOELine;

@Repository
public class EDIAuditDAO extends AbstractDAO {

	private static String INSERT_FILE_AUDIT = "INSERT INTO [BranchOps].[dbo].[EDI_FILE_AUDIT] ("			
			+ " [EDI_SEQNUM], [TRADING_PARTNER_NAME], [F_SUCCESS], [F_HAS_FAILED_HDR], [ORDER_DATE] "
			+ " , [_FILE_NAME], [EX_MESSAGE], [EX_LOCATION], [EX_TYPE] ) "
			+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ? )";
	
	private static String INSERT_HDR_AUDIT = "INSERT INTO [BranchOps].[dbo].[EDI_HDR_AUDIT] ("			
			+ " [FILE_AUDIT_ID], [F_SUCCESS], [F_HAS_FAILED_LINE], [CUSTOMER_ID], [COMPANY_NUMBER] "
			+ " ,[CUSTOMER_PO], [TRUCK], [SALES_LOCATION_ID], [SHIP_TO_ID], [IMPORT_SET_NO], [EX_MESSAGE], [EX_LOCATION], [EX_TYPE] ) "
			+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
		
	private static String INSERT_LINE_AUDIT = "INSERT INTO [BranchOps].[dbo].[EDI_LINE_AUDIT] ("			
			+ " [HDR_AUDIT_ID], [F_SUCCESS], [ITEM_ID], [CUST_PART_NUMBER], "
			+ " [UNIT_QUANTITY], [EX_MESSAGE], [EX_LOCATION], [EX_TYPE] ) "
			+ " VALUES (?, ?, ?, ?, ?, ?, ?, ? )";
	

@SuppressWarnings({ "resource", "finally", "static-access" })
public boolean insertErrRecords(final EDIAudit rec) throws Exception {

	if(rec.getEdiRec() == null ) {
		throw new Exception("EDIAudit is null.");
	}			
	
	Connection conn       = null;
	PreparedStatement ps  = null;
	ResultSet rs          = null;
	
	int stat;
	int index; 
	long fileAuditID 	= 0;
	long hdrAuditID 	= 0;
	BigDecimal customerID;
	
	 try {		 	 			
			conn = DBConnectionFactory.getConnection( DBConnectionFactory.DBType.SQL_SERVER_DB );
					
				Statement s1 = null;
				ps = conn.prepareStatement(INSERT_FILE_AUDIT, s1.RETURN_GENERATED_KEYS);
				
					index = 1; 
				
					ps.setLong		(index++, rec.getEdiRec().getSeqNum());
					ps.setString	(index++, rec.getEdiRec().getTradingPartnerName());
					ps.setBoolean   (index++, rec.getEdiRec().isFileSuccess());
					ps.setBoolean   (index++, rec.getEdiRec().isHasFailedHDR());
					ps.setString	(index++, rec.getEdiRec().getOrderDate());
					ps.setString	(index++, rec.getEdiRec().getFilePath());
					ps.setString	(index++, rec.getEdiRec().getExMessage());
					ps.setString	(index++, rec.getEdiRec().getExLocation());
				    ps.setString	(index++, rec.getEdiRec().getExType());	
				    //TODO ADD ISWARNING - Files can succeed with exceptions
				    				    
				     stat = ps.executeUpdate();
				     
					if (stat == 1) {					
						rs = ps.getGeneratedKeys();
						
			            if (rs != null && rs.next()) {			            	
			            	fileAuditID = rs.getLong(1);
			            };
					}	
				    						
	            if(rec.getEdiRec().isFileSuccess()){
		            	
		           if (rec.getOrders() == null || rec.getOrders().size() == 0) {
						String errMsg = "oeHdrs is null or empty.";
						System.out.println(errMsg);
						throw new Exception(errMsg);
					}	

					for(EDIOEHeader h : rec.getOrders()) {	
				
						s1 = null;
						ps = conn.prepareStatement(INSERT_HDR_AUDIT, s1.RETURN_GENERATED_KEYS);
						customerID = h.getCustomerID();						
						
						index = 1; 
												
						ps.setLong		  	(index++, fileAuditID);
						ps.setBoolean   	(index++, h.isHdrSuccess());
						ps.setBoolean   	(index++, h.isHasRejectedLines()); 
						ps.setBigDecimal  	(index++, customerID);
						ps.setString		(index++, h.getCompanyCode());
						ps.setString		(index++, h.getCustomerPONumber());
						ps.setString		(index++, h.getTruck());
						ps.setBigDecimal	(index++, h.getSalesLocationID());
						ps.setLong			(index++, h.getShipToID());
						ps.setString		(index++, h.getImportSetNo());						
						ps.setString		(index++, h.getExMessage());
						ps.setString		(index++, h.getExLocation());
					    ps.setString		(index++, h.getExType());
					   
					    ps.executeUpdate();	
					   
					    rs = ps.getGeneratedKeys();
					    
			            if (rs != null && rs.next()) {
			            	hdrAuditID = rs.getLong(1);
			            }												  			          
			            
			            if (h.getOeLine() == null || h.getOeLine().size() == 0) {
							String errMsg = "oeHdrs is null or empty.";
							System.out.println(errMsg);
							throw new Exception(errMsg);
						}	
			            
						    for(EDIOELine l : h.getOeLine()) {	
						    	ps = conn.prepareStatement(INSERT_LINE_AUDIT);
						    	
									index = 1;
									
									ps.setLong		(index++, hdrAuditID);
									ps.setBoolean   (index++, l.isLineSuccess());
									ps.setString	(index++, l.getItemID());
									ps.setString    (index++, l.getExtendedDescription());
									ps.setLong		(index++, l.getUnitQuantity());
									ps.setString	(index++, l.getExMessage());
									ps.setString	(index++, l.getExLocation());
								    ps.setString	(index++, l.getExType());
								   
								    stat = ps.executeUpdate();
											
							    if (stat != 1) {
									throw new Exception("Unable to insert EDI Audit Records.");	
								}							    							   
							}				    												  																	    			
				}
			}
			
			conn.commit();	
			
					 
		 }	
		 catch(Exception ex){	
			 
			 System.out.println(ex.getMessage());		 
		 }
		 finally {	
			 
			 DBUtil.closeIO(rs);	
			 
		  return true;		
		 }
	}	 
}

