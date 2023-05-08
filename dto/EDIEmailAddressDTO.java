package com.remichel.edi.dto;

import javax.xml.bind.annotation.XmlRootElement;

import com.remichel.edi.model.EDIEmailAddress;



@XmlRootElement(name="EDIEmailAddress")
public class EDIEmailAddressDTO {

	private long emailId;
	private long ediSeqNum;
	private long companyNumber;
	private String addressType;
	private long ediType;
	private String emailAddress;
	private String testEmail;
	
	public EDIEmailAddressDTO() {		
	}
	
	public EDIEmailAddressDTO(final EDIEmailAddress model) {
		if (model == null) {
			return;
		}
	
		this.emailId 		= model.getEmailId();
		this.ediSeqNum 		= model.getEdiSeqNum();
		this.companyNumber 	= model.getCompanyNumber();
		this.addressType 	= model.getAddressType();
		this.ediType 		= model.getEdiType();
		this.emailAddress 	= model.getEmailAddress();
		this.testEmail 		= model.getTestEmail();
	}
	
	
	public long getEmailId(){
		return emailId;
	}
	
	public void setEmailId(long emailId) {
		this.emailId = emailId;
	}
		
	public long getEdiSeqNum(){
		return ediSeqNum;
	}

	public void setEdiSeqNum(long ediSeqNum) {
		this.ediSeqNum = ediSeqNum;
	}

	public long getCompanyNumber(){
		return companyNumber;
	}

	public void setCompanyNumber(long companyNumber) {
		this.companyNumber = companyNumber;
	}

	public String getAddressType(){
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public long getEdiType(){
		return ediType;
	}

	public void setEdiType(long ediType) {
		this.ediType = ediType;
	}

	public String getEmailAddress(){
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getTestEmail() {
		return testEmail;
	}
	
	public void setTestEmail(String testEmail) {
		this.testEmail = testEmail;
	}  
}
