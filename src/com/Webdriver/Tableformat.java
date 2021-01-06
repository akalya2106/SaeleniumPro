package com.Webdriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableformat {
	public static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			//gte into the website
			driver.get("https://techcanvass.com/examples/webtable.html");
			
			//finding table
			WebElement ShowroomTable= driver.findElement(By.xpath("//table[@id='t01']"));
			
			//getting row
			List<WebElement> rowTable = driver.findElements(By.xpath("//table[@id='t01']//tr"));
			int row = rowTable.size();
			for (int i=1; i<=row; i++) {
				
			//getting column	
			List<WebElement> colTable = driver.findElements(By.xpath("//table[@id='t01']//tr[2]//td"));
				int col = colTable.size();
				for (int j=1; j<=col; j++) {
					
			//displaying header		
					if (i == 1) {
						String text = driver.findElement(By.xpath("//table[@id='t01']//tr["+i+"]//th["+j+"]")).getText();
						System.out.print(text+ " ");
					}
					else {
					String text = driver.findElement(By.xpath("//table[@id='t01']//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(text+ "  ");
				}
			}
				System.out.println();
		}
			driver.close();

			
		}

}
