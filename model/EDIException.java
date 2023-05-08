package com.remichel.edi.model;

import com.remichel.edi.dto.EDIExceptionDTO;

public class EDIException {
	
	private String ediExceptionType;	
	private String message;
	private String exLocation;
	private String exAlertType;		
	
	
	public EDIException() {}
	
	
	public EDIException(final EDIExceptionDTO dto) {
		if (dto == null) {
			return;
		}
		
		this.ediExceptionType 	= dto.getEdiExceptionType();
		this.message 			= dto.getMessage();
		this.exLocation 		= dto.getExLocation();
		this.exAlertType 		= dto.getExAlertType();		
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