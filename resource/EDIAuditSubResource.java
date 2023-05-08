package com.remichel.edi.resource;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.process.internal.RequestScoped;
import org.springframework.stereotype.Controller;

import com.remichel.core.resource.AbstractResource;
import com.remichel.edi.dto.EDIAuditDTO;
import com.remichel.edi.model.EDIAudit;
import com.remichel.edi.service.EDIAuditService;

@Controller
@RequestScoped
public class EDIAuditSubResource extends AbstractResource {
	
	public EDIAuditSubResource() {}
	
	@Inject
	private EDIAuditService ediAuditService;

	@POST
	@Consumes({MediaType.APPLICATION_JSON} )
	@Produces({MediaType.APPLICATION_JSON} )
	public boolean insertErrRecords(EDIAuditDTO errRec) throws Exception {
		try {
			if (errRec == null) {
				throw new Exception("EDI order is null");
			}

			return ediAuditService.insertErrRecords(super.mapObject(errRec, EDIAudit.class));
		} catch (Exception ex) {
			throw handleException(ex);					
		}
	} 			
}