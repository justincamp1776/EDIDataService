package com.remichel.edi.resource;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.process.internal.RequestScoped;
import org.springframework.stereotype.Controller;

import com.remichel.core.resource.AbstractResource;
import com.remichel.edi.model.EDIOEHeader;
import com.remichel.edi.service.EDIOrderService;

@Controller
@RequestScoped
public class EDIOrderSubResource extends AbstractResource {
	@Inject
	private EDIOrderService ediOrderService;

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public boolean insertEDIOrder(final EDIOEHeader order) throws Exception {
		try {			
			if (order == null) {
				throw new Exception("EDI order is null");
			}	

			return ediOrderService.insertEDIOrder(super.mapObject(order, EDIOEHeader.class));			
		} catch (Exception ex) {
			throw new Exception("");
		}
	} 			
}