/**
 * 
 */
package com.ISCO.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.ISCO.driverFactory.DriverManager;
import com.ISCO.pages.LoginPage;
import com.ISCO.pages.RegProductsPage;
import com.relevantcodes.extentreports.ExtentTest;

//import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseClass {

	public BaseClass() {

	}

	/*
	 * Implicit waits for pageload
	 */
	protected static final int TIMEOUT = 30; //seconds
	protected static final int POLLING = 1000;

	protected static WebDriver driver;

	protected WebDriverWait wait;

	// Log4j Object
	public static Logger logger = LogManager.getLogger(BaseClass.class);

	public static ExtentTest test;

	static String screenshotName;
	public static String screenShotStr;
	public static String puttyURL;
	public static SimpleDateFormat formatter = new SimpleDateFormat("hhmmssa");

	@AfterSuite
	public void quitDriver() {
		
		try {
			driver.quit();
			
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
			Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe /T");
			Runtime.getRuntime().exec("taskkill /F /IM Microsoft WebDriver.exe /T");
			
//			Process[] chromeDriverProcesses = Process.GetProcessesByName("chromedriver");
//			foreach(var chromeDriverProcess in chromeDriverProcesses){
//			 chromeDriverProcess.Kill();			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	public void quitProcess() {
		
		try {			
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
			Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe /T");
			Runtime.getRuntime().exec("taskkill /F /IM Microsoft WebDriver.exe /T");
			
//			Process[] chromeDriverProcesses = Process.GetProcessesByName("chromedriver");
//			foreach(var chromeDriverProcess in chromeDriverProcesses){
//			 chromeDriverProcess.Kill();			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

	@BeforeSuite
	@Parameters({ "browser", "appURL", "puttyURL"})
	public void Setup(String browser, String appURL, String putty_URL) throws Throwable {
		quitProcess();		
		puttyURL = putty_URL;
		driver = new DriverManager().InitializeBrowser(browser, appURL);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void driverwait(int timeToWaitInSec) {
		
		try {
			Thread.sleep(timeToWaitInSec * 1000);
			//loginfo("Waiting for " + timeToWaitInSec + " seconds...");			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * method used to log information into the log4j
	 */
	public void loginfo(String strinfo)  {		
		logger.info(strinfo);
		System.out.println(strinfo);
	}

	/*
	 * Scroll the screen for visibility of elements
	 */
	public void scrollDown(int x, int y) {
		// to perform Scroll on application
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")", "");
		driverwait(1);
		loginfo("Scroll Down success!");
	}
	
	public void scrollTop(int x, int y) {
	//((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+x+","+y+")","");
		driverwait(1);
		loginfo("Scroll To Top success!");
	}
	
	public void scrollToTop() {
	//((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollTop)");
		driverwait(1);
		loginfo("Scroll To Top success!");
	}
	
	public void moveToElement(WebElement element) {
	
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
    
	}
	public void moveToElementandClick(WebElement element) {
		
	    ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	      
		}
	
	/*
	 * Explicit wait for the elements to load
	 */
	public void waitForElement(WebElement element, WebDriverWait wait) {	
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/*
	 * Explicit wait for the elements to load
	 */
	public void waitForElementClickable(WebElement element, WebDriverWait wait) {		
		wait.until(ExpectedConditions.elementToBeClickable(element));
		}
	//Clearing the value of a control.
	 public void Clear(WebElement temp ) 
		{
		 	
		 	//other browsers
			temp.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			driverwait(1);
			//Support ff
		 	temp.clear(); 
		 	temp.sendKeys(Keys.TAB);
		 	driverwait(1);
		 	loginfo("Value cleared from the attribute!");
		}

	// This method is to capture the screenshot and return the path of the
	// screenshot.

	public static File getScreenshot(String screenshotName) throws IOException {

		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots" under src
		// folder
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		// return destination;
		return finalDestination;

	}

	public void ExecuteLoginskye() throws Throwable {

		try {

			LoginPage objloginPage = PageFactory.initElements(getDriver(), LoginPage.class);

			objloginPage.LoginToSkye("userc1", "Test1234");

			driverwait(1);

		} catch (Exception e) {
			e.printStackTrace();
			loginfo("Login Failed with an exception:" + e.getStackTrace());

		}

	}

	public void ExecuteLogoutskye() throws InterruptedException {
		
		RegProductsPage objRegressionZonePage=PageFactory.initElements(getDriver(), RegProductsPage.class);
		
		objRegressionZonePage.logoutskye();
	}

}
