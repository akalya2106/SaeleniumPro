package com.Advancedwebdriver;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Frameexample {
	public static WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.leafground.com/");
  }
  
  @Test
  public void frames() {
	  WebElement frameopen = driver.findElement(By.cssSelector("img[src='images/frame.png']"));
	  frameopen.click();
	  driver.switchTo().frame(0);
	  WebElement frame1 = driver.findElement(By.id("Click"));
	  frame1.click();
	  String txt = frame1.getText();
	  System.out.println(txt);
	  
	  driver.switchTo().defaultContent();
	  
	  driver.switchTo().frame(1);
	  driver.switchTo().frame("frame2");
	  WebElement nested = driver.findElement(By.cssSelector("button[onclick='change()']"));
	  nested.click();
	  
	  driver.switchTo().defaultContent();
	  
	  List<WebElement> total = driver.findElements(By.tagName("iframe"));
	  int count = total.size();
	  System.out.println(count);
	  
	  
  }

}
