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

        assertEquals(2, loggerContainer.getBoforeMessages().size);
        assertEquals("Before Advice", loggerContainer.getBoforeMessages().get(0));
        assertEquals("Before Method", loggerContainer.getBoforeMessages().get(1));
    }
}
