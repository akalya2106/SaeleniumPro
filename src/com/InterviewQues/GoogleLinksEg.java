package com.InterviewQues;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleLinksEg {
	public static WebDriver driver;

	@Test
	public void Links() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();	
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		WebElement goog = driver.findElement(By.name("q"));
		goog.sendKeys("selenium");
		List<WebElement> listitems = driver.findElements(By.xpath("//*[@class='erkvQe']//li"));
		/*for (WebElement items : listitems) {
			String output =items.getText();
			System.out.println(output);	
		}*/

		listitems.get(4).click();

		/*for (WebElement select : listitems) {
			if (select.getText().equals("selenium testing")) {
				select.click();
				break;
			}*/

		/*List<WebElement> link=driver.findElements(By.tagName("a"));
		int li =link.size();
		System.out.println(li);
		for (WebElement linksss : link) {
			String href = linksss.getAttribute("href");
			System.out.println(href);
		}*/

		List<WebElement> cite = driver.findElements(By.tagName("cite"));

		for (WebElement citesss : cite) {
			String text = citesss.getText();
			System.out.println(text);
		}
	}
}


