package com.remichel.edi.dto;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

import com.remichel.edi.model.EDIOELine;

@XmlRootElement(name="EDIOELine")
public class EDIOELineDTO {

	private String importSetNumber;
	private int    lineNo;
	private String itemID;
	private long unitQuantity;
	private String unitofMeasure;
	private BigDecimal  unitPrice;
	private int    sourceLocationID;
	private int    shipLocationID;
	private String productGroupID;
	private int    supplierID;
	private String supplierName;
	private String requiredDate;
	private String expediteDate;
	private String willCall;
	private String taxItem;
	private String oKtoInterchange; 
	private String pricingUnit;
	private BigDecimal  commissionCost;
	private BigDecimal  otherCost;
	private BigDecimal  pOCost;
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
    private String extendedDescription;
    private String exMessage;
	private String exType;
	private String exAlertType;
	private String exLocation;
    
    private boolean lineSuccess;

    
    public EDIOELineDTO() {}
    
	public EDIOELineDTO(final EDIOELine model) {		
		if (model == null) {
			return;
		}

		this.importSetNumber 		= model.getImportSetNumber();
		this.lineNo 				= model.getLineNo();
		this.itemID 				= model.getItemID();
		this.unitQuantity 			= model.getUnitQuantity();
		this.unitofMeasure 			= model.getUnitofMeasure();
		this.unitPrice 				= model.getUnitPrice();
		this.sourceLocationID 		= model.getSourceLocationID();
		this.shipLocationID 		= model.getShipLocationID();
		this.productGroupID 		= model.getProductGroupID();
		this.supplierID 			= model.getSupplierID();
		this.supplierName 			= model.getSupplierName();
		this.requiredDate 			= model.getRequiredDate();
		this.expediteDate 			= model.getExpediteDate();
		this.willCall 				= model.getWillCall();
		this.taxItem 				= model.getTaxItem();
		this.oKtoInterchange 		= model.getOKtoInterchange();
		this.pricingUnit 			= model.getPricingUnit();
		this.commissionCost	 		= model.getCommissionCost();
		this.otherCost 				= model.getOtherCost();
		this.pOCost 				= model.getPOCost();
		this.disposition 			= model.getDisposition();
		this.scheduled 				= model.getScheduled();
		this.manualPriceOverride 	= model.getManualPriceOverride();
		this.commissionCostEdited 	= model.getCommissionCostEdited();
		this.otherCostEdited 		= model.getOtherCostEdited();
		this.captureUsage 			= model.getCaptureUsage();
		this.tagandHoldClassID 		= model.getTagandHoldClassID();
		this.contractBinID 			= model.getContractBinID();
		this.contractNo	 			= model.getContractNo();
		this.allocationQty 			= model.getAllocationQty();
		this.promiseDate 			= model.getPromiseDate();
		this.revisionLevel 			= model.getRevisionLevel();
		this.resolveItemContract 	= model.getResolveItemContract();
		this.sample 				= model.getSample();
		this.quoteLineNo 			= model.getQuoteLineNo();
		this.quoteComplete 			= model.getQuoteComplete();
		this.itemDescription 		= model.getItemDescription();
		this.invoiceNo 				= model.getInvoiceNo();
		this.invoiceLineNo 			= model.getInvoiceLineNo();
		this.extendedDescription     = model.getExtendedDescription();
		this.exMessage             	= model.getExMessage();
		this.exType                	= model.getExType();
		this.exAlertType           	= model.getExAlertType();
		this.exLocation            	= model.getExLocation();
		
		this.lineSuccess     	= model.isLineSuccess();

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

	public String getoKtoInterchange() {
		return oKtoInterchange;
	}

	public void setoKtoInterchange(String oKtoInterchange) {
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

	public BigDecimal getpOCost() {
		return pOCost;
	}

	public void setpOCost(BigDecimal pOCost) {
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