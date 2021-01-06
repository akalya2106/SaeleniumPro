package com.Advancedwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Datepicker {
	
	public static WebDriver driver;
	
  @Test
  public void Datepicker1() {
	  System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/");
		
		WebElement date = driver.findElement(By.name("bdaytime"));
		date.sendKeys("12041998");
		date.sendKeys(Keys.TAB);
		date.sendKeys("1031");
		
		
  }
}
