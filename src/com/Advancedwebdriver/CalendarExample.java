package com.Advancedwebdriver;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

public class CalendarExample {
	public static WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
	}

	@Test
	public void calendar() {
		WebElement date = driver.findElement(By.linkText("Calendar"));
		date.click();

		WebElement datepick = driver.findElement(By.id("datepicker"));
		//datepick.sendKeys("04232020" +Keys.ENTER);
		datepick.click();
		WebElement june = driver.findElement(By.linkText("Next"));

		june.click();


		WebElement date21 = driver.findElement(By.linkText("21"));
		date21.click();



	}

}
