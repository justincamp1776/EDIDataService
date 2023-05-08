package com.remichel.edi.dto;

import javax.xml.bind.annotation.XmlRootElement;

import com.remichel.edi.model.EDIException;

@XmlRootElement(name="EDIException")
public class EDIExceptionDTO {
	
	private String ediExceptionType;
	private String message;
	private String exLocation;
	private String exAlertType;
		
	
	public EDIExceptionDTO() {
		
	}
	
	
	
	public EDIExceptionDTO(final EDIException model) {		
		
		if(model == null) {
			return;
		}
		
		this.ediExceptionType 	= model.getEdiExceptionType();
		this.message 			= model.getMessage();
		this.exLocation 		= model.getExLocation();
		this.exAlertType 		= model.getExAlertType();	
		
	}

	public String getEdiExceptionType() {
		return ediExceptionType;
	}

	public void setEdiExceptionType(String ediExceptionType) {
		this.ediExceptionType = ediExceptionType;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getExLocation() {
		return exLocation;
	}

	public void setExLocation(String exLocation) {
		this.exLocation = exLocation;
	}

	public String getExAlertType() {
		return exAlertType;
	}

	public void setExAlertType(String exAlertType) {
		this.exAlertType = exAlertType;
	}
}