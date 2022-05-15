package com.practice.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {
    //making access modifiers to public inorder to be able to accessible by other aspects
    @Pointcut("execution(* com.practice.aop.dao.*.*(..))")
    public void forDaoPackage()
    {
        System.out.println("In pointcut expression");
    }

    //create pointcut for getter methods
    @Pointcut("execution(* com.practice.aop.dao.*.get*(..))")
    public void forGetter(){}
    //create pointcut for setter methods
    @Pointcut("execution(* com.practice.aop.dao.*.set*(..))")
    public void forSetter(){}

    //create pointcut: include package ... exclude getter/setter

    @Pointcut("forDaoPackage() && !(forGetter() || forSetter())")
    public void forDaoPackageNoGetterSetter(){}

}
