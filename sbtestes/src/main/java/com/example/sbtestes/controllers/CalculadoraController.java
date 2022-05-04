package com.example.sbtestes.controllers;

import com.example.sbtestes.models.Calculadora;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/calc")
public class CalculadoraController {

    @GetMapping(path="/soma")
    public Double somar(){
        Calculadora calc= new Calculadora(10.0,20.0);
        return calc.somar();
    }

    @GetMapping
    public Double somar2(@RequestParam double a, double b){
        Calculadora calc =  new Calculadora(a,b);
       return calc.somar2(a,b);
    }
}
