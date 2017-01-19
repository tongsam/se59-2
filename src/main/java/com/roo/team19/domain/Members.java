package com.roo.team19.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findMembersesByFirstnameLike" })
public class Members {

    /**
     */
    @NotNull
    private String username;

    /**
     */
    @NotNull
    private String password;

    /**
     */
    @NotNull
    private String firstname;

    /**
     */
    @NotNull
    private String lastname;

    /**
     */
    @NotNull
    private String gender;

    /**
     */
    @NotNull
    private String birthbay;

    /**
     */
    @NotNull
    private String phone;

    /**
     */
    @NotNull
    private String email;

    /**
     */
    @NotNull
    private String address;
}
