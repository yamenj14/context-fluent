package com.heycar.parent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ParentController {

    @Autowired
    IParentService homeService;

    @GetMapping("/home")
    @ResponseBody
    public String greeting() {
        logError();
        return homeService.getGreeting();
    }

    public void logError(){
        System.out.println("Log from Parent!");
    }

}
