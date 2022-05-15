package com.practice.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {


//    @Before("execution(public void com.practice.aop.dao.AccountDAO.addAccount())")
//    @Before("execution(public void add*())")
//    @Before("execution(public void updateAccount())")
//    @Before("execution(public * add*())")matches any return type and any method starting with add, but no parameters are required
//    @Before("execution(public * add*(com.practice.aop.Account))")//matches any return type and any method starting with add, but it should have the specific parameter

    @Pointcut("execution(* com.practice.aop.dao.*.*(..))")
    private void forDaoPackage()
    {
        System.out.println("In pointcut expression");
    }

   //create pointcut for getter methods
   @Pointcut("execution(* com.practice.aop.dao.*.get*(..))")
    private void forGetter(){}
   //create pointcut for setter methods
   @Pointcut("execution(* com.practice.aop.dao.*.set*(..))")
   private void forSetter(){}

    //create pointcut: include package ... exclude getter/setter

    @Pointcut("forDaoPackage() && !(forGetter() || forSetter())")
    private void forDaoPackageNoGetterSetter(){}

    @Before("forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n Executing @Before advice on method");
    }
    @Before("forDaoPackageNoGetterSetter()")
    public void performApiAnalytics(){
        System.out.println("Performing some API analytics");
    }
//    @Before("execution(public * add*(..))")//matches for any parameters

    /*
    * Match any method in our DAO package: com.practice.aop.dao
    * @Before("execution(* com.practice.aop.dao.*.*(..))")
    * */
}
