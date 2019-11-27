package com.serivce.impl;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl {

    public int add(int a,int b){
        System.out.println("do-------------");
        return a+b;
//        throw new RuntimeException("re");
    }
}
