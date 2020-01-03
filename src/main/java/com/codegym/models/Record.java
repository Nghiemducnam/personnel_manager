package com.codegym.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long recordId;
    @NotEmpty
    private String type;
    @NotEmpty
    private String reason;
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="MM/dd/yyyy")
    private Date recordDate;
    @ManyToOne
    @JoinColumn(name = "staffId")
    private Staff staff;

    public Record() {
    }

    public Record(String type, String reason, Date recordDate, Staff staff) {
        this.type = type;
        this.reason = reason;
        this.recordDate = recordDate;
        this.staff = staff;
    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}