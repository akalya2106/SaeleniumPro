package com.Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TechlisticWebsite {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		// To max the window
		driver.manage().window().maximize();
		
		//enter into url
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		//To scrolldown the page
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		
		//To enter the firstname
		WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
		firstName.sendKeys("Techlist");
		
		//To enter the lastname
		WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
		lastName.sendKeys("T");
		
		//To scrolldown the page
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//To click the radio button
		WebElement female =driver.findElement(By.cssSelector("input[id='sex-1']"));
		female.click();
		
		// To click the next radio button
		WebElement year = driver.findElement(By.cssSelector("input[id='exp-1']"));
		year.click();
		
		// To enter the date details
		WebElement date = driver.findElement(By.cssSelector("input[id='datepicker']"));
		date.sendKeys("29-03-2020");
		
		//To select the checkbox button
		WebElement manual = driver.findElement(By.id("profession-0"));
		if(manual.isSelected())
		{
			System.out.println("Already selected");
		}
		else {
			manual.click();
		}
		
		WebElement automation =driver.findElement(By.id("profession-1"));
		if(automation.isSelected())
		{
			automation.click();
		}
		else {
			
		}
		
		WebElement utf = driver.findElement(By.id("tool-0"));
		if(utf.isSelected())
		{
			utf.click();
		}
		else {
			
		}
		WebElement pro =driver.findElement(By.id("tool-1"));
		WebElement sel =driver.findElement(By.id("tool-2"));
		if(!pro.isSelected()&& !sel.isSelected())
		{
			pro.click();
			sel.click();
		}
		
		//pagedown
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//To dropdown the values
		WebElement name = driver.findElement(By.name("continents"));
		Select select=new Select(name);
		
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByVisibleText("Australia");
		Thread.sleep(2000);
		
		//getting all values in the dropdown value
		List<WebElement> Allvalues = select.getOptions();
		
		for (int i=0;i<Allvalues.size();i++)
		 {
			System.out.println(Allvalues.size());
			String values1 = Allvalues.get(i).getText();
			System.out.println("names are : = "+values1);
		}
		
		// To click the linkText
		WebElement link =driver.findElement(By.linkText("Click here to Download File"));
		link.click();
		driver.navigate().back();
		
		//To click the button
		WebElement button = driver.findElement(By.id("submit"));
		button.click();
		
		// 
		WebElement photo = driver.findElement(By.id("photo"));
		photo.sendKeys("G:\\saravanan2\\Screenshot_20180605-095803.png");
		driver.close();		
		
	}

}
