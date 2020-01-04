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
    private String staffName;
    private String email;
    private Integer phoneNumber;
    private Integer salary;
    @ManyToOne
    @JoinColumn(name = "Depart_Id")
    private Departs departs;

    public Staff() {
    }

    public Staff(String staffName, String email, Integer phoneNumber, Integer salary, Departs departs) {
        this.staffName = staffName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.departs = departs;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Departs getDeparts() {
        return departs;
    }

    public void setDeparts(Departs departs) {
        this.departs = departs;
    }
}