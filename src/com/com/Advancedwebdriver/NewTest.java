package com.com.Advancedwebdriver;

import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class NewTest {
	public static WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.leafground.com/");
  }
  
  
  @Test
  public void windows() {
	  WebElement wind = driver.findElement(By.cssSelector("img[src='images/windows.png']"));
	  wind.click();
	  
	  WebElement homepage = driver.findElement(By.id("home"));
	  homepage.click();
	  
	  String parentWindow = driver.getWindowHandle();
	  System.out.println(parentWindow);
	  
	 Set<String> handles = driver.getWindowHandles();
	 for (String childwindow : handles) {
		 driver.switchTo().window(childwindow);
	 }
	 WebElement butt = driver.findElement(By.cssSelector("*[src='images/edit.png']"));
	 butt.click();
	 
	 driver.close();
	 
	 driver.switchTo().window(parentWindow);
	 
	 WebElement multi = driver.findElement(By.cssSelector("button[onclick='openWindows()']"));
	 multi.click();
	 Set<String> mul = driver.getWindowHandles();
	 int fin = mul.size();
	 System.out.println(fin);
	 
	 WebElement green = driver.findElement(By.cssSelector("button[style='background-color:lightgreen']"));
	 green.click();
	 Set<String> chil = driver.getWindowHandles();
	 for (String chil1 : chil) {
		 if(!chil1.equals(parentWindow)){
		 driver.switchTo().window(chil1);
		 driver.close();
		 }
	}
	 
	 
	 
		 
		
	}
  }
  
  

