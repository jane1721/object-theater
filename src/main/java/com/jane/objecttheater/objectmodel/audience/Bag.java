package com.jane.objecttheater.objectmodel.audience;

import com.jane.objecttheater.objectmodel.ticket.Invitation;
import com.jane.objecttheater.objectmodel.ticket.Ticket;

import java.math.BigDecimal;

public class Bag {
    BigDecimal amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(BigDecimal amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void minusAmount(BigDecimal fee) {
        this.amount = this.amount.subtract(fee);
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
