package com.InterviewQues;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG {

	@Test
	public void test() {
		Assert.assertEquals("webdriver", "ht");
		System.out.println("cake");
	}

	@Test
	public void test2() {
		Assert.assertEquals("akalya", "paramu");
		System.out.println("cutting cake");

	}
}
