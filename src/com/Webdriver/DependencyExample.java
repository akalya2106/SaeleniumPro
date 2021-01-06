package com.Webdriver;

import org.testng.annotations.Test;

public class DependencyExample {
	
	@Test
	public void highschool() {
		System.out.println("High school completed");
		
	}
	
	@Test(dependsOnMethods="highschool")
	public void highersecondary() {
		System.out.println("Higer secondary completed");
		
	}
 
	@Test(dependsOnMethods="highersecondary")
	public void Engineering() {
		System.out.println("College completed");
		
	}
}
