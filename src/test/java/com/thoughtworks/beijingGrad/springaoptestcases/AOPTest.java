package com.thoughtworks.beijingGrad.springaoptestcases;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class AOPTest {
    @Autowired
    private Execution execution;
    
    @Autowired
    private LoggerContainer loggerContainer;

    @Test
    void should_execute_before_advice_before_the_method() {
        execution.berofeMethod();

        assertEquals(2, loggerContainer.getBerofeMessages().size());
        assertEquals("Before Advice", loggerContainer.getBerofeMessages().get(0));
        assertEquals("Before Method", loggerContainer.getBerofeMessages().get(1));
    }

    @Test
    void should_execute_afterReturning_advice_after_the_method() {
        execution.afterReturningMethod();

        assertEquals(2, loggerContainer.getAfterReturningMessages().size());
        assertEquals("AfterReturning Method", loggerContainer.getAfterReturningMessages().get(0));
        assertEquals("AfterReturning Advice", loggerContainer.getAfterReturningMessages().get(1));
    }
}
