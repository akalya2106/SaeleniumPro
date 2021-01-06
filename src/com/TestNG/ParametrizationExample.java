package com.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParametrizationExample {
	
	@Test
	@Parameters("learn")
	public void method1(String value) {
		System.out.println("This is " +value);
	}

}

