package com.remichel.edi.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.remichel.core.BaseDataService;
import com.remichel.edi.dao.EDIExceptionDAO;
import com.remichel.edi.model.EDIException;

@Service
public class EDIExceptionService extends BaseDataService {
		
	@Inject
	private EDIExceptionDAO ediExDAO;

	public boolean logEDIException(final List<EDIException> e) throws Exception {
		try {
			 return ediExDAO.logEDIException(e);
		} catch(Exception ex) {
			// swallow exception
		}
		
		return false;		
	}			
}