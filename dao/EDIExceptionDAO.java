package com.remichel.edi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.remichel.core.dao.AbstractDAO;
import com.remichel.core.db.DBConnectionFactory;
import com.remichel.core.db.util.DBUtil;
import com.remichel.edi.model.EDIException;

@Repository
public class EDIExceptionDAO extends AbstractDAO {
	private static String SQL_INSERT_EX = "INSERT INTO [BranchOps].[dbo].[EDI_EXCEPTION_AUDIT] ("			
			+ " DATE_CREATED, FILE_FAILED_FLAG, ORDER_FAILED_FLAG, LINE_FAILED_FLAG, _FILE_NAME, EX_MESSAGE, "
			+ " EX_ALERT_TYPE, EXCEPTION_TYPE, EX_LOCATION ) "
			+ " VALUES (CURRENT_TIMESTAMP, CAST(CURRENT_TIMESTAMP AS DATE), ?, ?, ?, ?, ?, ?, ?, ?)";
	
	public boolean logEDIException(final List<EDIException> exeps) throws Exception {		
		if (exeps == null || exeps.size() == 0){
			
		throw new IllegalArgumentException("Unable to identify the ediException record.");
	}
			
	Connection conn      = null;
	PreparedStatement ps = null;
	ResultSet rs          = null;
	
	 try {		 
		 conn = DBConnectionFactory.getConnection( DBConnectionFactory.DBType.SQL_SERVER_DB );
		 
		
	 for(EDIException e : exeps) {
			 
		 ps = conn.prepareStatement(SQL_INSERT_EX, Statement.RETURN_GENERATED_KEYS);
		 
		 int index = 1;
		/* 
		 ps.setBoolean  (index++, e.isFileFailedFlag());
		 ps.setBoolean  (index++, e.isOrderFailedFlag());
		 ps.setBoolean  (index++, e.isLineFailedFlag());
	     ps.setString	(index++, e.getFileName());	
	     ps.setString	(index++, e.getMessage());	
	     ps.setString	(index++, e.getExAlerType());
		 ps.setString	(index++, e.getEdiExceptionType());
		 ps.setString	(index++, e.getExLocation());
		*/
		 
		 int status = ps.executeUpdate();
		 
		 
		 
	        if (status != 1) {
	        	throw new Exception("Unable to insert EDIOrderAudit.");
		        }
			
			 conn.commit();
			 
			 ps.close();
			 
			}
					 
		 }	
		 catch(Exception ex){
		 
			 System.out.println(ex.getMessage());		 
		 }
		 finally {
			 
			 DBUtil.closeIO(rs);			 
		 }
		 
		return true;		
	}			
}
		
