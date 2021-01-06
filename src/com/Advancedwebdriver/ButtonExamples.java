package com.Advancedwebdriver;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class ButtonExamples {
	public static WebDriver driver;
 
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.leafground.com/pages/Button.html");
  }
  
  @Test
  public void buttonposition() {
	  WebElement button = driver.findElement(By.id("position"));
	  Point xypoint = button.getLocation();
	  int x =xypoint.getX();
	  int y=xypoint.getY();
	  System.out.println(x);
	  System.out.println(y);
	  
 }
  
  @Test
  public void buttoncolor() {
	  WebElement color = driver.findElement(By.id("color"));
	  String test = color.getCssValue("background-color");
	  System.out.println(test);
 }
  @Test
  public void buttonsize() {
	  WebElement size = driver.findElement(By.id("size"));
	  int height = size.getSize().getHeight();
	  int width = size.getSize().getWidth();
	  System.out.println(height);
	  System.out.println(width);
	  
	  
  }
  
  
  
  

}
