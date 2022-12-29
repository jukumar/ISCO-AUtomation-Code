package com.ISCO.driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.ISCO.base.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager extends BaseClass {

	public DriverManager() {
		// TODO Auto-generated constructor stub
	}

	WebDriver driver;

	/*
	 * Initialize the browser based on the type of browser
	 */
	//@SuppressWarnings("deprecation")
	public WebDriver InitializeBrowser(String browser, String appURL) throws Exception {

		if (browser.equalsIgnoreCase("chrome")) {
			// set path to chromedriver.exe
			String path = System.getProperty("user.dir") + "\\src\\test\\resources\\webdrivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--ignore-certificate-errors");

			driver = new ChromeDriver(options);
			loginfo("Chrome Driver initialized...!");

		} else if (browser.equalsIgnoreCase("Edge")) {
			// set path to chromedriver.exe
			String path = System.getProperty("user.dir") + "\\src\\test\\resources\\webdrivers\\msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", path);
			
			// Creating an object of EdgeOptions class
			EdgeOptions edgeOptions = new EdgeOptions();
			
			// Accepting the Insecure certificates through boolean parameter
			edgeOptions.setCapability("acceptInsecureCerts", true);
			
			WebDriverManager.edgedriver().setup();

			

			driver = new EdgeDriver(edgeOptions);
			loginfo("Edge Driver initialized...!");

		} else if (browser.equalsIgnoreCase("Firefox")) {
			// set path to chromedriver.exe
			String path = System.getProperty("user.dir") + "\\src\\test\\resources\\webdrivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", path);

			DesiredCapabilities fcap = new DesiredCapabilities();// prof.getProfile ("myProfile");

			fcap.setAcceptInsecureCerts(true);

			driver = new FirefoxDriver(fcap);

			loginfo("Firefox Driver initialized...!");

		} else if (browser.equalsIgnoreCase("IE")) {
			// set path to chromedriver.exe
			String path = System.getProperty("user.dir") + "\\src\\test\\resources\\webdrivers\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", path);

			
			//InternetExplorerOptions capabilities = new InternetExplorerOptions();
//			DesiredCapabilities capabilities = new DesiredCapabilities();
//			
//			 capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//			 capabilities.setCapability("acceptInsecureCerts", true);
//			 capabilities.setCapability("acceptSslCerts",true);
//			 capabilities.setCapability("ignoreProtectedModeSettings",true);
			
			DesiredCapabilities	caps = DesiredCapabilities.internetExplorer();
					caps.setCapability("ensureCleanSession",true);
					caps.setCapability("ignoreProtectedModeSettings",true);
							caps.setCapability("forceCreateProcessApi",true);
											caps.setCapability("ignoreZoomSetting",true);
													caps.setCapability("INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS",true);
				

			driver = new InternetExplorerDriver(caps);
			loginfo("InternetExplorer Driver initialized...!");

		} else if (browser.equalsIgnoreCase("opera")) {
			
			WebDriverManager.operadriver().setup();
	
			OperaOptions cap = new OperaOptions();
			cap.setCapability("acceptSslCerts", "true");
			
			
			driver=new OperaDriver();
			loginfo("OperaDriver initialized...!");
		
		}

//		Specifiying pageLoadTimeout and Implicit wait
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(appURL);
		driver.manage().window().maximize();
		return driver;

	}

}
