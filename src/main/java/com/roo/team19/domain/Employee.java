package com.roo.team19.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Employee {

    /**
     */
    @NotNull
    private String EmployeeID;

    /**
     */
    @NotNull
    private String FirstName;

    /**
     */
    @NotNull
    private String LastName;

    /**
     */
    @NotNull
    private String Birthday;

    /**
     */
    @NotNull
    private String Gender;

    /**
     */
    @NotNull
    private String Username;

    /**
     */
    @NotNull
    private String Password;
}
