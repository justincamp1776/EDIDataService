package com.remichel.edi.dto;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.remichel.edi.model.EDI;
import com.remichel.edi.model.EDIEmailAddress;


@XmlRootElement(name="EDI")
public class EDIDTO {
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
	
	//private EDIExceptionDTO fileRejectedEx = null;
	//private long accountNumber;
	
	private List<EDIEmailAddressDTO> ediEmails;	
	
	public EDIDTO() {
	}
	
	public EDIDTO(final EDI model) {
		if (model == null) {
			return;
		}

		this.seqNum                = model.getSeqNum();
		this.name                  = model.getName();
		this.serverName            = model.getServerName();
		this.fileLocation810       = model.getFileLocation810();
		this.fileLocationBackup810 = model.getFileLocationBackup810();
		this.fileLocation850       = model.getFileLocation850();
		this.fileLocationBackup850 = model.getFileLocationBackup850();
		this.strEmailRecipients810 = model.getStrEmailRecipients810();
		this.strEmailRecipients850 = model.getStrEmailRecipients850();
		this.wasFileSentToday      = model.getWasFileSentToday();
		this.dateTimeFileSentToday = model.getDateTimeFileSentToday();
		this.ediFormat             = model.getEdiFormat();
		this.active                = model.isActive();
		this.mapCustPartNo         = model.isMapCustPartNo();
		this.tradingPartnerName    = model.getTradingPartnerName();
		this.ediCustomerBackupType = model.getEdiCustomerBackupType();
		this.emailAttachment       = model.getEmailAttachment();
		//this.accountNumber         = model.getAccountNumber();
		
		this.filePath 			   = model.getFilePath();
		this.fileSuccess 	   	   = model.isFileSuccess();
		this.hasFailedHDR 		   = model.isHasFailedHDR();
		this.orderDate             = model.getOrderDate();		
		
		this.exMessage             = model.getExMessage();
		this.exType                = model.getExType();
		this.exAlertType           = model.getExAlertType();
		this.exLocation            = model.getExLocation();
		
		
		
		this.ediEmails = new ArrayList<EDIEmailAddressDTO>();
        if (model.getEdiEmails() != null && !model.getEdiEmails().isEmpty()) {
	        for (EDIEmailAddress email : model.getEdiEmails()) {
	        	this.ediEmails.add(new EDIEmailAddressDTO(email));
	        }
        }
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

	public List<EDIEmailAddressDTO> getEdiEmails() {
		return ediEmails;
	}

	public void setEdiEmails(List<EDIEmailAddressDTO> ediEmails) {
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
