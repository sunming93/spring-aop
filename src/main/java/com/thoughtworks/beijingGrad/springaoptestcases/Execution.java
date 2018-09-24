package com.thoughtworks.beijingGrad.springaoptestcases;

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
}
