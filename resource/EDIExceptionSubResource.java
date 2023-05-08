package com.remichel.edi.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.process.internal.RequestScoped;
import org.springframework.stereotype.Controller;

import com.remichel.core.resource.AbstractResource;
import com.remichel.edi.dto.EDIExceptionDTO;
import com.remichel.edi.model.EDIException;
import com.remichel.edi.service.EDIExceptionService;

@Controller
@RequestScoped
public class EDIExceptionSubResource extends AbstractResource {
	@Inject
	private  EDIExceptionService ediExceptionService;

	@POST
	@Consumes( {MediaType.APPLICATION_JSON} )
	@Produces( {MediaType.APPLICATION_JSON} )
	public boolean logEDIExceptions(List<EDIExceptionDTO> e) throws Exception {
		try {
			if (e == null) {
				throw new Exception("OrderAudit object is null");
			}

			return ediExceptionService.logEDIException(super.mapList(e, EDIException.class));
		} catch (Exception ex) {
			throw handleException(ex);
		}
	} 			
}