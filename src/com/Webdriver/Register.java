package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		WebElement Reg=driver.findElement(By.linkText("REGISTER"));
		Reg.click();
		WebElement Firname=driver.findElement(By.name("firstName"));
		Firname.sendKeys("Akalya");
		WebElement Lastname=driver.findElement(By.name("lastName"));
		Lastname.sendKeys("V");
		WebElement phno=driver.findElement(By.name("phone"));
		phno.sendKeys("8056604083");
		WebElement mailid=driver.findElement(By.id("userName"));
		mailid.sendKeys("gv.akalyaram@gmail.com");
		WebElement Address=driver.findElement(By.name("address1"));
		Address.sendKeys("Northgate post tnj");
		WebElement city=driver.findElement(By.name("city"));
		city.sendKeys("Thanjavur");
		WebElement state=driver.findElement(By.name("state"));
		state.sendKeys("Tamilnadu");
		WebElement postalcode=driver.findElement(By.name("postalCode"));
		postalcode.sendKeys("613008");
			
	}

}
