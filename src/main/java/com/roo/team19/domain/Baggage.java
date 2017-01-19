package com.roo.team19.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findBaggagesByWeightBagEquals" })
public class Baggage {

    /**
     */
    @NotNull
    private String Baggage_name;

    /**
     */
    private Float Price;

    /**
     */
    @ManyToOne
    private Members Members;

    /**
     */
    @ManyToOne
    private Seat SeatNumber;

    /**
     */
    private Integer weightBag;
}
