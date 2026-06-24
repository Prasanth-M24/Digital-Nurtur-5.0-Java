package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.SpringLearnApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
    @GetMapping
    public String sayHello() {
        LOGGER.info("Inside sayHello() method");
        return "Hello World!";
    }
}
