package com.practice.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration //Spring pure java configuration no xml
@EnableAspectJAutoProxy //Spring AOP proxy support
@ComponentScan("com.practice.aop") //component scan for components and aspects
public class Config {
}
