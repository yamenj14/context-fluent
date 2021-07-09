package com.heycar.fr;

import org.springframework.stereotype.Service;

import com.heycar.parent.IParentService;

@Service
public class FrenchService implements IParentService {

    public String getGreeting() {
        return "Hey France";
    }
}
