package com.Advancedwebdriver;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Windowhandles2 {
	public static WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.leafground.com/");
  }
  
  @Test
  public void clickwindow() {
	  WebElement wind = driver.findElement(By.cssSelector("img[src='images/windows.png']"));
	  wind.click();
	  String parentwin = driver.getWindowHandle();
	  System.out.println(parentwin);
	  
	  
	  WebElement multi = driver.findElement(By.cssSelector("button[onclick='openWindows()']"));
	  multi.click();
	  Set<String> childwin = driver.getWindowHandles();
	  ArrayList<String> name = new ArrayList<>(childwin);
	  String text = name.get(1);
	  
	  WebElement newwindow = driver.findElement(By.id("home"));
	  newwindow.click();	
	}
	  
	  
	  
  }

