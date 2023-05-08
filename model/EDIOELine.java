package com.remichel.edi.model;

import java.math.BigDecimal;

import com.remichel.edi.dto.EDIOELineDTO;

public class EDIOELine {	
	private String importSetNumber;
	private int     lineNo;
	private String itemID;
	private long unitQuantity;
	private String unitofMeasure;
	private BigDecimal  unitPrice;
	private int    sourceLocationID;
	private int     shipLocationID;
	private String productGroupID;
	private int    supplierID;
	private String supplierName;
	private String requiredDate;
	private String expediteDate;
	private String willCall;
	private String taxItem;
	private String oKtoInterchange; 
	private String pricingUnit;
	private BigDecimal commissionCost;
	private BigDecimal otherCost;
	private BigDecimal pOCost;
	private String disposition;
	private String scheduled;
	private String manualPriceOverride;
    private String commissionCostEdited;
    private String otherCostEdited;
    private String captureUsage;
    private String tagandHoldClassID;
    private String contractBinID;
    private String contractNo;
    private int    allocationQty;
    private String promiseDate;
    private String revisionLevel;
    private String resolveItemContract;
    private String sample;
    private String quoteLineNo;
    private String quoteComplete;
    private String itemDescription;
    private String invoiceNo;
    private String invoiceLineNo;
    // customer part number below:
    private String extendedDescription;
    private String exMessage;
	private String exType;
	private String exAlertType;
	private String exLocation;
	
    private boolean lineSuccess;

    
    public EDIOELine() { }
    
	public EDIOELine(final EDIOELineDTO dto) {		
		if (dto == null) {
			return;
		}

		this.importSetNumber 		= dto.getImportSetNumber();
		this.lineNo 				= dto.getLineNo();
		this.itemID 				= dto.getItemID();
		this.unitQuantity 			= dto.getUnitQuantity();
		this.unitofMeasure 			= dto.getUnitofMeasure();
		this.unitPrice 				= dto.getUnitPrice();
		this.sourceLocationID 		= dto.getSourceLocationID();
		this.shipLocationID 		= dto.getShipLocationID();
		this.productGroupID 		= dto.getProductGroupID();
		this.supplierID 			= dto.getSupplierID();
		this.supplierName 			= dto.getSupplierName();
		this.requiredDate 			= dto.getRequiredDate();
		this.expediteDate 			= dto.getExpediteDate();
		this.willCall 				= dto.getWillCall();
		this.taxItem 				= dto.getTaxItem();
		this.oKtoInterchange 		= dto.getoKtoInterchange();
		this.pricingUnit 			= dto.getPricingUnit();
		this.commissionCost	 		= dto.getCommissionCost();
		this.otherCost 				= dto.getOtherCost();
		this.pOCost 				= dto.getpOCost();
		this.disposition 			= dto.getDisposition();
		this.scheduled 				= dto.getScheduled();
		this.manualPriceOverride 	= dto.getManualPriceOverride();
		this.commissionCostEdited 	= dto.getCommissionCostEdited();
		this.otherCostEdited 		= dto.getOtherCostEdited();
		this.captureUsage 			= dto.getCaptureUsage();
		this.tagandHoldClassID 		= dto.getTagandHoldClassID();
		this.contractBinID 			= dto.getContractBinID();
		this.contractNo	 			= dto.getContractNo();
		this.allocationQty 			= dto.getAllocationQty();
		this.promiseDate 			= dto.getPromiseDate();
		this.revisionLevel 			= dto.getRevisionLevel();
		this.resolveItemContract 	= dto.getResolveItemContract();
		this.sample 				= dto.getSample();
		this.quoteLineNo 			= dto.getQuoteLineNo();
		this.quoteComplete 			= dto.getQuoteComplete();
		this.itemDescription 		= dto.getItemDescription();
		this.invoiceNo 				= dto.getInvoiceNo();
		this.invoiceLineNo 			= dto.getInvoiceLineNo();
		this.extendedDescription     = dto.getExtendedDescription();
		this.exMessage             	= dto.getExMessage();
		this.exType                	= dto.getExType();
		this.exAlertType           	= dto.getExAlertType();
		this.exLocation            	= dto.getExLocation();
		
		this.lineSuccess     		= dto.isLineSuccess();
	}

	public String getImportSetNumber() {
		return importSetNumber;
	}

	public void setImportSetNumber(String importSetNumber) {
		this.importSetNumber = importSetNumber;
	}

	public int getLineNo() {
		return lineNo;
	}

	public void setLineNo(int lineNo) {
		this.lineNo = lineNo;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public long getUnitQuantity() {
		return unitQuantity;
	}

	public void setUnitQuantity(long unitQuantity) {
		this.unitQuantity = unitQuantity;
	}

	public String getUnitofMeasure() {
		return unitofMeasure;
	}

	public void setUnitofMeasure(String unitofMeasure) {
		this.unitofMeasure = unitofMeasure;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getSourceLocationID() {
		return sourceLocationID;
	}

	public void setSourceLocationID(int sourceLocationID) {
		this.sourceLocationID = sourceLocationID;
	}

	public int getShipLocationID() {
		return shipLocationID;
	}

	public void setShipLocationID(int shipLocationID) {
		this.shipLocationID = shipLocationID;
	}

	public String getProductGroupID() {
		return productGroupID;
	}

	public void setProductGroupID(String productGroupID) {
		this.productGroupID = productGroupID;
	}

	public int getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(String requiredDate) {
		this.requiredDate = requiredDate;
	}


	public String getExpediteDate() {
		return expediteDate;
	}

	public void setExpediteDate(String expediteDate) {
		this.expediteDate = expediteDate;
	}

	public String getWillCall() {
		return willCall;
	}

	public void setWillCall(String willCall) {
		this.willCall = willCall;
	}

	public String getTaxItem() {
		return taxItem;
	}

	public void setTaxItem(String taxItem) {
		this.taxItem = taxItem;
	}

	public String getOKtoInterchange() {
		return oKtoInterchange;
	}

	public void setOKtoInterchange(String oKtoInterchange) {
		this.oKtoInterchange = oKtoInterchange;
	}

	public String getPricingUnit() {
		return pricingUnit;
	}

	public void setPricingUnit(String pricingUnit) {
		this.pricingUnit = pricingUnit;
	}

	public BigDecimal getCommissionCost() {
		return commissionCost;
	}

	public void setCommissionCost(BigDecimal commissionCost) {
		this.commissionCost = commissionCost;
	}

	public BigDecimal getOtherCost() {
		return otherCost;
	}

	public void setOtherCost(BigDecimal otherCost) {
		this.otherCost = otherCost;
	}

	public BigDecimal getPOCost() {
		return pOCost;
	}

	public void setPOCost(BigDecimal pOCost) {
		this.pOCost = pOCost;
	}

	public String getDisposition() {
		return disposition;
	}

	public void setDisposition(String disposition) {
		this.disposition = disposition;
	}

	public String getScheduled() {
		return scheduled;
	}

	public void setScheduled(String scheduled) {
		this.scheduled = scheduled;
	}

	public String getManualPriceOverride() {
		return manualPriceOverride;
	}

	public void setManualPriceOverride(String manualPriceOverride) {
		this.manualPriceOverride = manualPriceOverride;
	}

	public String getCommissionCostEdited() {
		return commissionCostEdited;
	}

	public void setCommissionCostEdited(String commissionCostEdited) {
		this.commissionCostEdited = commissionCostEdited;
	}

	public String getOtherCostEdited() {
		return otherCostEdited;
	}

	public void setOtherCostEdited(String otherCostEdited) {
		this.otherCostEdited = otherCostEdited;
	}

	public String getCaptureUsage() {
		return captureUsage;
	}

	public void setCaptureUsage(String captureUsage) {
		this.captureUsage = captureUsage;
	}

	public String getTagandHoldClassID() {
		return tagandHoldClassID;
	}

	public void setTagandHoldClassID(String tagandHoldClassID) {
		this.tagandHoldClassID = tagandHoldClassID;
	}

	public String getContractBinID() {
		return contractBinID;
	}

	public void setContractBinID(String contractBinID) {
		this.contractBinID = contractBinID;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public int getAllocationQty() {
		return allocationQty;
	}

	public void setAllocationQty(int allocationQty) {
		this.allocationQty = allocationQty;
	}

	public String getPromiseDate() {
		return promiseDate;
	}

	public void setPromiseDate(String promiseDate) {
		this.promiseDate = promiseDate;
	}

	public String getRevisionLevel() {
		return revisionLevel;
	}

	public void setRevisionLevel(String revisionLevel) {
		this.revisionLevel = revisionLevel;
	}

	public String getResolveItemContract() {
		return resolveItemContract;
	}

	public void setResolveItemContract(String resolveItemContract) {
		this.resolveItemContract = resolveItemContract;
	}

	public String getSample() {
		return sample;
	}

	public void setSample(String sample) {
		this.sample = sample;
	}

	public String getQuoteLineNo() {
		return quoteLineNo;
	}

	public void setQuoteLineNo(String quoteLineNo) {
		this.quoteLineNo = quoteLineNo;
	}

	public String getQuoteComplete() {
		return quoteComplete;
	}

	public void setQuoteComplete(String quoteComplete) {
		this.quoteComplete = quoteComplete;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceLineNo() {
		return invoiceLineNo;
	}

	public void setInvoiceLineNo(String invoiceLineNo) {
		this.invoiceLineNo = invoiceLineNo;
	}

	public boolean isLineSuccess() {
		return lineSuccess;
	}

	public void setLineSuccess(boolean lineSuccess) {
		this.lineSuccess = lineSuccess;
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

	public String getExtendedDescription() {
		return extendedDescription;
	}

	public void setExtendedDescription(String extendedDescription) {
		this.extendedDescription = extendedDescription;
	}  
	
	
}