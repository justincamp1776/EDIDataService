package com.remichel.edi.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.remichel.edi.model.EDIAudit;
import com.remichel.edi.model.EDIOEHeader;

@XmlRootElement(name="EDIAudit")
public class EDIAuditDTO {
	private List<EDIOEHeaderDTO> orders;
	private EDIDTO ediRec;
	
	public EDIAuditDTO() { }
	
	public EDIAuditDTO(EDIAudit model) {
		if(model == null) {
			return;
		}		

		this.ediRec = new EDIDTO(model.getEdiRec());		
		
		this.orders = new ArrayList<EDIOEHeaderDTO>();		
		if (model.getOrders() != null && !model.getOrders().isEmpty()) {			
			for (EDIOEHeader hdr : model.getOrders()) {				
				this.orders.add(new EDIOEHeaderDTO(hdr));
			}			
		}
	}

	public List<EDIOEHeaderDTO> getOrders() {
		return orders;
	}

	public void setOrders(List<EDIOEHeaderDTO> orders) {
		this.orders = orders;
	}

	public EDIDTO getEdiRec() {
		return ediRec;
	}

	public void setEdiRec(EDIDTO ediRec) {
		this.ediRec = ediRec;
	}
}
