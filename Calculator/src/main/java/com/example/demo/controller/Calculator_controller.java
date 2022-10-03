package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Calculator_Service;

@RestController
@RequestMapping("/cal")
public class Calculator_controller {
	
	@Autowired
	private  Calculator_Service calculator;
	@GetMapping("/calculate")
	public int Add(@RequestParam int a, @RequestParam int b) {
		return calculator.add(a, b);
		
	
	
	
	

}
}

