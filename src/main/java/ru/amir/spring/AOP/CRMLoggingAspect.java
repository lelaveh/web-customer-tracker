package ru.amir.spring.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class CRMLoggingAspect {
    private Logger logger = Logger.getLogger(getClass().getName());

    @Before("ru.amir.spring.AOP.PointcutDeclarations.forAppFlow()")
    public void before(JoinPoint joinPoint) {
        logger.info(joinPoint.getSignature().toShortString() + " method logging");
        logger.info(Arrays.toString(joinPoint.getArgs()) + " arguments");
    }
}
