package com.InterviewQues;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshoteg {
	public static WebDriver driver;
	
	@Test
	public void Screenshotways() throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alert = driver.findElement(By.cssSelector("button[onclick='normalAlert()']"));
		alert.click();
		
		/*TakesScreenshot take = (TakesScreenshot) driver;
		File source= take.getScreenshotAs(OutputType.FILE);
		File dest = new File("TakesScreenshot.png");
		FileHandler.copy(source, dest);*/
		
		Robot robo = new Robot();
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec =new Rectangle(size);
		BufferedImage sourceimg = robo.createScreenCapture(rec);
		File dest = new File("RobotScreenshot.png");
		ImageIO.write(sourceimg, "png", dest);
		
	}

}
