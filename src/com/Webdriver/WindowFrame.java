package com.Webdriver;

import java.awt.Window;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowFrame {
	public static WebDriver driver;
	static String  child;

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		// To max the window
		driver.manage().window().maximize();
		
		switchtodiffwindow();
		
	}
	
	public static void gettingwindowname() {
		
		//enter into url
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		
		//get window
		
		String parentWinHandle =  driver.getWindowHandle();
		System.out.println("Current window name is : "+parentWinHandle);
		
		
		driver.findElement(By.id("win1")).click();
		driver.switchTo().window(parentWinHandle);
		driver.findElement(By.id("win1")).click();
		driver.switchTo().window(parentWinHandle);
		
		WebElement smallWindow = driver.findElement(By.id("win2"));
		smallWindow.click();
		
		Set<String> windw = driver.getWindowHandles(); //give the window names
		for ( String child : windw) {
			System.out.println( "window names- :"+child);
			driver.switchTo().window(child);
			String titles =driver.getTitle();
			System.out.println("Titles are :" +titles);
		}
		driver.switchTo().window(child);
		driver.close();
	}
	




//

public static void switchtodiffwindow() {
	
	//enter into url
			driver.get("https://www.naukri.com/");
			
	//getting parent window
			String parentWindow = driver.getWindowHandle();
			System.out.println("parent name is :" +parentWindow);
			
	//To get a linktext
			WebElement accenture = driver.findElement(By.linkText("Accenture"));
			accenture.click();
			driver.switchTo().window(parentWindow);
			
	//getting child window name
			Set<String> windows = driver.getWindowHandles();
			int winno = windows.size();
			System.out.println("No. of windows are : "+winno);
			
			ArrayList<String> newtabs = new ArrayList<String>(windows);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
	
	
}
