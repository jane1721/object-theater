package com.jane.objecttheater.objectmodel.audience;

import com.jane.objecttheater.objectmodel.ticket.Ticket;

import java.math.BigDecimal;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public BigDecimal buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
