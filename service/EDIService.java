package com.remichel.edi.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.remichel.core.BaseDataService;
import com.remichel.core.db.result.DBResult;
import com.remichel.edi.dao.EDIDAO;
import com.remichel.edi.model.EDI;

@Service
public class EDIService extends BaseDataService {
	@Inject 
	private EDIDAO ediDAO;	
    	
    public DBResult<EDI> getAll() throws Exception {
    	return ediDAO.getAll();
    }

    public EDI get(final String tradingPartnerName) throws Exception {
    	return ediDAO.get(tradingPartnerName);
    } 
    
}