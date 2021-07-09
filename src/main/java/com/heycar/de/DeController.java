package com.heycar.de;

import com.heycar.parent.ParentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heycar.parent.IParentService;

@RestController
public class DeController extends ParentController  {

    @Autowired
    IParentService parentService;
}
