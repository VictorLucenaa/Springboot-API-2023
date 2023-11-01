package com.remedios.victor.curso.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") // endpoint da aplicação que este controller é rodado
public class HelloWorld {

    @GetMapping // para receber retornos do banco de dados
    public String OlaMundo(){
        return "Hello world";
    }
}
