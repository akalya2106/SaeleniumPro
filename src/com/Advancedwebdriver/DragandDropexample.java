package com.Advancedwebdriver;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

public class DragandDropexample {
	public static WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.leafground.com/");
	  
  }
  
  @Test
  public void drag() {
	  WebElement draganddrop = driver.findElement(By.cssSelector("img[src='images/droppable.png']"));
	  draganddrop.click();
	  Actions act = new Actions(driver);
	  WebElement source = driver.findElement(By.id("draggable"));
	  WebElement target = driver.findElement(By.id("droppable"));
	  act.clickAndHold(source).moveToElement(target).release(source).build().perform();
	  driver.navigate().back();
  }
  
  @Test
  public void tooltip() {
	  WebElement tip = driver.findElement(By.cssSelector("img[src='images/tip.png']"));
	  tip.click();
	  WebElement name = driver.findElement(By.id("age"));
	  String tit = name.getAttribute("title");
	  System.out.println(tit);
	  
  }

}
