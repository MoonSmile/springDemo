package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by apple on 16/9/2.
 */
@Controller @RequestMapping (value = "/abc")
public class MainController {
    @RequestMapping(value = "/def",method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    public String hello(String name)
    {
        return name;
    }
}