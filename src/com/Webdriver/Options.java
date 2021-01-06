package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Options {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		WebElement Reg=driver.findElement(By.linkText("REGISTER"));
		Reg.click();
		
		WebElement dropdown=driver.findElement(By.name("country"));
		Select select=new Select(dropdown);
		
		//Selecting drop options
		select.selectByIndex(4);
		Thread.sleep(2000);
		select.selectByValue("7");
		Thread.sleep(2000);
		select.selectByVisibleText("BELGIUM");
		Thread.sleep(2000);
		
		//Getting all values in the dropdown
		java.util.List<WebElement> dropdownVal1 = select.getOptions();
		
		int i=0;
	do {
		String dropdownValues = dropdownVal1.get(i).getText();
		System.out.println("Dropdown values are : "+dropdownValues);
		i++;
		}
		while (i<dropdownVal1.size());
		
	}
}
