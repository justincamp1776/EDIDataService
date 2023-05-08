package com.remichel.edi.model;

import java.util.ArrayList;
import java.util.List;

import com.remichel.edi.dto.EDIAuditDTO;
import com.remichel.edi.dto.EDIOEHeaderDTO;


public class EDIAudit {
	private EDI ediRec;
	private List<EDIOEHeader> orders;	
	
	public EDIAudit() { }	
	
	public EDIAudit(EDIAuditDTO dto) {		
		if(dto == null) {
			return;
		}

		this.ediRec = new EDI(dto.getEdiRec());
		
		this.orders = new ArrayList<EDIOEHeader>();
		
		if (dto.getOrders() != null && !dto.getOrders().isEmpty()) {
			for (EDIOEHeaderDTO hdr : dto.getOrders()) {
				
				this.orders.add(new EDIOEHeader(hdr));
			}
		}
	}

	public List<EDIOEHeader> getOrders() {
		return orders;
	}

	public void Orders(List<EDIOEHeader> ords) {
		this.orders = ords;
	}

	public EDI getEdiRec() {
		return ediRec;
	}

	public void setEdiRec(EDI ediRec) {
		this.ediRec = ediRec;
	}
}