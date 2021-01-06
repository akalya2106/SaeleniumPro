package property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Property {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		FileInputStream fileP =   new FileInputStream("Config.properties");
		
		Properties prop = new Properties();
		prop.load(fileP);
		String browser=  prop.getProperty("browser");
		String path =  prop.getProperty("pathLocation");
		 
		if (browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", path);
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", path);
			driver = new FirefoxDriver();
		}
		
	}

}
