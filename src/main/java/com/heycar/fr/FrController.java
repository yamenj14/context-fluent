package com.heycar.fr;

import com.heycar.parent.ParentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.heycar.parent.IParentService;

@Controller
public class FrController extends ParentController {
    @Autowired
    IParentService homeService;
}
