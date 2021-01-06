package com.Advancedwebdriver;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot {
	public static WebDriver driver;
	
	@Test
	public void initial() throws IOException {
	System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://facebook.com/");
	  TakesScreenshot ts = (TakesScreenshot) driver;
	  File source = ts.getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(source, new File("D:\\Softlogic\\screenshot.png")); 
  }
}
