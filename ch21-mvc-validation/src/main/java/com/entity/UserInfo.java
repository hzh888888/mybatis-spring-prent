package com.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserInfo {

    @Max(value = 20,message ="最大值为20")
    private int id;
    @Size(min = 2,max = 8,message = "长度为2-8")
    private String sysUsername;
    @NotNull
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSysUsername() {
        return sysUsername;
    }

    public void setSysUsername(String sysUsername) {
        this.sysUsername = sysUsername;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", sysUsername='" + sysUsername + '\'' +
                ", age=" + age +
                '}';
    }
}
