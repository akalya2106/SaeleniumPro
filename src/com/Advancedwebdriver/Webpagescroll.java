package com.Advancedwebdriver;
import java.awt.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpagescroll {
	public static WebDriver driver;

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		// To max the window
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//enter into url
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		js.executeScript("window.scrollBy(0,1000)");
		
		
	}

}
 