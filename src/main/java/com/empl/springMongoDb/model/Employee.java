package com.empl.springMongoDb.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Employee {
    private Long id;
    private String empNo;
    private String fullName;
    private Date hireDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empNo='" + empNo + '\'' +
                ", fullName='" + fullName + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
