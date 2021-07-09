package com.heycar.es;

import com.heycar.parent.IParentService;
import org.springframework.stereotype.Service;

@Service
public class SpanishService implements IParentService {

    public String getGreeting() {
        return "Hey Spain";
    }
}
