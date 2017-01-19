package com.roo.team19.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findSeatsBySeatLike" })
public class Seat {

    /**
     */
    @NotNull
    private String seat;

    /**
     */
    @ManyToOne
    private Members membername;

    /**
     */
    private Integer seat_idnum;
}
