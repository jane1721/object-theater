package com.jane.objecttheater.procedural;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class TheaterTest {

    private Theater theater;
    private Ticket ticket;
    private TicketOffice ticketOffice;
    private TicketSeller ticketSeller;

    @BeforeEach
    void setUp() {
        ticket = new Ticket(BigDecimal.valueOf(10000L));
        ticketOffice = new TicketOffice(BigDecimal.ZERO, ticket);
        ticketSeller = new TicketSeller(ticketOffice);
        theater = new Theater(ticketSeller);
    }

    @Test
    void 초대장이_있는_관객은_무료로_입장한다() {
        // given
        Invitation invitation = new Invitation(LocalDateTime.now());
        Bag bag = new Bag(BigDecimal.valueOf(5000L), invitation); // 초대장 있음
        Audience audience = new Audience(bag);

        // when
        theater.enter(audience);

        // then
        assertThat(audience.getBag().hasInvitation()).isTrue();
        assertThat(audience.getBag().getAmount()).isEqualTo(BigDecimal.valueOf(5000L)); // 돈 그대로
        assertThat(audience.getBag().getTicket()).isNotNull(); // 티켓 있음
        assertThat(ticketOffice.getAmount()).isEqualTo(BigDecimal.ZERO); // 매표소 돈 증가 없음
    }

    @Test
    void 초대장이_없는_관객은_티켓_가격을_지불하고_입장한다() {
        // given
        Bag bag = new Bag(BigDecimal.valueOf(10000L), null); // 초대장 없음
        Audience audience = new Audience(bag);

        // when
        theater.enter(audience);

        // then
        assertThat(audience.getBag().getAmount()).isEqualTo(BigDecimal.ZERO); // 티켓 가격만큼 차감
        assertThat(audience.getBag().getTicket()).isNotNull(); // 티켓 있음
        assertThat(ticketOffice.getAmount()).isEqualTo(BigDecimal.valueOf(10000L)); // 매표소 돈 증가
    }
}
