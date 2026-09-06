package com.premit.mockito_unittesting_login_app.test;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.times;

import java.util.ArrayList;
import java.util.List;

import org.mockito.Mockito;

public class TestTemp {
	
	public static void demoOnMockObject() {
		System.out.println("DEMO ON MOCK OBJECT.");
		//1.Mock Object : returns default values like 0,null etc..
				List<String> list = Mockito.mock(ArrayList.class);
				
				System.out.println("Before adding items : size of list : "+list.size());
				
				//adding items to list
				list.add("Apple");
				list.add("Banana");
				list.add("Orange");
				list.add("Watermelon");
				
				System.out.println("After adding items : size of list : "+list.size());
	}
	
	
	public static void demoOnStubObject() {
		
		System.out.println("DEMO ON STUB OBJECT.");
		
		//2.Stub Object : Adding functionality to the methods of MOCK Objects i.e for certain inputs, certain outputs will be returned.
		List<String> list = Mockito.mock(ArrayList.class);
		
		System.out.println("Before adding items : size of list : "+list.size());
		
		Mockito.when(list.size()).thenReturn(10);
		
		System.out.println("After adding items : size of list : "+list.size());
		
		
	}
	
	
	public static void demoOnSpyObjects() {
		
		System.out.println("DEMO ON SPY OBJECTS.");
		
		//3. Spy Object : Half Mock object : MOCK+ORIGINAL : If provided method functionality, provided one will execute else Original will execute.
		List<String> list = Mockito.spy(ArrayList.class);
		
		System.out.println("Before adding items : size of list : "+list.size());
		
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Watermelon");
		
		Mockito.when(list.size()).thenReturn(10);
		
		System.out.println("After adding items : size of list : "+list.size());
		
	}
	
	
	public static void demoOnVerify() {
		
		System.out.println("DEMO ON VERIFY");
		
		List<String> list = Mockito.mock(ArrayList.class);
		
		list.add("Apple");
		list.add("Apple");
		list.add("Apple");
		
		System.out.println("Checking whether the add(Apple) from mock object is called or not.");
		
		Mockito.verify(list).add("Apple");
		System.out.println("Verified: add(\"Apple\") was called exactly once.");
	
		Mockito.verify(list,times(3)).add("Apple");
		System.out.println("Verified: add(\"Apple\") was called exactly 3 times.");
		
		Mockito.verify(list,atLeastOnce()).add("Apple");
		System.out.println("Verified: add(\"Apple\") was called atleast once.");
	}
	
	public static void main(String[] args) {
		demoOnMockObject();
		demoOnStubObject();
		demoOnSpyObjects();
		demoOnVerify();
	}	
	
}
