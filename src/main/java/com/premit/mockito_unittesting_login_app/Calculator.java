package com.premit.mockito_unittesting_login_app;

public class Calculator {
	
	CalculatorService calculatorService;
	
	public int perform() {
		return calculatorService.perform(10, 20);
	}
}
