package com.practice.aop;

import com.practice.aop.dao.AccountDAO;
import com.practice.aop.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPApp {
    public static void main(String[] args) {
        //read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO theMembershipDAO = context.getBean("membershipDAO",MembershipDAO.class);
        theAccountDAO.addAccount(new Account());
        theAccountDAO.doWork();
        //call accountdao getter/setter methods
        theAccountDAO.setName("foo");
        theAccountDAO.setServiceCode("silver");

        String name = theAccountDAO.getName();
        String code = theAccountDAO.getServiceCode();
        theMembershipDAO.addAccount();
        theMembershipDAO.goToSleep();
        context.close();

    }
}
