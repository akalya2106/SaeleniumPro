package com.Advancedwebdriver;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cookies {
	public static WebDriver driver;
  @Test
  public void Cookies1() throws IOException {
	  System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://newtours.demoaut.com/");
	  
	  driver.findElement(By.name("userName")).sendKeys("12345@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("Automation");
	  
      driver.findElement(By.name("login")).click();
	  
	  File file = new File("cookies.data");
	  file.delete();
	  file.createNewFile();
      FileWriter write = new FileWriter(file);
	  
	  BufferedWriter Bwrite = new BufferedWriter(write);
	  
	  for (Cookie ck : driver.manage().getCookies()) {
		  
		  String writeUp = ck.getName()+";"+ck.getValue()+";"+ck.getPath()+";"+ck.getDomain();
		  Bwrite.write(writeUp);
		  Bwrite.newLine();
	  }



  }
}
