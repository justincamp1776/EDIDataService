package com.remichel.edi.dao;

import java.util.HashSet;

import org.springframework.stereotype.Repository;

import com.remichel.core.dao.AbstractDAO;
import com.remichel.edi.model.EDIOEHeader;
import com.remichel.edi.model.EDIOELine;
import com.remichel.inventory.model.PartQtyHolder;

@Repository
public class EDIOrderDAO extends AbstractDAO {

	public boolean insertEDIOrder(EDIOEHeader order) throws Exception {
		if (order == null) {
			throw new Exception("This EDI order is null");
		}		
		
		return true;
	}
	
	public HashSet<PartQtyHolder> buildPartQtyHolder(final EDIOEHeader hdr) throws Exception {
		if (hdr == null) {
			throw new Exception("This EDI order is null");
		}		
		
		HashSet<PartQtyHolder> partQtyHolders = new HashSet<PartQtyHolder>(); 
		
		for (EDIOELine l : hdr.getOeLine()) {					
			PartQtyHolder pQH = new PartQtyHolder("JUNK");					
			partQtyHolders.add(pQH);
		}			
		
		return partQtyHolders;
	}
}