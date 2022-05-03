package com.example.sbtestes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

    @GetMapping(path = {"/ola","/ole"})
    public String ola(){
        return "Olá Spring Boot!";
    }

}
