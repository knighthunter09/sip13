package com.springinpractice.ch13.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class TicketCategoryRequest {
	private Long id;
	
	public TicketCategoryRequest() { }
	
	public TicketCategoryRequest(Long id) { this.id = id; }
	
	public Long getId() { return id; }
	
	public void setId(Long id) { this.id = id; }
}
