package com.jane.objecttheater.objectmodel.theater;

import com.jane.objecttheater.objectmodel.ticket.Ticket;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Queue;

public class TicketOffice {
    private BigDecimal amount;
    private Queue<Ticket> tickets = new LinkedList<>();

    public TicketOffice(BigDecimal amount, Ticket... tickets) {
        this.amount = amount;
        for (Ticket ticket : tickets) {
            this.tickets.add(ticket);
        }
    }

    public Ticket getTicket() {
        return tickets.poll();
    }

    public void plusAmount(BigDecimal fee) {
        this.amount = this.amount.add(fee);
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
