package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service

public class Converter_service {
	

		public double temperature(double celcius) 
	       {
			double f= (celcius*1.8)+32;
			return f;
		
		}
}
