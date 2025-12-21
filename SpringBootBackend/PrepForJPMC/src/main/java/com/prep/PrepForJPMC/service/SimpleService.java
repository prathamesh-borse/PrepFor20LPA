package com.prep.PrepForJPMC.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {

    public String printHelloWorld(String message) {
        return "Hello, " + message;
    }

    public String printBodyMessage(String message) {
        return message;
    }
}
