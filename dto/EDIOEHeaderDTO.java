package com.remichel.edi.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.remichel.edi.model.EDIOEHeader;
import com.remichel.edi.model.EDIOELine;


@XmlRootElement(name="EDIOEHeader")
public class EDIOEHeaderDTO  {
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
                
	private List<EDIOELineDTO> oeLine;
		
	private String truck; 
	private String companyCode; 
	private boolean hdrSuccess;
	private boolean hasRejectedLines;
	private String exMessage;
	private String exType;
	private String exAlertType;
	private String exLocation;
	
	
	public EDIOEHeaderDTO() {}
	
	public EDIOEHeaderDTO(final EDIOEHeader model) {
		if (model == null) {
			return;
		}

		this.importSetNo 				= model.getImportSetNo();
		this.customerID			 		= model.getCustomerID();
		this.customerName 				= model.getCustomerName();
		this.companyID 					= model.getCompanyID();
		this.salesLocationID 			= model.getSalesLocationID();
		this.customerPONumber 			= model.getCustomerPONumber();
		this.contactID 					= model.getContactID();
		this.contactName 				= model.getContactName();
		this.taker 						= model.getTaker();
		this.jobName 					= model.getJobName();
		this.orderDate 					= model.getOrderDate();			
		this.approved 					= model.getApproved();
		this.shipToID 					= model.getShipToID();
		this.shipToName 				= model.getShipToName();		
		this.sourceLocationID 			= model.getSourceLocationID();
		this.carrierID 					= model.getCarrierID();
		this.carrierName 				= model.getCarrierName();		
		this.captureUsageDefault 		= model.getCaptureUsageDefault();		
		this.truck 				        = model.getTruck();
		this.companyCode  				= model.getCompanyCode();
		this.hdrSuccess 				= model.isHdrSuccess();
		this.hasRejectedLines 	        = model.isHasRejectedLines();
		this.exMessage             		= model.getExMessage();
		this.exType                		= model.getExType();
		this.exAlertType           		= model.getExAlertType();
		this.exLocation            		= model.getExLocation();
		
		
		
		this.oeLine = new ArrayList<EDIOELineDTO>();		
		if (model.getOELine() != null && !model.getOELine().isEmpty()) {
			for (EDIOELine line : model.getOELine()) {
				this.oeLine.add(new EDIOELineDTO(line));
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

	
	public List<EDIOELineDTO> getOELine() {
		return oeLine;
	}

	public void setOELine(List<EDIOELineDTO> oeLine) {
		this.oeLine = oeLine;
	}
	
	public List<EDIOELineDTO> getOeLine() {
		return oeLine;
	}

	public void setOeLine(List<EDIOELineDTO> oeLine) {
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