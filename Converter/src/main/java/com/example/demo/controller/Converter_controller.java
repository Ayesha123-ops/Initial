package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.service.Converter_service;
@RestController
public class Converter_controller {
	    @Autowired
		private Converter_service converte;
		@RequestMapping (path="/converter/{a}")
		
		public double converter(@PathVariable("a")double celcius)
		{
			return converte.temperature(celcius);
		}
		

}
