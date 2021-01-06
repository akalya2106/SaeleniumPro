package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static WebDriver driver;

	public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			WebElement firstName=driver.findElement(By.cssSelector("input[name='firstname']"));
			firstName.sendKeys("abcd");
			WebElement lastName=driver.findElement(By.cssSelector("input[name='lastname']"));
			lastName.sendKeys("v");
			WebElement email=driver.findElement(By.cssSelector("input[aria-label='Mobile number or email address']"));
			email.sendKeys("corona.com");
			WebElement password=driver.findElement(By.cssSelector("input[autocomplete=new-password']"));
			password.sendKeys("12345");
			
			
			
			
			WebElement firstName1=driver.findElement(By.xpath("//input[@name='firstname']"));
			WebElement lastName1=driver.findElement(By.xpath("//input[@name='lastName']"));
			WebElement email1=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
			WebElement password1=driver.findElement(By.xpath("//input[@autocomplete=new-password']"));
			
			

	}

}
