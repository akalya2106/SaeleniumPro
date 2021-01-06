package com.Advancedwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LinkExample {
	public static WebDriver driver;


	@BeforeClass
	public void beforeClass() {	
		System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");

	}

	@Test
	public void linkseg() {
		/*WebElement home = driver.findElement(By.linkText("Go to Home Page"));
	  home.click();

	  driver.navigate().back();*/

		WebElement hyperlink = driver.findElement(By.linkText("HyperLink"));
		hyperlink.click();

		/* WebElement withoutclick = driver.findElement(By.partialLinkText("without clicking me?"));
	  String where = withoutclick.getAttribute("href");
	  System.out.println("final link:" +where); */

		/*WebElement broken = driver.findElement(By.linkText("Verify am I broken?"));
		broken.click();*/

		List<WebElement> link = driver.findElements(By.tagName("a"));
		for (WebElement li : link) {
			li.click();
			/*String title = driver.getTitle();
			if (title.contains("404")){
				System.out.println("Broken link :"+title);
			}
			driver.navigate().back();*/
		}

	}



	/*String title=  driver.getTitle();
		if(title.contains("404")) {
			System.out.println("link is broken");

			driver.navigate().back();
		}*/


	/*  List<WebElement> totallinks = driver.findElements(By.tagName("a"));
	  int type = totallinks.size();
	  System.out.println("No of links:" +type);*/
	}


