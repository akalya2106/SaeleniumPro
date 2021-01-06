package com.Advancedwebdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Test;

public class RobotClass {
	public static WebDriver driver;
  @Test
  public void Robot1() throws AWTException {
	  System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	//Opening url
			driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
			
			//Maximize the page
			driver.manage().window().maximize();
			
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement imageUpload = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("photo"))));
			
			imageUpload.click();
			
			Robot robot = new Robot();
			
			StringSelection selection = new StringSelection("C:\\Users\\jaiar\\Desktop\\Param\\screenshot.png");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
  }
}
