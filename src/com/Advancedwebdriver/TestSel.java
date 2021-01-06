package com.Advancedwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSel {
	public static WebDriver driver;
	
  @BeforeTest
  public void f() {
	  System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
	  } 
  
	  @Test
	 public void bikeAlreadySelected() {	  
	 WebElement bikeBox = driver.findElement(By.id("check1"));
	 boolean value = bikeBox.isSelected();
	 System.out.println(value);
	 Assert.assertTrue(value);
	 
	/* WebElement carBox = driver.findElement(By.id("check2"));
	 boolean value1 =carBox.isEnabled();
	 System.out.println(value1);
	 
	 Assert.assertTrue(value1);
	 
	 carBox.click();
	 //Assert.assertTrue(carBox.isSelected());
	 boolean value2 = carBox.isSelected();
	 System.out.println(value2);
	 
	 Assert.assertTrue(value2);
	 */
	 }	 
	  
	@Test
	 public void volvoCase() {
		 WebElement cars = driver.findElement(By.id("Carlist"));
		 Select carList = new Select(cars);
		 String car = carList.getFirstSelectedOption().getText();
		 System.out.println(car);
		 String expectedtext = "Volvo";
		 Assert.assertEquals(car, expectedtext); 
		 }
	
		 @Test
		  public void IndiaMove() {
			 WebElement dropDown = driver.findElement(By.name("FromLB"));
			 dropDown.sendKeys("India");
			//elect india1 = new Select(dropDown);
			//ndia1.selectByVisibleText("India");
		//String india = india1.getFirstSelectedOption().getText();
			
			 
			 WebElement move = driver.findElement(By.cssSelector("input[onclick='move(this.form.FromLB,this.form.ToLB)']"));
			 move.click();
			 WebElement move1 = driver.findElement(By.name("ToLB"));
			 String compare = move1.getText();
			 System.out.println(compare);
			 
		//Assert.assertEquals(india, compare);
	
		 }
		 
	 }
	 
	 
  	 
	
  

