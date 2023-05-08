package com.remichel.edi.dto;

import com.remichel.edi.model.EDIOERecord;

public class EDIOERecordDTO {

		private long ediSeqNum;
		private boolean fileFailedFlag;
		private boolean hdrFailedFlag;
		private boolean lineFailedFlag;
		private String fileName;
		private String orderDate;
		private String customerPO;
		private String truck;
		private String itemID;
		private String custPartNo;
		private long   qty;
		private String companyNo;
		private String jobName;

		
		public EDIOERecordDTO(final EDIOERecord model) {
			if (model == null) {
				return;
			}
			
			this.ediSeqNum = model.getEdiSeqNum();
			this.fileFailedFlag = model.isFileFailedFlag();
			this.hdrFailedFlag = model.isHdrFailedFlag();
			this.lineFailedFlag = model.isLineFailedFlag();
			this.fileName = model.getFileName();
			this.orderDate = model.getOrderDate();
			this.customerPO = model.getCustomerPO();
			this.truck = model.getTruck();
			this.itemID = model.getItemID();
			this.custPartNo = model.getCustPartNo();
			this.qty = model.getQty();
			this.companyNo = model.getCompanyNo();
			this.jobName = model.getJobName();

		}

		public long getEdiSeqNum() {
			return ediSeqNum;
		}

		public void setEdiSeqNum(long ediSeqNum) {
			this.ediSeqNum = ediSeqNum;
		}

		public boolean isFileFailedFlag() {
			return fileFailedFlag;
		}

		public void setFileFailedFlag(boolean fileFailedFlag) {
			this.fileFailedFlag = fileFailedFlag;
		}

		public boolean isHdrFailedFlag() {
			return hdrFailedFlag;
		}

		public void setHdrFailedFlag(boolean hdrFailedFlag) {
			this.hdrFailedFlag = hdrFailedFlag;
		}

		public boolean isLineFailedFlag() {
			return lineFailedFlag;
		}

		public void setLineFailedFlag(boolean lineFailedFlag) {
			this.lineFailedFlag = lineFailedFlag;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(String orderDate) {
			this.orderDate = orderDate;
		}

		public String getCustomerPO() {
			return customerPO;
		}

		public void setCustomerPO(String customerPO) {
			this.customerPO = customerPO;
		}

		public String getTruck() {
			return truck;
		}

		public void setTruck(String truck) {
			this.truck = truck;
		}

		public String getItemID() {
			return itemID;
		}

		public void setItemID(String itemID) {
			this.itemID = itemID;
		}

		public String getCustPartNo() {
			return custPartNo;
		}

		public void setCustPartNo(String custPartNo) {
			this.custPartNo = custPartNo;
		}

		public long getQty() {
			return qty;
		}

		public void setQty(long qty) {
			this.qty = qty;
		}

		public String getCompanyNo() {
			return companyNo;
		}

		public void setCompanyNo(String companyNo) {
			this.companyNo = companyNo;
		}

		public String getJobName() {
			return jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		
}
