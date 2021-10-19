package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
	private SzamologepService szamologepService = new SzamologepService();
	

	@GetMapping("/")
	@ResponseBody
	public String barmi() {
		return "hello";
		
		
	}
	@GetMapping("/szamologep")
	@ResponseBody
	public double szamologep(
				@RequestParam("a") int a,
				@RequestParam("b") int b,
				@RequestParam("operator") String operator
				) {
		return szamologepService.szamol(a, b, operator);
	}
	
	@GetMapping(path="/szamologep-rest", consumes = "application/json" , produces ="application/json")
	@ResponseBody
	public double szamologepRest(@RequestBody CalculatorDto calculatorDto) {
		return szamologepService.szamol(calculatorDto.getA(),
				calculatorDto.getB(),
				calculatorDto.getOperator());
	}

	
}
