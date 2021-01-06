package com.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class TestNGAssertions {


	public static WebDriver driver;
	public static String CHROME_DRIVER ="webdriver.chrome.driver";
	public static String CHROME_DRIVER_VALUE ="C:\\Users\\arunkumar.r\\Desktop\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe";
	public static String ExpectedTitle_NewToursHomePage ="Welcome: Mercury Tours";
	public static String URL ="http://newtours.demoaut.com/";

	@BeforeSuite
	public void beforeSuite() {
		System.setProperty(CHROME_DRIVER, CHROME_DRIVER_VALUE);
		driver = new ChromeDriver();
	}

	@BeforeClass
	public void beforeClass() {
		driver.manage().window().maximize();
	}

	@Test
	public void verifyTitleofWebsite() {
		driver.get(URL);
		String actualTitle =driver.getTitle();
		Assert.assertEquals(actualTitle, ExpectedTitle_NewToursHomePage);
	}

	@Test
	public void verifySignInButtonIsEnables() {
		driver.get(URL);
		WebElement elementSignIn = driver.findElement(By.name("login"));
		Assert.assertTrue(elementSignIn.isEnabled());
	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}


}
