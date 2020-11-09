package com.xgit.devops.devopssample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorldController {
    @RequestMapping("/hanyun")
    public String sayHello() {
        log.info("#####################################  /hanyun/api/v1/getname");
        return "#####################################  /hanyun/api/v1/getname.";
    }
}
