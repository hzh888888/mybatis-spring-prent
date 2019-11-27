package com.entity;

import java.sql.Date;

public class UserInfo {

    private int id;
    private String sysUserInfo;
    private String age;
    private Date time;


    private String firstName;
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSysUserInfo() {
        return sysUserInfo;
    }

    public void setSysUserInfo(String sysUserInfo) {
        this.sysUserInfo = sysUserInfo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", sysUserInfo='" + sysUserInfo + '\'' +
                ", age='" + age + '\'' +
                ", time=" + time +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
