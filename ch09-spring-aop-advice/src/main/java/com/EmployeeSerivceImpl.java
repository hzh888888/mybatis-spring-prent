package com;

public class EmployeeSerivceImpl {

    public void insert(){
        System.out.println("开始插入--------------------");
        throw new   RuntimeException("sdefrgt--------------------");
    }

    public void update(){
        System.out.println("开始更新----------------------");
    }

    public int add(int m,int n){
        System.out.println("add---------");
        return m+n;
    }
}
