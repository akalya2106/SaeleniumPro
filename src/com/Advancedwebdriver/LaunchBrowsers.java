package com.Advancedwebdriver;

import java.awt.color.ICC_ColorSpace;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class LaunchBrowsers {
	public static WebDriver driver;
	
  @Test
  public void chrome() {
	  System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	  driver.navigate().to("https://chandanachaitanya.github.io/selenium-practice-site/");
	  
}
  @Test
  public void Firefox() {
	  System.setProperty("webdriver.gecko.driver","D:\\Softlogic\\Selenium Softwares\\geckodriver-v0.26.0-win32\\geckodriver.exe");
	  driver= new FirefoxDriver();
  
  }
  
  @Test
  public void Ie() {
	  System.setProperty("webdriver.ie.driver","D:\\Softlogic\\Selenium Softwares\\IEDriverServer.exe");
	  driver= new InternetExplorerDriver();
  } 
}
