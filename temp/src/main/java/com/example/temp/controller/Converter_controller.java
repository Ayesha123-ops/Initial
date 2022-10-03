package com.example.temp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.temp.service.Converter_service;

@RestController
public class Converter_controller {
    @Autowired
    private Converter_service converte;
    @RequestMapping ("/converter/{Celcius}")
    public double converter(@PathVariable("Celcius")double celcius) {
        return converte.temperature(celcius);
    }



}

