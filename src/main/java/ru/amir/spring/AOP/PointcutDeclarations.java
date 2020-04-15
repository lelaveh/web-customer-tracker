package ru.amir.spring.AOP;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


public class PointcutDeclarations {

    @Pointcut("execution(* ru.amir.spring.dao.*.*(..))")
    public void forDAOPackage() {};

    @Pointcut("execution(* ru.amir.spring.controller.*.*(..))")
    public void forControllerPackage() {};

    @Pointcut("execution(* ru.amir.spring.service.*.*(..))")
    public void forServicePackage() {};

    @Pointcut("forDAOPackage() || forControllerPackage() || forServicePackage()")
    public void forAppFlow() {};
}
