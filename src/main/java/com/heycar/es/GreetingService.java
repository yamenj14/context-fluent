package com.heycar.es;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreeting() {
        return "Hey Spanish Greeting Service!";
    }

}
