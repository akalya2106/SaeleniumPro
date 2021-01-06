package com.TestNG;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuite {
	public static WebDriver driver;
	long starttime;
	long endtime;

	
	@BeforeSuite
	public void beforesuite() {
	starttime = System.currentTimeMillis();
	
	}
@Test
public void openGoogle() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaiar\\Desktop\\Param\\Software\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();	
	driver.get("https://www.google.com/");
	
}

@Test
public void openyahoo(){
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaiar\\Desktop\\Param\\Software\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://yahoo.com/");
		
}

@Test
public void openping() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaiar\\Desktop\\Param\\Software\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://ping.com/");
		
}

 @AfterSuite 
 public void aftersuite() {
	 driver.close();
	 endtime = System.currentTimeMillis();
	 long Totaltime=endtime-starttime;
	 System.out.println("Total time Taken:" +Totaltime);
 }
	 
	
	 
	
}
