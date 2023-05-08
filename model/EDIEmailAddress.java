package com.remichel.edi.model;

import java.sql.ResultSet;

import com.remichel.core.db.result.AbstractDBRecord;
import com.remichel.core.db.util.ResultSetHelper;
import com.remichel.core.util.Util;
import com.remichel.edi.dto.EDIEmailAddressDTO;


public class EDIEmailAddress extends AbstractDBRecord{

	private long emailId;
	private long ediSeqNum;
	private long companyNumber;
	private String addressType;
	private long ediType;
	private String emailAddress;
	private String testEmail;
	
	public EDIEmailAddress() {		
	}
	
	public EDIEmailAddress(final EDIEmailAddressDTO dto) {
		if (dto == null) {
			return;
		}
		
		this.emailId 		= dto.getEmailId();
		this.ediSeqNum	 	= dto.getEdiSeqNum();
		this.companyNumber 	= dto.getCompanyNumber();
		this.addressType 	= dto.getAddressType();
		this.ediType 		= dto.getEdiType();
		this.emailAddress 	= dto.getEmailAddress();
		this.testEmail 		= dto.getTestEmail();
	}
	
	@Override
	protected void fromRS(final ResultSet rs) throws Exception {
		this.emailId 		= ResultSetHelper.getLong(rs, "EMAIL_ID");
		this.ediSeqNum 		= ResultSetHelper.getLong(rs, "EDI_SEQNUM");
		this.companyNumber 	= ResultSetHelper.getLong(rs, "COMPANY_NUMBER");
		String addressType 	= ResultSetHelper.getString(rs, "ADDRESS_TYPE");
		this.addressType 	= (Util.isStringEmpty(addressType) ? addressType : addressType.toUpperCase());
		this.ediType 		= ResultSetHelper.getLong(rs, "EDI_TYPE");
		this.emailAddress 	= ResultSetHelper.getString(rs, "EMAIL_ADDRESS");
		this.testEmail 		= ResultSetHelper.getString(rs, "TEST_EMAIL");
	}	
	
	public long getEmailId() {
		return emailId;
	}
	
	public void setEmailId(long emailId) {
		this.emailId = emailId;
	}
		
	public long getEdiSeqNum() {
		return ediSeqNum;
		}

	public void setEdiSeqNum(long ediSeqNum) {
		this.ediSeqNum = ediSeqNum;
	}

	public long getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(long companyNumber) {
		this.companyNumber = companyNumber;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public long getEdiType() {
		return ediType;
	}

	public void setEdiType(long ediType) {
		this.ediType = ediType;
	}

	public String getEmailAddress() {
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
