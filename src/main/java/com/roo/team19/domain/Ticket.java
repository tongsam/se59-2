package com.roo.team19.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.persistence.ManyToOne;

import javax.persistence.Column;
import javax.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;



@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findTicketsByTicket_idLike" })
public class Ticket {

    /**
     */
    @NotNull
    @Pattern(regexp = "\\d{7}")
    @Column(unique = true)
    private String ticket_id;

    /**
     */
    @ManyToOne
    private Members membertk;

    /**
     */
    @ManyToOne
    private Seat seattk;

    /**
     */
    @ManyToOne
    private FlightOneWay flightonetk;

    /**
     */
    @ManyToOne
    private Baggage baggagetk;

    /**
     */
    @ManyToOne
    private SelectFood selectfoodtk;
}
