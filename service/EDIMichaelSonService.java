package com.remichel.edi.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.remichel.core.BaseDataService;
import com.remichel.edi.dao.EDIMichaelSonDAO;
import com.remichel.edi.model.EDIMichaelSons;

@Service
public class EDIMichaelSonService extends BaseDataService{
	@Inject 
	private EDIMichaelSonDAO ediMichaelSonDAO;
	
	public EDIMichaelSons getCustomerID(final String companyCode) throws Exception {
		return ediMichaelSonDAO.getCustomerID(companyCode);
	}	
}
