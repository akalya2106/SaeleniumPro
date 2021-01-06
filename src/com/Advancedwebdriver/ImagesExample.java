package com.Advancedwebdriver;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class ImagesExample {
	public static WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
	}

	@Test
	public void image() {

		WebElement image = driver.findElement(By.cssSelector("img[src='images/image.png']"));
		image.click();

		/*WebElement brokenimage = driver.findElement(By.cssSelector("img[src='../images/abcd.jpg']"));

		if(brokenimage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("image is broken");
		}
		else {

			System.out.println("image is not broken");
		}*/

		List<WebElement> img = driver.findElements(By.tagName("img"));
		int size = img.size();
		System.out.println(size);

		for (WebElement image1 : img) {
			if (image1.getAttribute("naturalWidth").equals("0")){
				System.out.println(image1.getAttribute("src"));
			}

		}
	}

}
