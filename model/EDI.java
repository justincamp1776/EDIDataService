package com.remichel.edi.model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.remichel.core.db.result.AbstractDBRecord;
import com.remichel.core.db.util.ResultSetHelper;
import com.remichel.edi.dto.EDIDTO;
import com.remichel.edi.dto.EDIEmailAddressDTO;


public class EDI extends AbstractDBRecord {

	private long seqNum;
	private String name;
	private String serverName;
	private String fileLocation810;
	private String fileLocationBackup810;
	private String fileLocation850;
	private String fileLocationBackup850;
	private String strEmailRecipients810;
	private String strEmailRecipients850;
	private boolean wasFileSentToday;
	private String dateTimeFileSentToday;	
	private String ediFormat;
	private boolean active;
	private boolean mapCustPartNo;
	private String tradingPartnerName;
	private String ediCustomerBackupType;
	private String emailAttachment;
	
	private String filePath;
	private boolean fileSuccess;
	private boolean hasFailedHDR;
	private String orderDate;
	
	private String exMessage;
	private String exType;
	private String exAlertType;
	private String exLocation;
	

	
	private List<EDIEmailAddress> ediEmails;
	
	public EDI() {		
	}	
		
	public EDI(final EDIDTO dto) {
		if (dto == null) {
			return;
		}

		this.seqNum                = dto.getSeqNum();
		this.name                  = dto.getName();
		this.serverName            = dto.getServerName();
		this.fileLocation810       = dto.getFileLocation810();
		this.fileLocationBackup810 = dto.getFileLocationBackup810();
		this.fileLocation850       = dto.getFileLocation850();
		this.fileLocationBackup850 = dto.getFileLocationBackup850();
		this.strEmailRecipients810 = dto.getStrEmailRecipients810();
		this.strEmailRecipients850 = dto.getStrEmailRecipients850();
		this.wasFileSentToday      = dto.getWasFileSentToday();
		this.dateTimeFileSentToday = dto.getDateTimeFileSentToday();	
		this.ediFormat             = dto.getEdiFormat();
		this.active                = dto.isActive();
		this.mapCustPartNo         = dto.isMapCustPartNo();
		this.tradingPartnerName    = dto.getTradingPartnerName();
		this.ediCustomerBackupType = dto.getEdiCustomerBackupType();
		this.emailAttachment       = dto.getEmailAttachment();
		//this.accountNumber         = dto.getAccountNumber();
		
		this.filePath 			   = dto.getFilePath();
		this.fileSuccess 	   	   = dto.isFileSuccess();
		this.hasFailedHDR 		   = dto.isHasFailedHDR();
		this.orderDate             = dto.getOrderDate();		
		this.exMessage             = dto.getExMessage();
		this.exType                = dto.getExType();
		this.exAlertType           = dto.getExAlertType();
		this.exLocation            = dto.getExLocation();
		
		
		
		//this.fileRejectedEx 	    = new EDIException(dto.getFileRejectedEx());
		
		
		this.ediEmails          = new ArrayList<EDIEmailAddress>();
		if (dto.getEdiEmails() != null && !dto.getEdiEmails().isEmpty()) {
	        for (EDIEmailAddressDTO email : dto.getEdiEmails()) {
	        	this.ediEmails.add(new EDIEmailAddress(email));
	        }
        }
	}

	@Override
	protected void fromRS(final ResultSet rs) throws Exception {
		this.seqNum 				= ResultSetHelper.getLong(rs, "SeqNum");
		this.name 					= ResultSetHelper.getString(rs, "Name");
		this.serverName 			= ResultSetHelper.getString(rs, "ServerName");
		this.fileLocationBackup810 	= ResultSetHelper.getString(rs, "FileLocationBackup810");
		this.fileLocation850 		= ResultSetHelper.getString(rs, "FileLocation850");
		this.fileLocationBackup850 	= ResultSetHelper.getString(rs, "FileLocationBackup850");
		this.strEmailRecipients810 	= ResultSetHelper.getString(rs, "strEmailRecipients810");
		this.strEmailRecipients850 	= ResultSetHelper.getString(rs, "strEmailRecipients850");
		this.wasFileSentToday	 	= ResultSetHelper.getBoolean(rs, "WasFileSentToday");
		this.dateTimeFileSentToday 	= ResultSetHelper.getString(rs, "DateTimeFileSentToday");
		this.ediFormat 				= ResultSetHelper.getString(rs, "EDIFormat");
		this.active 				= ResultSetHelper.getBoolean(rs, "Active");
		this.mapCustPartNo 			= ResultSetHelper.getBoolean(rs, "MapCustPartNo");
		this.tradingPartnerName 	= ResultSetHelper.getString(rs, "TradingPartnerName");
		this.ediCustomerBackupType  = ResultSetHelper.getString(rs, "EDICustomerBackupType");
		this.emailAttachment 		= ResultSetHelper.getString(rs, "EmailAttachment");
		//this.accountNumber 			= ResultSetHelper.getLong(rs, "AccountNumber");
	}

	public long getSeqNum() {
		return seqNum;
	}

	public void setSeqNum(long seqNum) {
		this.seqNum = seqNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getFileLocation810() {
		return fileLocation810;
	}

	public void setFileLocation810(String fileLocation810) {
		this.fileLocation810 = fileLocation810;
	}

	public String getFileLocationBackup810() {
		return fileLocationBackup810;
	}

	public void setFileLocationBackup810(String fileLocationBackup810) {
		this.fileLocationBackup810 = fileLocationBackup810;
	}

	public String getFileLocation850() {
		return fileLocation850;
	}

	public void setFileLocation850(String fileLocation850) {
		this.fileLocation850 = fileLocation850;
	}

	public String getFileLocationBackup850() {
		return fileLocationBackup850;
	}

	public void setFileLocationBackup850(String fileLocationBackup850) {
		this.fileLocationBackup850 = fileLocationBackup850;
	}

	public String getStrEmailRecipients810() {
		return strEmailRecipients810;
	}

	public void setStrEmailRecipients810(String strEmailRecipients810) {
		this.strEmailRecipients810 = strEmailRecipients810;
	}

	public String getStrEmailRecipients850() {
		return strEmailRecipients850;
	}

	public void setStrEmailRecipients850(String strEmailRecipients850) {
		this.strEmailRecipients850 = strEmailRecipients850;
	}

	public boolean getWasFileSentToday() {
		return wasFileSentToday;
	}

	public void setWasFileSentToday(boolean wasFileSentToday) {
		this.wasFileSentToday = wasFileSentToday;
	}

	public String getDateTimeFileSentToday() {
		return dateTimeFileSentToday;
	}

	public void setDateTimeFileSentToday(String dateTimeFileSentToday) {
		this.dateTimeFileSentToday = dateTimeFileSentToday;
	}

	public String getEdiFormat() {
		return ediFormat;
	}

	public void setEdiFormat(String ediFormat) {
		this.ediFormat = ediFormat;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	public boolean isMapCustPartNo() {
		return mapCustPartNo;
	}

	public void setMapCustPartNo(boolean mapCustPartNo) {
		this.mapCustPartNo = mapCustPartNo;
	}

	public String getTradingPartnerName() {
		return tradingPartnerName;
	}

	public void setTradingPartnerName(String tradingPartnerName) {
		this.tradingPartnerName = tradingPartnerName;
	}

	public List<EDIEmailAddress> getEdiEmails() {
		return ediEmails;
	}

	public void setEdiEmails(List<EDIEmailAddress> ediEmails) {
		this.ediEmails = ediEmails;
	}
	
	public String getEdiCustomerBackupType() {
		return ediCustomerBackupType;
	}

	public void setEdiCustomerBackupType(String ediCustomerBackupType) {
		this.ediCustomerBackupType = ediCustomerBackupType;
	}

	public String getEmailAttachment() {
		return emailAttachment;
	}

	public void setEmailAttachment(String emailAttachment) {
		this.emailAttachment = emailAttachment;
	}


	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}


	public boolean isHasFailedHDR() {
		return hasFailedHDR;
	}

	public void setHasFailedHDR(boolean hasFailedHDR) {
		this.hasFailedHDR = hasFailedHDR;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
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

	public boolean isFileSuccess() {
		return fileSuccess;
	}

	public void setFileSuccess(boolean fileSuccess) {
		this.fileSuccess = fileSuccess;
	}

}
