package com.InterviewQues;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javaScriptEg {
	public static WebDriver driver;

	@Test
	public void Links() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.guru99.com/execute-javascript-selenium-webdriver.html");

		JavascriptExecutor exe = (JavascriptExecutor) driver;

		//exe.executeScript("location.reload()");

		/*exe.executeScript("window.scroll(0,1000)");

		exe.executeScript("window.scroll(0,600)");

		exe.executeScript("window.scroll(0,document.body.scrollHeight)");

		exe.executeScript("window.scroll(0,0)");
		 */
		WebElement guru = driver.findElement(By.linkText("http://demo.guru99.com/V4/"));

		exe.executeScript("arguments[0].click();", guru);
		//exe.executeScript("arguments[0].scrollIntoView(true)", guru);
		exe.executeScript("arguments[0].value='selenium'", guru);
	}
}
