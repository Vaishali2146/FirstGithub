package com.accenture.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListener implements ITestListener {

	ExtentReports r;
	ExtentTest t;
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		//System.out.println("test finished");		
		r.endTest(t);
		r.flush();
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		//System.out.println("onstart started");
		r = new ExtentReports("C:\\html demos\\vaishali\\maven\\src\\test\\java\\MyReport.html");
		r.addSystemInfo("User", "Vaishali Mishra");
		r.addSystemInfo("Browser", "Chrome");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("test failed");
		t.log(LogStatus.FAIL, result.getMethod().getMethodName()+ "has failed");
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("ontestStart started");
		t = r.startTest(result.getMethod().getMethodName()+"has started");
		t.log(LogStatus.INFO, result.getMethod().getMethodName()+"has started");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("test passed");
		t.log(LogStatus.PASS, result.getMethod().getMethodName()+ "has passed");
	}

}
