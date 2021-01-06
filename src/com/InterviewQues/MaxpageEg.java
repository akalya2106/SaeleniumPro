package com.InterviewQues;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class MaxpageEg {
	public static WebDriver driver;

	@Test(enabled=false)
	public void Maxibrowse() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");

		driver = new ChromeDriver(option);	

		driver.navigate().to("https://www.google.com/");

		WebElement google = driver.findElement(By.cssSelector("input[class='gLFyf gsfi']"));
		google.click();

		//google.sendKeys("akalya" + Keys.ENTER);
		/*google.sendKeys("paramu");
		google.submit();*/

		google.sendKeys("akalya \n");


		//driver.manage().window().maximize();

		/*Dimension dim = new Dimension(1366, 768);
		driver.manage().window().setSize(dim);*/

	}

	@Test
	public void Authenticatepopup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();	

		Thread.sleep(3000);

		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

		//http://username:password@the-internet.herokuapp.com/basic_auth
	}
}

