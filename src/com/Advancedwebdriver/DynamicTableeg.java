package com.Advancedwebdriver;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class DynamicTableeg {
	public static WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
  }

  @Test
  public void table() throws InterruptedException {
	  WebElement tab = driver.findElement(By.cssSelector("img[src='images/table.png']"));
	  tab.click();
	  
	  WebElement sle = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact using Keyboard, Actions']//following::td[1]"));
	  String value = sle.getText();
	  System.out.println(value);
	  
	  List<WebElement> table1 = driver.findElements(By.xpath("//*[@id='table_id']//td[2]"));
	  
	  List<Integer> inte = new ArrayList<Integer>();
	  
	  for (WebElement values : table1) {
		  String all = values.getText().replace("%", "");
		  int test = Integer.parseInt(all);
		  inte.add(test);
	}
	  
	  System.out.println(inte);
	  
	  int smallVal = Collections.min(inte);
	  String small = Integer.toString(smallVal)+"%";
	  System.out.println(small);
	 // String xpath= "//td[normalize-space()='"+small+"']//following::td[1]";
	  
	  String xpath= "//td[normalize-space()="+"\""+small+"\""+"]"+"//following::td[1]";
	  System.out.println(xpath);
	  
	  WebElement end = driver.findElement(By.xpath(xpath));
	  Thread.sleep(3000);
	  end.click();
	  
  }
}
