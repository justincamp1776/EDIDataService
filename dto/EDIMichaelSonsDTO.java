package com.remichel.edi.dto;

import javax.xml.bind.annotation.XmlRootElement;

import com.remichel.edi.model.EDIMichaelSons;

@XmlRootElement(name="EDIMichaelSon")
public class EDIMichaelSonsDTO {

	private long	dateSentInFile;
	private String  poNumber;
	private String 	companyCode;
	private long  	accountNumber;
	private String 	accountCity;
	private long 	branchNumber;
	private String	truckNumber;
	private String	remPartNumber;
	private String	customerPartNumber;
	private long	quantityOrdered;
	private String	fileName;

	

	
	public EDIMichaelSonsDTO() {
		
	}
	
	public EDIMichaelSonsDTO (final EDIMichaelSons model) {
		if (model == null) {
			return;
		}
		
		this.dateSentInFile 	= model.getDateSentInFile();
		this.poNumber 			= model.getPONumber();
		this.accountNumber 		= model.getAccountNumber();
		this.accountCity   		= model.getAccountCity();
		this.branchNumber 		= model.getBranchNumber();
		this.companyCode 		= model.getCompanyCode();
		this.truckNumber 		= model.getTruckNumber();
		this.remPartNumber 		= model.getREMPartNumber();
		this.customerPartNumber = model.getCustomerPartNumber();
		this.quantityOrdered 	= model.getQuantityOrdered();
		this.fileName 			= model.getFileName();
				
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getAccountCity() {
		return accountCity;
	}


	public void setAccountCity(String accountCity) {
		this.accountCity = accountCity;
	}


	public long getBranchNumber() {
		return branchNumber;
	}


	public void setBranchNumber(long branchNumber) {
		this.branchNumber = branchNumber;
	}


	public String getCompanyCode() {
		return companyCode;
	}


	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public long getDateSentInFile() {
		return dateSentInFile;
	}

	public void setDateSentInFile(long dateSentInFile) {
		this.dateSentInFile = dateSentInFile;
	}

	public String getPONumber() {
		return poNumber;
	}

	public void setPONumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public String getTruckNumber() {
		return truckNumber;
	}

	public void setTruckNumber(String truckNumber) {
		this.truckNumber = truckNumber;
	}

	public String getREMPartNumber() {
		return remPartNumber;
	}

	public void setREMPartNumber(String remPartNumber) {
		this.remPartNumber = remPartNumber;
	}

	public String getCustomerPartNumber() {
		return customerPartNumber;
	}

	public void setCustomerPartNumber(String customerPartNumber) {
		this.customerPartNumber = customerPartNumber;
	}

	public long getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(long quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}	
}
