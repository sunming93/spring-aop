package com.thoughtworks.beijingGrad.springaoptestcases;

import com.thoughtworks.beijingGrad.springaoptestcases.annotations.AfterReturningService;
import com.thoughtworks.beijingGrad.springaoptestcases.annotations.AroundService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Aspect
public class LoggerAspect {
    @Autowired
    private LoggerContainer loggerContainer;

    @Before("@annotation(com.thoughtworks.beijingGrad.springaoptestcases.annotations.BeforeService)")
    public void beforeLog(JoinPoint joinPoint ){
        loggerContainer.getBerofeMessages().add("Before Advice");
    }

    @AfterReturning("@annotation(com.thoughtworks.beijingGrad.springaoptestcases.annotations.AfterReturningService)")
    public void afterReturningLog(JoinPoint joinPoint ){
        loggerContainer.getAfterReturningMessages().add("AfterReturning Advice");
    }

    @AfterThrowing("@annotation(com.thoughtworks.beijingGrad.springaoptestcases.annotations.AfterThrowingService)")
    public void afterThrowingLog(JoinPoint joinPoint ){
        loggerContainer.getAfterThrowingMessages().add("AfterThrowing Advice");
    }

    @After("@annotation(com.thoughtworks.beijingGrad.springaoptestcases.annotations.AfterService)")
    public void afterLog(JoinPoint joinPoint ){
        loggerContainer.getAfterMessages().add("After Advice");
    }

    @Around("@annotation(com.thoughtworks.beijingGrad.springaoptestcases.annotations.AroundService)")
    public void aroundLog(ProceedingJoinPoint joinPoint ) throws Throwable {
        loggerContainer.getAroundMessages().add("Around Before Advice");
        joinPoint.proceed();
        loggerContainer.getAroundMessages().add("Around After Advice");
    }
}
