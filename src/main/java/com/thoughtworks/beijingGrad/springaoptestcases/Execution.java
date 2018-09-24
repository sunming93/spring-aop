package com.thoughtworks.beijingGrad.springaoptestcases;

import com.thoughtworks.beijingGrad.springaoptestcases.annotations.AfterReturningService;
import com.thoughtworks.beijingGrad.springaoptestcases.annotations.AfterService;
import com.thoughtworks.beijingGrad.springaoptestcases.annotations.AfterThrowingService;
import com.thoughtworks.beijingGrad.springaoptestcases.annotations.BeforeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Execution {
    @Autowired
    private LoggerContainer loggerContainer;

    @BeforeService
    public void berofeMethod() {
        loggerContainer.getBerofeMessages().add("Before Method");
    }

    @AfterReturningService
    public void afterReturningMethod() {
        loggerContainer.getAfterReturningMessages().add("AfterReturning Method");
    }

    @AfterThrowingService
    public void afterThrowingMethod() throws Exception{
        loggerContainer.getAfterThrowingMessages().add("AfterThrowing Method");
        throw new Exception();
    }

    @AfterService
    public void afterMethod() throws Exception{
        loggerContainer.getAfterMessages().add("After Method");
        throw new Exception();
    }
}
