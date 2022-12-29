package com.ISCO.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.ISCO.base.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		
		wait = new WebDriverWait(driver, TIMEOUT, POLLING);

	}

	WebDriver driver;
	WebDriverWait wait;

	
	@FindBy(xpath = "//input[@id='username']")
    List<WebElement> username;

   @FindBy(xpath = "//input[@id='password']")
    WebElement password;

   @FindBy(xpath = "//input[@id='kc-login']")
    WebElement SignIn;

   @FindBy(xpath = "//div[@id='company-logo']")
    List<WebElement> InnoveoLogo;

   	@FindBy(xpath = "//*[@class='logo']")
    List<WebElement> SkyeLogo;
   
	@FindBy(xpath = "//*[contains(text(),'Login')]")
	WebElement go;//skyebtnLogin;
	

//	@FindBy(xpath = "//*[@id=\"recaptcha-anchor\"]")
//	WebElement chkCaptcha;
	
	@FindBy(xpath = "//aside[@id='sk-nav']//img[contains(@title,'Secondary logo')]")
	WebElement skyeLogo;
	 
	@FindBy(xpath = "//aside[@id='sk-nav']//img[contains(@title,'Secondary logo') or contains(@title,'Primary logo')]")
	List<WebElement> skyeLogotemp;

	@FindBy(xpath = "//a[@class='sk-nav-menu outline']")
	WebElement collapseimage;

	@FindBy(xpath = "//div[@id='sk-app']")
	WebElement skyeVersion;
	
	@FindBy(xpath = "//*[contains(text(),'Generic Attribute')]")
	List<WebElement> GATabList;
	
	@FindBy(xpath = "//*[contains(text(),'Generic Attribute')]")
	WebElement GATab;
	

	public void LoginToSkye(String Username, String Password) throws Throwable {
	       waitForElementClickable(SignIn, wait);
	       driverwait(2);
	       SendUserCrendentials(Username, Password);
	       if (SkyeLogo.isEmpty()) {
	            driver.navigate().refresh();
	            waitForElementClickable(SignIn, wait);
	            SendUserCrendentials(Username, Password);
	            driverwait(2);
	       }
	       waitForElement(SkyeLogo.get(0), wait);
	       Assert.assertTrue(SkyeLogo.get(0).isDisplayed(), "SkyLogo Not Displayed");
	    }

	   public void SendUserCrendentials(String Username, String Password) {
	        loginfo("Sending UserName and Password");
	        username.get(0).sendKeys(Username);
	        password.sendKeys(Password);
	        driverwait(5);
	        loginfo("Click on Login");
	        SignIn.click();
	        driverwait(2);
	    }

}