package com.roo.team19.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findSelectFoodsByOrderIdLike" })
public class SelectFood {

    /**
     */
    @Enumerated
    private ChooseFood foodSelect;

    /**
     */
    @Enumerated
    private ChooseDrink drinkSelct;

    /**
     */
    @ManyToOne
    private Members members;

    /**
     */
    @ManyToOne
    private Seat seatnumber;

    /**
     */
    private Float price;

    /**
     */
    @NotNull
    private String orderId;
}
