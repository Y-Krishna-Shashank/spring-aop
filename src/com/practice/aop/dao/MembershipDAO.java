package com.practice.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    public boolean addAccount(){
        System.out.println(getClass()+": ADDING A MEMBERSHIP ACCOUNT");
        return true;
    }
    public void goToSleep(){
        System.out.println(getClass()+": I am going to sleep now...");
    }
}
