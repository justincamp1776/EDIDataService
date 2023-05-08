package com.remichel.edi.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.remichel.core.BaseDataService;
import com.remichel.edi.dao.EDIAuditDAO;
import com.remichel.edi.model.EDIAudit;

@Service
public class EDIAuditService extends BaseDataService  {

	@Inject
	private EDIAuditDAO ediAuditDAO;

	public boolean insertErrRecords(final EDIAudit errRec) throws Exception {
		return ediAuditDAO.insertErrRecords(errRec);
	}	
}