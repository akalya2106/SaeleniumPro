package com.InterviewQues;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class WitoutSetproperty {
	public static WebDriver driver;
	
	@Test
	public void browser() {
		//System.setProperty("webdriver.chrome.driver", "D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();	
		driver.get("https://www.google.com/");
		
		WebElement mail = driver.findElement(By.linkText("Gmail"));
		String value = mail.getCssValue("text-decoration");
		System.out.println(value);
		
		Actions act =new Actions(driver);
		act.moveToElement(mail).build().perform();
		String value1 = mail.getCssValue("text-decoration");
		System.out.println(value1);
		
		//driver.switchTo().activeElement().sendKeys("India \n");
		
		//WebElement google = driver.findElement(By.cssSelector("input[class='gLFyf gsfi']"));
		//sendkeys
		//google.sendKeys("");
		
		//javascript
		//JavascriptExecutor exe = (JavascriptExecutor) driver;
		//exe.executeScript("arguments[0].value='India'", google);
		
		//exe.executeScript("document.getElementsByName('q')[0].value='India'","");
		
		//rotobclass
		
		//actionclass
		
	}

}