package com.heycar.parent;

import org.springframework.stereotype.Service;

@Service
public class ParentService implements IParentService {

    public String getGreeting() {
        return "Hey Parent";
    }
}
