package com.report.listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.framework.utilities.TestBase;
import com.framework.utilities.commonUtilities;

public class Listener implements ITestListener {
	private static ExtentReports extent=ExtentReport.create();

  
	public void onFinish(ITestContext arg0) {
		System.out.println("test suite end");
		//extent.flush();
	}

	public void onStart(ITestContext arg0) {
		
		System.out.println("test siute start");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

		
	}

	public void onTestFailure(ITestResult Result) {
		
		 System.out.println("The name of the testcase failed is :"+Result.getName());
		 try {
			ExtentReport.extentlogger.log(Status.FAIL,"failed"+ExtentReport.extentlogger.addScreenCaptureFromPath(commonUtilities.TakeScreenShotsReturnPath(TestBase.driver,"TestBase")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult Result) {
		
		System.out.println("The name of the testcase Skipped is :"+Result.getName());
		try {
			ExtentReport.extentlogger.log(Status.SKIP,"Skip - "+ExtentReport.extentlogger.addScreenCaptureFromPath(commonUtilities.TakeScreenShotsReturnPath(TestBase.driver, "TestBase")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestStart(ITestResult Result) {
		 System.out.println(Result.getName()+" test case started");
		ExtentReport.extentlogger=extent.createTest(Result.getMethod().getMethodName(),Result.getMethod().getDescription());
		
	}

	public void onTestSuccess(ITestResult Result) {
		
		System.out.println("The name of the testcase passed is :"+Result.getName());
		ExtentReport.extentlogger=extent.createTest(Result.getMethod().getMethodName(),Result.getMethod().getDescription());
		
	}

}
