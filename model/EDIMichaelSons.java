package com.remichel.edi.model;

import java.sql.ResultSet;

import com.remichel.core.db.result.AbstractDBRecord;
import com.remichel.core.db.util.ResultSetHelper;
import com.remichel.edi.dto.EDIMichaelSonsDTO;

public class EDIMichaelSons extends AbstractDBRecord {

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
	
	//private List<EDIOEHeader> orders;
	
	public EDIMichaelSons() {
		
	}
	
	public EDIMichaelSons (final EDIMichaelSonsDTO dto) {
		if (dto == null) {
			return;
		}
		
		this.dateSentInFile 	= dto.getDateSentInFile();
		this.poNumber 			= dto.getPONumber();
		this.accountNumber 		= dto.getAccountNumber();
		this.accountCity   		= dto.getAccountCity();
		this.branchNumber 		= dto.getBranchNumber();
		this.companyCode 		= dto.getCompanyCode();
		this.truckNumber 		= dto.getTruckNumber();
		this.remPartNumber 		= dto.getREMPartNumber();
		this.customerPartNumber = dto.getCustomerPartNumber();
		this.quantityOrdered 	= dto.getQuantityOrdered();
		this.fileName 			= dto.getFileName();
				
	}
	
	
	@Override
	protected void fromRS(final ResultSet rs) throws Exception {
						
		this.dateSentInFile 	= ResultSetHelper.getLong(rs, "DateSentInFile");	
		this.poNumber 			= ResultSetHelper.getString(rs, "PONumber");	
		this.accountNumber 		= ResultSetHelper.getLong(rs, "AccountNumber");
		this.accountCity 		= ResultSetHelper.getString(rs, "AccountCity");
		this.branchNumber 		= ResultSetHelper.getLong(rs, "BranchNumber");
		this.companyCode 		= ResultSetHelper.getString(rs, "CompanyCode");	
		this.truckNumber 		= ResultSetHelper.getString(rs, "TruckNumber");	
		this.remPartNumber 		= ResultSetHelper.getString(rs, "REMPartNumber");	
		this.customerPartNumber = ResultSetHelper.getString(rs, "CustomerPartNumber");	
		this.quantityOrdered 	= ResultSetHelper.getLong(rs, "QuantityOrdered");	
		this.fileName 			= ResultSetHelper.getString(rs, "FileName");	
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
