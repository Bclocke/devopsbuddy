package com.devopsbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by brandon.locke on 7/19/17.
 */

@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHello(){
        return ("Index");
    }
}
