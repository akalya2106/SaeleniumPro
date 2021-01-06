package com.Advancedwebdriver;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

public class SortableExample {
	public static WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.leafground.com/");
  }
  
  @Test
  public void sortable() {
	  WebElement sort = driver.findElement(By.linkText("Sortable"));
	  sort.click();
	  
	  List<WebElement> items = driver.findElements(By.xpath("//*[@id='sortable']/li"));
	  
	  for(int i=0;i<items.size();i++){
		  WebElement source = items.get(i);
		  WebElement target = items.get(6);
		  Actions act = new Actions(driver);
		  act.dragAndDrop(source, target).build().perform();
		  
	  }
	  
  
	 
  }

}
