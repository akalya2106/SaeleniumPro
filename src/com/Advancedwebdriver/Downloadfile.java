package com.Advancedwebdriver;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class Downloadfile {
	public static WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.leafground.com/");
  }
  
  @Test
  public void upload() throws Exception {
	  
	  WebElement up = driver.findElement(By.cssSelector("img[src='images/upload.png']"));
	  up.click();
	  
	  WebElement choose = driver.findElement(By.cssSelector("input[name='filename']"));
	  choose.sendKeys("D:\\Softlogic\\Testing.xlsx");
	  choose.clear();
	  Thread.sleep(2000);
	  choose.sendKeys(Keys.ENTER);
	  StringSelection sele = new StringSelection("D:\\Softlogic\\Testing.xlsx");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sele, null);
	  
	  Robot robo =new Robot();
	  
	  robo.keyPress(KeyEvent.VK_CONTROL);
	  robo.keyPress(KeyEvent.VK_V);
	  
	  robo.keyRelease(KeyEvent.VK_CONTROL);
	  robo.keyRelease(KeyEvent.VK_V);
	  
	  robo.keyPress(KeyEvent.VK_ENTER);
	  robo.keyRelease(KeyEvent.VK_ENTER);
  }
  
  
  @Test(enabled = false)
  public void download() throws InterruptedException {
	  
	  WebElement down = driver.findElement(By.cssSelector("img[src='images/download.png']"));
	  down.click();
	  
	  WebElement excel = driver.findElement(By.linkText("Download Excel"));
	  excel.click();
	  
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
	  File file = new File("C:\\Users\\Akalya\\Documents\\Downloads\\");
	  
	  File[] allfil = file.listFiles();
	  
	  for (File file2 : allfil) {
		if(file2.getName().equals("testleaf.xlsx")){
			System.out.println("File downloaded");
		}
	}
	  driver.navigate().back();
	  
  }

}
