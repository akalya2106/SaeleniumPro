package com.InterviewQues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Goggle {
	
	//public static WebDriver driver;
	
	@Test
	public void google() {
		System.setProperty("webdriver.gecko.driver","D:\\Softlogic\\Selenium Softwares\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://www.google.com/");
		
		WebElement goog = driver.findElement(By.name("q"));
		goog.sendKeys("god");
	
	}
}
