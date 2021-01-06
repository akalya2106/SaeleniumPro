package com.InterviewQues;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class JavaScript {
	public static WebDriver driver;

	@Test
	public void Links() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.leafground.com/home.html");

		//Thread.sleep(4000);
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		//ex.executeScript("location.reload()");
		ex.executeScript("window.scroll(0,800)"); //down
		Thread.sleep(4000);
		ex.executeScript("window.scroll(0,-800)");//up

		ex.executeScript("window.scroll(0,document.body.scrollHeight)");
		ex.executeScript("window.scroll(0,0)");

		WebElement upload = driver.findElement(By.cssSelector("img[src='images/upload.png']"));
		ex.executeScript("arguments[0].scrollIntoView(true)",upload);
		//ex.executeScript("arguments[0].value='abcd'",upload);
		ex.executeScript("arguments[0].click()",upload);
	}
}
