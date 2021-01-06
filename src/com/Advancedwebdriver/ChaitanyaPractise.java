package com.Advancedwebdriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class ChaitanyaPractise {
	public static WebDriver driver;
	
	
  @Test
  public void f() throws InterruptedException, IOException {
	  System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
	  
	  //Implicit wait
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //DOM
	  driver.manage().window().maximize();
	  
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
	  
	 String title = driver.getTitle();
	 System.out.println(title);
	 String page = driver.getPageSource();
	 System.out.println(page);
	 String url = driver.getCurrentUrl();
	 System.out.println(url);
	 String currentWindow = driver.getWindowHandle();
	 System.out.println(currentWindow);
	 
	//get single element
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
	 
	 WebElement SeleniumTool = driver.findElement(By.id("selenium_suite"));
	 Select tool= new Select(SeleniumTool);
	 tool.selectByValue("WebDriver");
	 
	 List<WebElement> Alltool = tool.getOptions();
	 
	 for(int i=0;i<Alltool.size();i++)  {
		 String text1 = Alltool.get(i).getText();
		 System.out.println("Tools are:" +text1);
	 }
	 
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
	 
	 
	 
	 WebElement textbox = driver.findElement(By.id("enterText"));
	 Actions act = new Actions(driver);
	 act.moveToElement(textbox).click().keyDown(Keys.SHIFT).sendKeys("automation").keyUp(Keys.SHIFT).build().perform();
	 
	 Thread.sleep(3000);
	 
	 WebElement click = driver.findElement(By.id("click"));
	 WebElement element = driver.findElement(By.id("clickAndHold"));
	 Action detail = act
			 .clickAndHold(click)
			 .moveToElement(element)
			 .release(click)
			 .build();
	         detail.perform();
	         
	   WebElement newBrowser = driver.findElement(By.id("win1"));
	   newBrowser.click();
	   
	   String parentwindow = driver.getWindowHandle();
	   System.out.println("parent window:" +parentwindow);
	   
	   Set<String> child = driver.getWindowHandles();
	   for (String childwin : child){
		   System.out.println(childwin);
	   }
	 
	 ArrayList<String> win = new ArrayList<>(child);
	 String parent = win.get(0);
	 String child1 = win.get(1);
	 
	 //To fond the table
	 
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
	 //To read the fileExcel handling
	 
	 FileInputStream read = new FileInputStream("D:\\Softlogic\\Media Delivery Report.xlsx");
	 XSSFWorkbook workbook = new XSSFWorkbook(read);
	 XSSFSheet sheet = workbook.getSheet("sheet1");
	 XSSFRow rowvalue = sheet.getRow(2);
	 XSSFCell cell = rowvalue.getCell(6);
	 System.out.println(cell);
	 

	//readallvalues
		 int rowsize = sheet.getLastRowNum();
		 int colsize = rowvalue.getLastCellNum();
		 
		 for (int i=0; i<=rowsize; i++){
			 XSSFRow rowXcel = sheet.getRow(i);
			 for (int j=0; j<colsize; j++) {
			 XSSFCell celxcel = rowXcel.getCell(j);
			 System.out.print(celxcel);
			 }
			 System.out.println();
		 }
		 
		 
		 
		 
	 
	 //To write the createXcel
	 XSSFWorkbook create = new XSSFWorkbook();
	 FileOutputStream name = new FileOutputStream("D:\\Softlogic\\Testing.xlsx");
	 XSSFSheet sh = create.createSheet("stud");
	 sh.createRow(2).createCell(2).setCellValue("akalya");
	 create.write(name);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
			 
	 
	 
	 
	 
	  
	  
  }
}
