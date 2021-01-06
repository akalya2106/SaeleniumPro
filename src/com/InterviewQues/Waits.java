package com.InterviewQues;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Waits {
	public static WebDriver driver;
	
	@Test
	public void php() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("https://phptravels.net/login");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.cssSelector("input[name='username']"));
		username.sendKeys("admin@gmail.com");
		
		WebElement paswrd = driver.findElement(By.cssSelector("input[name='password']"));
		paswrd.sendKeys("admindemo");
		
		WebElement login = driver.findElement(By.xpath("//button[@style='font-size: 16px;']"));
		login.click();
		
		/*WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement profile = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='My Profile']")));
		profile.click();*/
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				//.withTimeout(20, TimeUnit.SECONDS)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
		WebElement waiting = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("//a[text()='My Profile']"));
			}
		});
}
}
