package com.jane.objecttheater.procedural;

import java.math.BigDecimal;

public class Ticket {
    private BigDecimal fee;

    public Ticket(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getFee() {
        return fee;
    }
}
