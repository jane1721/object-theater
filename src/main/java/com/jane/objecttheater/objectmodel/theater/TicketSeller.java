package com.jane.objecttheater.objectmodel.theater;

import com.jane.objecttheater.objectmodel.audience.Audience;
import com.jane.objecttheater.objectmodel.ticket.Ticket;

import java.math.BigDecimal;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        Ticket ticket = ticketOffice.getTicket();
        BigDecimal amount = audience.buy(ticket);
        ticketOffice.plusAmount(amount);
    }
}
