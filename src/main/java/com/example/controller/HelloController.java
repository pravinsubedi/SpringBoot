package com.example.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 11/27/2016.
 */
@RestController
@RequestMapping("/hello")
public class HelloController
{
    @RequestMapping(method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public  String helloWorld(){
        return "Hello World";
    }
}
