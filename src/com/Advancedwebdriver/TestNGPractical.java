package com.Advancedwebdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGPractical {
	public static WebDriver driver;
	
	 @Test
  public void Method1() {
		 WebElement bicycle = driver.findElement(By.id("bicycle-checkbox"));
		  WebElement bike = driver.findElement(By.id("bike-checkbox"));
		  if(bicycle .isEnabled() && bike .isEnabled()) {
			  if (!bicycle.isSelected() && !bike.isSelected()){
			  bicycle.click();
			  bike.click();
			  }
		  }
		  else {
			  System.out.println("Not enabled");
		  }
		  
		 
  }
	 
	 @Test
	  public void Method2() {
		 WebElement triCycle = driver.findElement(By.id("tricycle-checkbox"));
		  
		  
		  if(triCycle .isEnabled()) {
			  triCycle.click();
		  }
		  else {
			  System.out.println("Disabled");
		  }
		  
		  WebElement novels = driver.findElement(By.id("novels-radio-btn"));
		  novels.getText();
		  System.out.println("Text -" +novels);
		  if (novels .isEnabled()){
			  novels.click();
		  }
		  else {
			  System.out.println("Disabled");
		  }
			 
	  }
	 
	 @Test
	  public void Method3() {
		 String title = driver.getTitle();
		 System.out.println(title);
		 String page = driver.getPageSource();
		 System.out.println(page);
		 String url = driver.getCurrentUrl();
		 System.out.println(url);
		 String currentWindow = driver.getWindowHandle();
		 System.out.println(currentWindow);
			 
	  }
	 
	 @Test
	  public void Method4() {
		 WebElement languages = driver.findElement(By.id("programming-languages"));
		 Select lang = new Select(languages);
		 lang.selectByIndex(3);
		 
		 lang.getOptions().get(3).getText();
		 
		//Get all values
		 List<WebElement> AllLang = lang.getOptions();
		 
		 for (int i=0;i<AllLang.size();i++)  {
			 String text = AllLang.get(i).getText();
			 System.out.println("List:" +text);
		 }
			 
	  }
	 
	 @Test
	  public void Method5() {
		 WebElement alert = driver.findElement(By.xpath("//*[@id='alertBox']"));
		 alert.click();
		 driver.switchTo().alert().accept();
		 driver.navigate().back();
		 
		 WebElement confirm = driver.findElement(By.xpath("//*[@id='confirmBox']"));
		 confirm.click();
		 driver.switchTo().alert().dismiss();
		 driver.navigate().refresh();
		 
		 WebElement prompt = driver.findElement(By.xpath("//button[@id='promptBox']"));
		 WebDriverWait wait = new WebDriverWait(driver, 8);
		 wait.until(ExpectedConditions.visibilityOf(prompt));
		 prompt.click();
		 driver.switchTo().alert().sendKeys("welcome");
		 driver.switchTo().alert().accept();
			 
	  }
	 
	 @Test
	  public void Method6() {
		 WebElement textbox = driver.findElement(By.id("enterText"));
		 Actions act = new Actions(driver);
		 act.moveToElement(textbox).click().keyDown(Keys.SHIFT).sendKeys("automation").keyUp(Keys.SHIFT).build().perform();
			 
	  }
	 
	 @Test
	  public void Method7() {
		 	//DropDown
		 	  WebElement dropdown = driver.findElement(By.id("programming-languages"));
		 	  
		 	  Select sel = new Select(dropdown);
		 	  
		 	  sel.selectByIndex(0);
		 	  sel.selectByValue("Python");
		 	  sel.selectByVisibleText("JavaScript");
		 	  
		 	  String selectedDropdownText = sel.getOptions().get(0).getText();
		 	  
		 	  System.out.println("Selected DropdownValue- " +selectedDropdownText);
		 	  
		 	  List<WebElement> allDropdown = sel.getOptions();
		 	  System.out.println("All Dropdown Values are- ");
		 	  for (int i=0; i<allDropdown.size(); i++){
		 		  String allDropdownValues = allDropdown.get(i).getText();
		 		  System.out.println(allDropdownValues);
		 	  }
		 	  }
		 	  
	 @Test
     public void Method8() {
		 WebElement table = driver.findElement(By.xpath("//*[@id='BooksAuthorsTable']"));
		 
		 List<WebElement> rowTable = driver.findElements(By.xpath("//*[@id='BooksAuthorsTable']//tr"));
		 int row = rowTable.size();
		 for (int i=1;i<=row;i++) {
			 
		 List<WebElement> colTable = driver.findElements(By.xpath("//*[@id='BooksAuthorsTable']//tr[2]//td"));
		 int col = colTable.size();
		 for (int j=1;j<=col;j++) {
			 if (i==1) {
				 String text = driver.findElement(By.xpath("//*[@id='BooksAuthorsTable']//tr["+i+"]//th["+j+"]")).getText();
				 System.out.println(text+ " ");
			 }
			 else {
			 String text = driver.findElement(By.xpath("//*[@id='BooksAuthorsTable']//tr["+i+"]//td["+j+"]")).getText();
			 System.out.println(text);
			 }
		 }
		 }
		 }
		 
	@Test
	public void Method9() throws IOException {
		
		//To read the fileExcel handling
		 
		 FileInputStream read = new FileInputStream("D:\\Softlogic\\Media Delivery Report.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(read);
		 XSSFSheet sheet = workbook.getSheet("sheet1");
		 XSSFRow rowvalue = sheet.getRow(2);
		 XSSFCell cell = rowvalue.getCell(6);
		 System.out.println(cell);
	} 
	
	@Test
	public void Method10() throws IOException {
		
		XSSFWorkbook create = new XSSFWorkbook();
		 FileOutputStream name = new FileOutputStream("D:\\Softlogic\\Testing.xlsx");
		 XSSFSheet sh = create.createSheet("stud");
		 sh.createRow(2).createCell(2).setCellValue("akalya");
		 create.write(name);
	}

@BeforeClass
  public void beforeClass() {
	  driver.manage().window().maximize();
	  driver.navigate().to("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
