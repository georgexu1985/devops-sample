package com.xgit.devops.devopssample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hanyun")
    public String sayHello() {
        System.out.println("#####################################  /hanyun/api/v1/getname");
        return "#####################################  /hanyun/api/v1/getname.";
    }
}
