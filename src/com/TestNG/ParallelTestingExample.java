package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestingExample {
	public static WebDriver driver;

@Test
public void openGoogle() {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();	
	driver.get("https://www.google.com/");
	driver.close();
}

@Test
public void openyahoo(){
	
	System.setProperty("webdriver.chrome.driver", "D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://yahoo.com/");
	driver.close();	
}

@Test
public void openping() {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://ping.com/");                          
	driver.close();	
}
	
	 
	
}


