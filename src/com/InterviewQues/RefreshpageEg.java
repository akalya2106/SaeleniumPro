package com.InterviewQues;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.Location;
import org.testng.annotations.Test;

public class RefreshpageEg {
	public static WebDriver driver;

	@Test
	public void Refreshpages() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.navigate().to("https://www.facebook.com/");
		
		
		Thread.sleep(3000);
		/*WebElement link = driver.findElement(By.linkText("Go to Home Page"));
		link.click();*/
		
		//driver.navigate().refresh();
		//driver.get(driver.getCurrentUrl());
		
		/*Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_F5);
		robo.keyRelease(KeyEvent.VK_F5);*/
		
		JavascriptExecutor execute = (JavascriptExecutor)driver;
		execute.executeScript("location.reload()");
		
		
		
	}
}
