package com.remichel.edi.service;

import java.util.HashSet;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.remichel.core.BaseDataService;
import com.remichel.edi.dao.EDIOrderDAO;
import com.remichel.edi.model.EDIOEHeader;
import com.remichel.inventory.model.PartQtyHolder;

@Service
public class EDIOrderService extends BaseDataService {
	@Inject
	private EDIOrderDAO ediOrderDAO;
	
	public boolean insertEDIOrder(final EDIOEHeader order) throws Exception {
		return ediOrderDAO.insertEDIOrder(order);
	}		
	
	public HashSet<PartQtyHolder> buildPartQtyHolder(final EDIOEHeader hdr) throws Exception {
		if (hdr == null) {
			return null;
		}	
		
		return ediOrderDAO.buildPartQtyHolder(hdr);	
	}
}