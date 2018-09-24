package com.thoughtworks.beijingGrad.springaoptestcases;

import com.thoughtworks.beijingGrad.springaoptestcases.annotations.AfterReturningService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
}
