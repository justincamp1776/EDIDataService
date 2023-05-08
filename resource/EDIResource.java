package com.remichel.edi.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.process.internal.RequestScoped;
import org.springframework.stereotype.Controller;

import com.remichel.core.db.result.DBResult;
import com.remichel.core.dto.PagedResultSetDTO;
import com.remichel.core.resource.AbstractResource;
import com.remichel.edi.dto.EDIDTO;
import com.remichel.edi.model.EDI;
import com.remichel.edi.service.EDIService;

@Controller
@RequestScoped
@Path("EDI")
public class EDIResource extends AbstractResource{
	@Inject 
	private EDIService ediService;	

	public EDIResource() {		
	}	
	
	@Path("Audit")
	public Class<EDIAuditSubResource> getAuditSubResource() {
		return EDIAuditSubResource.class;
	}	
	
	@Path("MichaelSons")
	public Class<EDIMichaelSonSubResource> getMichaelSonsSubResource() {
		return EDIMichaelSonSubResource.class;
	}	
	
	@Path("Order")
	public Class<EDIOrderSubResource> InsertEDIOrder() {
		return EDIOrderSubResource.class;
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public PagedResultSetDTO<EDIDTO> getAll() {
		try {
			DBResult<EDI> dbResult = ediService.getAll();			
			return new PagedResultSetDTO<EDIDTO>(EDIDTO.class, dbResult);
		} catch (Exception ex) {
			throw handleException(ex);					
		}
	}	
}