package com.TestNG;

import org.testng.annotations.Test;

public class GroupingTestcase {
  
 @Test (groups={"Apple"})
  public void Apple1() {
	 System.out.println("Apple brand 1");
	 
  }
 @Test(groups={"Apple"})
 public void Apple2() {
	 System.out.println("Apple brand 2");
	 
 }
 @Test(groups={"Moto"})
 public void Moto1() {
	 System.out.println("Moto brand 1");
	 
 }
 @Test(groups={"Moto"})
 public void Moto2() {
	 System.out.println("Moto brand 2");
	 
 }
 @Test(groups={"Sony"})
 public void Sony1() {
	 System.out.println("Sony brand 1");
	 
 }
 @Test(groups={"Sony"})
 public void Sony2() {
	 System.out.println("Sony brand 2");
	 
 }
}
