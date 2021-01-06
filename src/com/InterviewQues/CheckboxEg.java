package com.InterviewQues;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckboxEg {
	public static WebDriver driver;

	@Test
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/checkbox.html");

		List<WebElement> check = driver.findElements(By.cssSelector("input[type='checkbox']"));

		for (WebElement selectall : check) {
			if (selectall.isSelected()){
				
			}
			else {
				selectall.click();
			}
		}
	}


	@Test(enabled= false)
	public void google() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();	
		driver.get("https://www.google.com/");

		WebElement goog = driver.findElement(By.name("q"));
		goog.sendKeys("god");


	}

}
