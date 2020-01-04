package com.codegym.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "depart")
public class Departs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departId;
    private String departName;
    @OneToMany(targetEntity = Staff.class)
    private List<Staff> staffList;

    public Departs() {
    }

    public Departs(String departName, List<Staff> staffList) {
        this.departName = departName;
//        this.staffList = staffList;
    }

    public Long getDepartId() {
        return departId;
    }

    public void setDepartId(Long departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }
}