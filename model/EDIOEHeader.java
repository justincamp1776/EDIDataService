package com.remichel.edi.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.remichel.edi.dto.EDIOEHeaderDTO;
import com.remichel.edi.dto.EDIOELineDTO;

public class EDIOEHeader {
	private String importSetNo;                   
	private BigDecimal   customerID;                           
	private String customerName;                        
	private String companyID;                             
	private BigDecimal salesLocationID;             
	private String customerPONumber;              
	private String contactID;                        
	private String contactName;         
	private String taker;                               
	private String jobName;                           
	private String orderDate;                                     
	private String approved;                  
	private long   shipToID;                   
	private String shipToName;                          
	private String sourceLocationID;               
	private String carrierID;                          
	private String carrierName;                          
	private String captureUsageDefault;                

	private List<EDIOELine> oeLine;
			
	//These fields are not included in the P21 Order Header
	private String truck;    
	private String companyCode;  
	private boolean hdrSuccess;
	private boolean hasRejectedLines;
	private String exMessage;
	private String exType;
	private String exAlertType;
	private String exLocation;


	public EDIOEHeader() { }
	

	public EDIOEHeader(final EDIOEHeaderDTO dto) {
		if (dto == null) {
			return;
		}

		this.importSetNo 				= dto.getImportSetNo();
		this.customerID 				= dto.getCustomerID();
		this.customerName 				= dto.getCustomerName();
	    this.companyID 					= dto.getCompanyID();
		this.salesLocationID 			= dto.getSalesLocationID();
		this.customerPONumber 			= dto.getCustomerPONumber();
		this.contactID 					= dto.getContactID();
		this.contactName 				= dto.getContactName();
		this.taker 						= dto.getTaker();
		this.jobName 					= dto.getJobName();
		this.orderDate 					= dto.getOrderDate();	   
		this.approved 					= dto.getApproved();
		this.shipToID 					= dto.getShipToID();
		this.shipToName 				= dto.getShipToName();		
		this.sourceLocationID 			= dto.getSourceLocationID();
		this.carrierID 					= dto.getCarrierID();
		this.carrierName 				= dto.getCarrierName();		
		this.captureUsageDefault 		= dto.getCaptureUsageDefault();				
		this.truck 				        = dto.getTruck();
		this.companyCode  				= dto.getCompanyCode();
		this.hdrSuccess 				= dto.isHdrSuccess();
		this.hasRejectedLines 	        = dto.isHasRejectedLines();
		this.exMessage             		= dto.getExMessage();
		this.exType                		= dto.getExType();
		this.exAlertType           		= dto.getExAlertType();
		this.exLocation            		= dto.getExLocation();
		
		
		this.oeLine = new ArrayList<EDIOELine>();
		if (dto.getOELine() != null && !dto.getOELine().isEmpty()) {
			for (EDIOELineDTO line : dto.getOELine()) {
				
				this.oeLine.add(new EDIOELine(line));
			}
		}
	}
	
	
	public String getImportSetNo() {
		return importSetNo;
	}

	public void setImportSetNo(String importSetNo) {
		this.importSetNo = importSetNo;
	}

	public BigDecimal getCustomerID() {
		return customerID;
	}

	public void setCustomerID(BigDecimal customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCompanyID() {
		return companyID;
	}

	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}

	public BigDecimal getSalesLocationID() {
		return salesLocationID;
	}

	public void setSalesLocationID(BigDecimal salesLocationID) {
		this.salesLocationID = salesLocationID;
	}

	public String getCustomerPONumber() {
		return customerPONumber;
	}

	public void setCustomerPONumber(String customerPONumber) {
		this.customerPONumber = customerPONumber;
	}

	public String getContactID() {
		return contactID;
	}

	public void setContactID(String contactID) {
		this.contactID = contactID;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getTaker() {
		return taker;
	}

	public void setTaker(String taker) {
		this.taker = taker;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}

	public long getShipToID() {
		return shipToID;
	}

	public void setShipToID(long shipToID) {
		this.shipToID = shipToID;
	}

	public String getShipToName() {
		return shipToName;
	}

	public void setShipToName(String shipToName) {
		this.shipToName = shipToName;
	}

	public String getSourceLocationID() {
		return sourceLocationID;
	}

	public void setSourceLocationID(String sourceLocationID) {
		this.sourceLocationID = sourceLocationID;
	}

	public String getCarrierID() {
		return carrierID;
	}

	public void setCarrierID(String carrierID) {
		this.carrierID = carrierID;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getCaptureUsageDefault() {
		return captureUsageDefault;
	}

	public void setCaptureUsageDefault(String captureUsageDefault) {
		this.captureUsageDefault = captureUsageDefault;
	}
	
	public List<EDIOELine> getOELine() {
		return oeLine;
	}

	public void setOELine(List<EDIOELine> oeLine) {
		this.oeLine = oeLine;
	}
	
	public List<EDIOELine> getOeLine() {
		return oeLine;
	}

	public void setOeLine(List<EDIOELine> oeLine) {
		this.oeLine = oeLine;
	}

	public String getTruck() {
		return truck;
	}

	public void setTruck(String truck) {
		this.truck = truck;
	}
	

	public boolean isHdrSuccess() {
		return hdrSuccess;
	}


	public void setHdrSuccess(boolean hdrSuccess) {
		this.hdrSuccess = hdrSuccess;
	}


	public boolean isHasRejectedLines() {
		return hasRejectedLines;
	}

	public void setHasRejectedLines(boolean hasRejectedLines) {
		this.hasRejectedLines = hasRejectedLines;
	}

	public String getExMessage() {
		return exMessage;
	}


	public void setExMessage(String exMessage) {
		this.exMessage = exMessage;
	}


	public String getExType() {
		return exType;
	}


	public void setExType(String exType) {
		this.exType = exType;
	}


	public String getExAlertType() {
		return exAlertType;
	}


	public void setExAlertType(String exAlertType) {
		this.exAlertType = exAlertType;
	}


	public String getExLocation() {
		return exLocation;
	}


	public void setExLocation(String exLocation) {
		this.exLocation = exLocation;
	}


	public String getCompanyCode() {
		return companyCode;
	}


	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	
	
		
}