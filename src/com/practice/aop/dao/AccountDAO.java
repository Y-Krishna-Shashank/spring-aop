package com.practice.aop.dao;

import com.practice.aop.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    private String name;
    private String serviceCode;
    public void addAccount(Account theAccount){
        System.out.println(getClass()+": Doing my db work: adding an account");
    }
    public void doWork(){
        System.out.println(getClass()+": doWork()");
    }

    public String getName() {
        System.out.println(getClass()+": in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass()+": in setName()");

        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass()+": in getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass()+": in setServiceCode()");
        this.serviceCode = serviceCode;
    }
}
