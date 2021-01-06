package com.Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {
	//public static WebDriver driver;

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","D:\\Softlogic\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		// driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		ReverseAString();
	}

	public static void ReverseAString() {
		String name = "Akhu paramu";

		char[] nam =name.toCharArray();
		//System.out.println(nam.length);

		String reversed = "";
		for(int i=nam.length-1; i>=0; i--) {
			reversed =reversed+nam[i];

		}
		System.out.println(reversed);

	}

	public static void ReverseAWord() {
		String name = "Akhu paramu";
		String[] words = name.split(" ");
		String reverse ="";

		for(int i=0;i<name.length();i++) {
			String wrd =words[i];


			char[] w1 =wrd.toCharArray();
			String rev ="";

			for(int j=w1.length-1;j>=0;j--) {
				rev=rev+w1[j];
			}

			reverse=reverse+rev;
		}
		System.out.println(reverse);
	}
}
