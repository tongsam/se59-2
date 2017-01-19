package com.roo.team19.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findTimetablesByFlightIdsEquals" })
public class Timetable {

    /**
     */
    @NotNull
    private String Froms;

    /**
     */
    @NotNull
    private String Tos;

    /**
     */
    @NotNull
    private String Depart;

    /**
     */
    @NotNull
    private String Return_s;

    /**
     */
    @NotNull
    private String Adults;

    /**
     */
    @NotNull
    private String Children;

    /**
     */
    @ManyToOne
    private Members Membername;

    /**
     */
    @NotNull
    private String flightIds;
}
