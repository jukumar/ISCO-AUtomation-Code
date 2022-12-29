package com.ISCO.listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ISCO.base.BaseClass;
import com.ISCO.utilities.extentManager;
import com.ISCO.utilities.extentTestManager;
import com.ISCO.utilities.puttyLogCollector;
import com.relevantcodes.extentreports.LogStatus;

public class TestListeners implements ITestListener {

	public TestListeners() {
		// TODO Auto-generated constructor stub
	}
	
	WebDriver driver;	
	BaseClass baseClass = new BaseClass();
	//puttyLogCollector puttyLogCollector = new puttyLogCollector();

	public void onTestStart(ITestResult result) {
		baseClass.loginfo("***Test Scenario - " + result.getMethod().getMethodName() + " - Starts...***");		
		extentTestManager.startTest(result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		baseClass.loginfo("***Executed Test Scenario - " + result.getMethod().getMethodName() + " - Passed!.***");
		extentTestManager.getTest().log(LogStatus.PASS, result.getName() + "-" + "Passed");
		
	}
	public void onTestFailure(ITestResult result) {
		baseClass.loginfo("***Executed Test Scenario - " + result.getMethod().getMethodName() + " - Failed!.***");
		//To capture screenshot path and store the path of the screenshot in the string "screenshotPath"
        //We do pass the path captured by this method in to the extent reports using "logger.addScreenCapture" method. 			
        File screenshotFile;
		try {
			screenshotFile = BaseClass.getScreenshot(result.getName());	
// its putty logger uncomment it for getting putty logs			
		//	puttyLogCollector.puttyLog("innkare", baseClass.puttyURL, result.getName());			

			extentTestManager.getTest().log(LogStatus.FAIL, result.getName() + "-" + "Failed due to below exception: Exception occured at : "+result.getThrowable()+
					"<a href='"+ screenshotFile.getAbsolutePath() + "'> <img src='"+ screenshotFile.getAbsolutePath() + "' height='100' width='100'/> </a>");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		
		
	}
	


	public void onTestSkipped(ITestResult result) {
		baseClass.loginfo("***Test Scenario - " + result.getMethod().getMethodName() + " - Skipped!.***");
		extentTestManager.getTest().log(LogStatus.SKIP, result.getName() + "-" + "Skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {		
		baseClass.loginfo("***Test Suite " + context.getName() + " starts***");
		
	}

	public void onFinish(ITestContext context) {
		baseClass.loginfo("***Test Suite " + context.getName() + " ends***");
		extentTestManager.endTest();
		extentManager.getInstance().flush();
		
	}
	

}
