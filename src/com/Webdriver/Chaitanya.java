package com.Webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chaitanya {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Chaitanya obj = new Chaitanya();
		obj.part1();
		part2();
		part3();
	}
		
		public void part1(){
			
		System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		// To max the window
		driver.manage().window().maximize();
		
		//enter into url
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		
		//To apply implicit 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//To perform the checkbox
		WebElement bicycle = driver.findElement(By.cssSelector("input[id='bicycle-checkbox']"));
		WebElement bike = driver.findElement(By.cssSelector("input[id='bike-checkbox']"));
		
		if(bicycle .isEnabled() && bike .isEnabled()){
			if(bicycle .isSelected() && bike .isSelected())
		{
			System.out.println("Already selected");
		}
		else {
			bicycle.click();
			bike.click();
		}
		}
		
		//To click the radio button
		WebElement Magazines =driver.findElement(By.cssSelector("input[id='magazines-radio-btn']"));
		Magazines.click();
		
		if(Magazines .isEnabled())
		{
			Magazines.click();
		}
		
	}
		
		public static void part2() throws InterruptedException {
		
		// To dropdown the values
		WebElement languages = driver.findElement(By.cssSelector("select[id='programming-languages']"));
		
		Select programming = new Select(languages);
		programming.selectByVisibleText("Java");
		
		//getting all list values
		List<WebElement> AllLanguages = programming.getOptions();
		
		System.out.println(AllLanguages.size());
		
		for(int i=0;i<AllLanguages.size();i++)
		{
			String lang=AllLanguages.get(i).getText();
			System.out.println("Languages are : = "+lang);
		}
		
		//Next Dropdown the values
		WebElement selenium = driver.findElement(By.id("selenium_suite"));
		
		Select Tool =new Select(selenium);
		Tool.selectByVisibleText("Selenium WebDriver");
			
		//To click the alert box
		WebElement alert = driver.findElement(By.id("alertBox"));
		alert.click();
		driver.switchTo().alert().accept();
		driver.navigate().back();
		
				
		//To click the confirmation box
		WebElement confirm1 = driver.findElement(By.id("confirmBox"));
		confirm1.click();
		driver.switchTo().alert().dismiss();
		driver.navigate().back();	
		
		//To apply explicit Wait
		WebDriverWait wait= new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("promptBox")));
		
		//To click the prompt box
		WebElement prompt = driver.findElement(By.cssSelector("button[id='promptBox']"));
		prompt.click();
		Thread.sleep(3000);
		String text1 = driver.switchTo().alert().getText();
		System.out.println(text1);
		
		driver.switchTo().alert().sendKeys("selenium WD"); 
		driver.switchTo().alert().accept();
		driver.navigate().back();
		
		}
	
		public static void part3 (){
		//finding table
		WebElement Authors = driver.findElement(By.xpath("//table[@id='BooksAuthorsTable']"));
		
		//getting row
		List<WebElement> rowTable = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr"));
		int row = rowTable.size();
		for (int i=1; i<=row; i++) {
			
		//getting column	
		List<WebElement> colTable = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']//tr[2]//td"));
			int col = colTable.size();
			for (int j=1; j<=col; j++) {
				
		//displaying header		
				if (i == 1) {
					String text = driver.findElement(By.xpath("//table[@id='BooksAuthorsTable']//tr["+i+"]//th["+j+"]")).getText();
					System.out.print(text+ "   ");
				}
				else {
				String text = driver.findElement(By.xpath("//table[@id='BooksAuthorsTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(text+ "    ");
			}
		}
			System.out.println();
	}
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//Entering text
		WebElement text = driver.findElement(By.cssSelector("input[id='enterText']"));
		act.moveToElement(text).click().keyDown(Keys.SHIFT).sendKeys("god").keyUp(Keys.SHIFT).build().perform();
				
		//To click the browser window
		WebElement window = driver.findElement(By.cssSelector("button[id='win1']"));
		window.click();
		driver.navigate().back();
		
		driver.quit();
	}
		
}


