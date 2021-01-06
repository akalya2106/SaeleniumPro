package com.datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logineg {
	public static WebDriver driver;
	
	@Test
	public void Log() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement user = driver.findElement(By.id("txtUsername"));
		user.sendKeys("Admin");
		
		WebElement pswrd =driver.findElement(By.id("txtPassword"));
		pswrd.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
	}

}