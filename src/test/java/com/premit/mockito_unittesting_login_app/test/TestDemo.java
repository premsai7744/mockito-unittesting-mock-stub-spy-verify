package com.premit.mockito_unittesting_login_app.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestDemo {
	
	@Mock
	List<String> listOfMockObjs;
	
	@Spy
	List<String> listOfSpyObjs;
	
	@Test
	public void testListOfMockObjs() {
		int actual = listOfMockObjs.size();
		
		assertEquals(0, actual);
	}

	@Test
	public void testListOfSpyObjs() {
		
		Mockito.when(listOfSpyObjs.size()).thenReturn(10);
		
		int actual = listOfSpyObjs.size();
		
		assertEquals(10, actual);
	}


}
