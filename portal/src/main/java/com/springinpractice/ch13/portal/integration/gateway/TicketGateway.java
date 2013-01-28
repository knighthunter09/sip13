package com.springinpractice.ch13.portal.integration.gateway;

import com.springinpractice.ch13.cdm.Ticket;
import com.springinpractice.ch13.cdm.TicketCategory;
import com.springinpractice.ch13.cdm.TicketCategory.TicketCategoryList;
import com.springinpractice.ch13.cdm.TicketStatus;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public interface TicketGateway {
	
	void createTicket(Ticket ticket);
	
	TicketStatus findOpenTicketStatus();
	
	TicketCategoryList findTicketCategories();
	
	TicketCategory findTicketCategory(Long id);
}
