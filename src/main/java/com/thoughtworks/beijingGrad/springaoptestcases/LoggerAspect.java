package com.thoughtworks.beijingGrad.springaoptestcases;

import org.aspectj.lang.JoinPoint;
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

    @Before("@annotation(com.thoughtworks.beijingGrad.springaoptestcases.BeforeService)")
    public void log(JoinPoint joinPoint ){
        loggerContainer.getBerofeMessages().add("Before Advice");
    }
}
