package com.premit.mockito_unittesting_login_app.test;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.premit.mockito_unittesting_login_app.Calculator;
import com.premit.mockito_unittesting_login_app.CalculatorService;

@ExtendWith(MockitoExtension.class)
public class TestCalculator {
	
	@Mock
	CalculatorService calculatorService;
	
	@InjectMocks
	Calculator calculator;

	@Test
	public void testPerform() {		
		Mockito.when(calculatorService.perform(10, 20)).thenReturn(30);
	    calculator.perform();
	}
}
