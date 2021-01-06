package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csspath {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
			
		//For css
		
		WebElement text=driver.findElement(By.cssSelector("input[type='text']"));
		text.sendKeys("Abcde");
		WebElement click=driver.findElement(By.cssSelector("button[title='Click me!!']"));
		click.click();
		WebElement value=driver.findElement(By.cssSelector("input[value='female']"));
		value.click();
		WebElement automation=driver.findElement(By.cssSelector("input[value='Automation']"));
		automation.click();
		
		
		// For xpath
		WebElement text1=driver.findElement(By.xpath("//input[@type='text']"));
		WebElement clickMe=driver.findElement(By.xpath("//button[@title='Click me!!']"));
		WebElement value1=driver.findElement(By.xpath("//input[@value='female']"));
		WebElement automation1=driver.findElement(By.xpath("//input[@value='Automation']"));
		
		
		

	}

}
