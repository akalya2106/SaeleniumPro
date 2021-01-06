package com.Advancedwebdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void Method1() {
	  System.out.println("This is the Method1");
  }
  @Test
  public void Method2() {
	  System.out.println("This is the Method2");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is the BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is the AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is Beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is Afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is AfterSuite");
  }

}
