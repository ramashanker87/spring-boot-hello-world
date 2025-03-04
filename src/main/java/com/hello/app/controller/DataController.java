package com.hello.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
    @GetMapping("/data")
    public String dataApi(){
        return "Data Controler";
    }
}
