package com.thoughtworks.beijingGrad.springaoptestcases;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class LoggerContainer {
    private List<String> berofeMessages = new ArrayList<>();
    private List<String> afterReturningMessages = new ArrayList<>();
    private List<String> afterThrowingMessages = new ArrayList<>();
    private List<String> afterMessages = new ArrayList<>();
    private List<String> aroundMessages = new ArrayList<>();

    public List<String> getBerofeMessages() {
        return berofeMessages;
    }

    public List<String> getAfterReturningMessages() {
        return afterReturningMessages;
    }

    public List<String> getAfterThrowingMessages() {
        return afterThrowingMessages;
    }

    public List<String> getAfterMessages() {
        return afterMessages;
    }

    public List<String> getAroundMessages() {
        return aroundMessages;
    }
}
