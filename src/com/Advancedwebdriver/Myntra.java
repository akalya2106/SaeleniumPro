package com.Advancedwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Myntra {
	public static WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
	
		// To max the window
		driver.manage().window().maximize();
		
		//enter into url
		driver.get("https://www.myntra.com/growth/fashion-superstar");
		
		Actions act = new Actions(driver);
		
		WebElement Men = driver.findElement(By.linkText("Men"));
		WebElement bags = driver.findElement(By.linkText("Bags & Backpacks"));
		WebElement BackPacks = driver.findElement(By.cssSelector("input[value='Backpacks']"));
		Action action = act
				.moveToElement(Men)
				.click(bags)
				.click(BackPacks)
				.build();
				action.perform();
				
  }
}
