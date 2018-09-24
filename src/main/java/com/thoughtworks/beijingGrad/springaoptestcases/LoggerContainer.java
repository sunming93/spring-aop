package com.thoughtworks.beijingGrad.springaoptestcases;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LoggerContainer {
    private List<String > berofeMessages = new ArrayList<>();

    public List<String> getBerofeMessages() {
        return berofeMessages;
    }
}
