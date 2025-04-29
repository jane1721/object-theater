package com.jane.objecttheater.objectmodel.ticket;

import java.math.BigDecimal;

public class Ticket {
    private BigDecimal fee;

    public Ticket(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal fee() {
        return fee;
    }
}
