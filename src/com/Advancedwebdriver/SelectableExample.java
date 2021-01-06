package com.Advancedwebdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectableExample {
	public static WebDriver driver;
	
@BeforeClass
	  public void beforeClass() {
	   System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.leafground.com/");
}
  @Test
  public void selectableoperation() {
	  WebElement selectable = driver.findElement(By.cssSelector("img[src='images/selectable.png']"));
	  selectable.click();
	  List<WebElement> lis = driver.findElements(By.xpath("//*[@id='selectable']/li"));
	  int count = lis.size();
	  System.out.println(count);
	  Actions act = new Actions(driver);
	  act.keyDown(Keys.CONTROL).click(lis.get(0)).click(lis.get(1)).click(lis.get(2)).keyUp(Keys.CONTROL).build().perform();
	  driver.navigate().back();
	  }
  
  @Test(priority = 1)
  public void Autocomplete() throws InterruptedException {
	  WebElement auto = driver.findElement(By.cssSelector("img[src='images/autocomplete.png']"));
	  auto.click();
	  
	  WebElement Web = driver.findElement(By.cssSelector("input[class='ui-autocomplete-input']"));
	  Web.sendKeys("s");
	  
	  
	
	  driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	  
	  List<WebElement> matchingele = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
	  int count1 = matchingele.size();
	  System.out.println(count1);
	  
	  Actions act1 = new Actions(driver);
	  act1.click(matchingele.get(3)).build().perform();
	 
	 /* for (WebElement list4 : matchingele) {
		if (list4.getText().equals("Web Services")){
		list4.click();
		break;
		}
	}*/
 }
  
}
  

