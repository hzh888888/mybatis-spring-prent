package com.nf.demo1.entity;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

public class EmployeeEntity {

    private int id;
    @Min(0)
    private BigDecimal salary;
    @FutureOrPresent
    private Date hiredate;
    private int gender;
    @NotEmpty
    @Size(min = 1,max = 10)
    private String username;
    private int deptid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", salary=" + salary +
                ", hiredate=" + hiredate +
                ", gender=" + gender +
                ", username='" + username + '\'' +
                ", deptid=" + deptid +
                '}';
    }
}
