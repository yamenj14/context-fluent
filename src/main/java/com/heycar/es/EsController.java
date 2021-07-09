package com.heycar.es;

import com.heycar.parent.IParentService;
import com.heycar.parent.ParentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EsController extends ParentController {

    @Autowired
    IParentService homeService;
    @Autowired
    GreetingService independentService;

    @GetMapping("/greeting")
    @ResponseBody
    public String indenpendent() {
        return independentService.getGreeting();
    }

}
