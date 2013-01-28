package com.springinpractice.ch13.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class TicketStatusRequest {
	private String key;
	
	public TicketStatusRequest() { }
	
	public TicketStatusRequest(String key) { this.key = key; }
	
	public String getKey() { return key; }
	
	public void setKey(String key) { this.key = key; }
}
