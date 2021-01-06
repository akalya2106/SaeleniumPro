package com.Advancedwebdriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class AssertionTestNG {
	public static WebDriver driver;
	public static String url = "https://chandanachaitanya.github.io/selenium-practice-site/";
	public static String key = "webdriver.chrome.driver";
	public static String chromePath = "D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe";
	
	public static String expectedUrl = "https://chandanachaitanya.github.io/selenium-practice-site/";
	public static String expectedTitle = "WebDriver Demo Website";
	public static String expectedPrompt = "Which Selenium Tool do you like the most?";
	public static String expectedgooleURL = "https://www.google.co.in/";
	
   @BeforeClass
   public void beforeClass() {
		  System.setProperty(key, chromePath);
				driver = new ChromeDriver();
				driver.get(url);
				driver.manage().window().maximize();
   }


  @Test(priority=0)
  public void verifyURL(){
	String currentUrl =  driver.getCurrentUrl();
	Assert.assertEquals(expectedUrl, currentUrl);
  }
  

  @Test(priority=1)
  public void verifyTitle(){
	  String currentTitle = driver.getTitle();
	  Assert.assertEquals(expectedTitle, currentTitle);
  }
  
  @Test(priority=2)
  public void verifyTricycle(){
	  WebElement tricycle = driver.findElement(By.id("tricycle-checkbox"));
	  Assert.assertFalse(tricycle.isEnabled());
  }
  
  @Test(priority=3)
  public void verifyMagazine(){
	 WebElement magazines = driver.findElement(By.id("magazines-radio-btn"));
	 magazines.click();
	 Assert.assertTrue(magazines.isSelected(),"magazines selected successfully");
	 
  }
	 
	 @Test(priority=4)
	  public void verifyalert(){
		  WebElement alert = driver.findElement(By.id("alertBox"));
		  Assert.assertTrue(alert.isEnabled(),"Alert box enabled successfully");  
  }
	 
	 @Test(priority=5)
	  public void verifyconfirm(){
		  WebElement Confirm = driver.findElement(By.id("confirmBox"));
		  Assert.assertTrue(Confirm.isDisplayed()," box enabled successfully"); 
 }
	 
	 
   @Test(priority=6)
  public void verifypromptbox(){
	   WebElement prompt = driver.findElement(By.id("promptBox"));
	   prompt.click();
	   String text = driver.switchTo().alert().getText();
	   System.out.println(text);
	   driver.switchTo().alert().accept();
	   Assert.assertEquals(text,expectedPrompt);    
}
   
   @Test(priority=7, enabled = false)
   public void verifygoogleURL(){
	driver.findElement(By.id("win1")).click();
 	String currentUrl =  driver.getCurrentUrl();
 	Assert.assertEquals(currentUrl, expectedgooleURL);
   }
   
 
 @Test (priority=8)
  public void verifylanguages(){
     String expectedtext = "Python";
	 WebElement languages = driver.findElement(By.id("programming-languages"));
	 Select obj = new Select (languages);
	 String text = obj.getOptions().get(4).getText();
	 Assert.assertEquals(text, expectedtext);
	 } 
	 
  @AfterClass
  public void afterClass() {
	driver.quit();
  }

}
