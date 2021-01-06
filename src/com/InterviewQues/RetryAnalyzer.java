package com.InterviewQues;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	int failureCount=0;
	int limit=4;
	
	public boolean retry(ITestResult result) {
		if (failureCount<limit){
			failureCount++;
			return true;
		}
		return false;
	}

}
