package com.codegym.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long staffId;
    @NotEmpty
    private String staffName;
    @NotEmpty
    private Boolean gender;
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="MM/dd/yyyy")
    private Date birthday;
    @NotEmpty
    private String avatar;
    @NotEmpty
    private String email;
    @NotNull
    private Integer phoneNumber;
    @NotNull
    private Integer salary;
    @ManyToOne
    @JoinColumn(name = "departId")
    private Departs departs;
}