package com.remichel.edi.resource;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.process.internal.RequestScoped;
import org.springframework.stereotype.Controller;

import com.remichel.core.resource.AbstractResource;
import com.remichel.edi.dto.EDIMichaelSonsDTO;
import com.remichel.edi.service.EDIMichaelSonService;

@Controller
@RequestScoped
public class EDIMichaelSonSubResource extends AbstractResource {
	
	@Inject
	private EDIMichaelSonService ediMichaelSonService;	
	
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public EDIMichaelSonsDTO getCustomerID(@DefaultValue("") @QueryParam("CompanyCode") String companyCode) {
		try {
			return super.mapObject(ediMichaelSonService.getCustomerID(companyCode), EDIMichaelSonsDTO.class);
		} catch (Exception ex) {
			throw handleException(ex);
		}
	}
	
}