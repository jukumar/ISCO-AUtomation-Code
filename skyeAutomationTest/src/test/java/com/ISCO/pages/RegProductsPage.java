package com.ISCO.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ISCO.base.BaseClass;

public class RegProductsPage  extends BaseClass {

	public RegProductsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		wait = new WebDriverWait(driver, TIMEOUT, POLLING);
	}
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	//@FindBy(xpath = "//ul[@class='sk-modelselector-tab-list']//child::li[1]")
		
	//@FindBy(xpath = "//*[@id='sk-ZoneDefinition-MyZone-ProductSelectorComponent']//child::li[1]")
	@FindBy(xpath = "//*[contains(text(),'Generic Attribute')]")
	WebElement GATab;	
	
	@FindBy(xpath = "//*[contains(text(),'Generic Attribute')]")
	List<WebElement> GATabList;	
	
	//@FindBy(xpath = "//*[@id='sk-ZoneDefinition-MyZone-ProductSelectorComponent']//child::li[2]")
	@FindBy(xpath = "//*[contains(text(),'Dependencies')]")
	WebElement DependenciesTab;
	
	@FindBy(xpath = "//*[contains(text(),'Excel')]")
	WebElement ExcelTab;
	
	@FindBy(xpath = "//a[contains(text(),'MultiBrick Test Scenario')]")
	WebElement TestMB;
	@FindBy(xpath = "//*[contains(text(),'MultiBrick')]")
	WebElement MultibrickTab;
	
	@FindBy(xpath = "//*[contains(text(),'Services')]")
	WebElement ServicesTab;
	
	@FindBy(xpath = "//*[contains(text(),'Payments')]")
	WebElement PaymentsTab;
	
	@FindBy(xpath = "//a[@class=\"sk-nav-menu outline\"]")
	WebElement collapseimage;
	
	//@FindBy(xpath = "//a[@id='sk-zone-MyZone' and @tabindex=\"1\"]")//*[contains(text(),'Regression Zone')]")
	@FindBy(xpath = "//a[@id='sk-zone-MyZone']//*[contains(text(),'Regression Zone')]")
	WebElement RegZone;
	
	//@FindBy(xpath = "//a[@id='sk-zone-myproduct' and @tabindex='2']")//*[contains(text(),'Regression Products')]")
	@FindBy(xpath = "//a[@id='sk-zone-myproduct']//*[contains(text(),'Regression Products')]")
	WebElement RegProduct;
	
	@FindBy(xpath = "//*[contains(text(),'Regression')]")
	WebElement testScenariosPage;
	
	
	@FindBy(xpath = "//aside[@id='sk-nav']//img[contains(@title,'Secondary logo')]")
	WebElement skyeLogo;

	@FindBy(xpath = "//i[contains(@class,'fa-user-cog sk-user-data-icon')]")
	WebElement btnsettings;

	@FindBy(xpath = "//a[contains(text(),'CheckBox Test Scenario')]")
	WebElement TestCB;
	
	@FindBy(xpath = "//a[contains(text(),'DatePickers Test Scenario')]")
	WebElement TestDP;
	
	@FindBy(xpath = "//a[contains(text(),'DropDown Test Scenario')]")
	WebElement TestDW;
	
	@FindBy(xpath = "//a[contains(text(),'Dependency Test Scenario')]")
	WebElement TestCD;
	
	@FindBy(xpath = "//a[contains(text(),'RadioButton Test Scenario')]")
	WebElement TestRB;
	
	@FindBy(xpath = "//a[contains(text(),'TextBox Test Scenario')]")
	WebElement TestTB;
	
	@FindBy(xpath = "//a[contains(text(),'Excel Test Scenario')]")
	WebElement TestEX;
	
	@FindBy(xpath = "//a[contains(text(),'TextArea Test Scenario')]")
	WebElement TestTextArea;
	
	@FindBy(xpath = "//a[contains(text(),' JWT Decoder Test Scenario')]")
	WebElement JWTD;
	
	@FindBy(xpath = "//a[contains(text(),' OCR Test Scenario')]")
	WebElement OCR;
	
	@FindBy(xpath = "//a[contains(text(),' Payments Test Scenario')]")
	WebElement Payments;
	
	@FindBy(xpath = "//a[contains(text(),' HttpInvoker Test Scenario')]")
	WebElement HttpInvoker;
	
	@FindBy(xpath = "//*[contains(text(),'Logout')]")
	WebElement btnlogout;
	
	@FindBy(xpath = "//a[@href='/users']")
	WebElement menuUsers;
	
	@FindBy(xpath = "//a[@href='/accounts']")
	WebElement menuAccounts;
	
	public void selectTestTab(String tabName) throws InterruptedException {
		loginfo("Waiting for Regression Zone Page");
		waitForElementClickable(menuUsers,wait);
		switch(tabName) {
		case "GA":
			waitForElementClickable(GATab,wait);

			moveToElementandClick(GATab);
			loginfo("Regression Products Page - Clicked on GA Tab");
			break;
		case "Dependencies":
			waitForElementClickable(DependenciesTab,wait);

			moveToElementandClick(DependenciesTab);
			loginfo("Regression Products Page - Clicked on Dependencies Tab");
			break;
		case "Excel":
			waitForElementClickable(ExcelTab,wait);

			moveToElementandClick(ExcelTab);
			loginfo("Regression Products Page - Clicked on Excel Tab");
			break;
		case "Multibrick":
			waitForElementClickable(MultibrickTab,wait);

			moveToElementandClick(MultibrickTab);
			loginfo("Regression Products Page - Clicked on Multibrick Tab");
			break;
		case "Services":
			waitForElementClickable(ServicesTab,wait);

			moveToElementandClick(ServicesTab);
			loginfo("Regression Products Page - Clicked on Services Tab");
			break;
		case "Payments":
			waitForElementClickable(PaymentsTab,wait);
			
			moveToElementandClick(PaymentsTab);
			loginfo("Regression Products Page - Clicked on Payments Tab");
			break;
		}		
	}
	
	public void selectTest(String testName) throws InterruptedException {
		loginfo("Waiting for Regression Product page");
		//waitForElementClickable(GATab,wait);
		switch(testName) {
		case "TextBox":
			waitForElementClickable(TestTB,wait);
			moveToElementandClick(TestTB);
			loginfo("Clicked on TextBox Test Scenarios");
			break;
		case "RadioButtonTest":
			waitForElementClickable(TestRB,wait);

			moveToElementandClick(TestRB);
			loginfo("Clicked on Radio Button Test Scenarios");
			break;
		case "DropdownTest":
			waitForElementClickable(TestDW,wait);

			moveToElementandClick(TestDW);
			loginfo("Clicked on Dropdown Test Scenarios");
			break;
		case "DatePickerTest":
			waitForElementClickable(TestDP,wait);

			moveToElementandClick(TestDP);
			loginfo("Clicked on DatePicker Test Scenarios");
			break;
		case "Dependencies":
			waitForElementClickable(TestCD,wait);

			moveToElementandClick(TestCD);
			loginfo("Clicked on Dependencies Test Scenarios");
			break;
		case "CheckBoxTest":
			waitForElementClickable(TestCB,wait);

			moveToElementandClick(TestCB);
			loginfo("Clicked on CheckBox Test Scenarios");
			break;
		case "Excel":
			waitForElementClickable(TestEX,wait);

			moveToElementandClick(TestEX);
			loginfo("Clicked on Excel Test Scenarios");
			break;	
		case "Multibrick":
			waitForElementClickable(TestMB,wait);

			moveToElementandClick(TestMB);
			loginfo("Clicked on Multibrick Test Scenarios");
			break;		
		case "TextArea":
			waitForElementClickable(TestTextArea,wait);

			moveToElementandClick(TestTextArea);
			loginfo("Clicked on Text Area Test Scenarios");
			break;		
		case "JWTD":
			waitForElementClickable(JWTD,wait);

			moveToElementandClick(JWTD);
			loginfo("Clicked on JWTD Test Scenarios");
			break;
			
		case "OCR":
			waitForElementClickable(OCR,wait);
			
			moveToElementandClick(OCR);
			loginfo("Clicked on OCR Test Scenarios");
			break;
			
		case "Payments":
			waitForElementClickable(Payments,wait);
			
			moveToElementandClick(Payments);
			loginfo("Clicked on Payments Test Scenarios");
			break;
			
		case "HttpInvoker":
			waitForElementClickable(HttpInvoker,wait);
			
			moveToElementandClick(HttpInvoker);
			loginfo("Clicked on HttpInvoker Test Scenarios");
			break;
			
		case "Users":
			waitForElementClickable(menuUsers,wait);
			moveToElementandClick(menuUsers);
			loginfo("Clicked on Users from Menu");
			break;
			
		case "Accounts":
			waitForElementClickable(menuUsers,wait);
			moveToElementandClick(menuAccounts);
			loginfo("Clicked on Accounts from Menu");
			break;
			
		case "Common":
			waitForElementClickable(menuUsers,wait);
			moveToElementandClick(menuAccounts);
			loginfo("Clicked on Accounts from Menu");
			break;
		}		
	}	
	public void navigateToZonePage() throws Exception
	{
	

		loginfo("Navigate To Zone Page");
		driverwait(7);
		if(!GATabList.isEmpty()) {

			loginfo("Already in Zone Page");
		}
		else {		
		moveToElementandClick(RegZone);
		driverwait(3);

		loginfo("Click on Regression Zone");
		waitForElementClickable(GATab, wait);

		loginfo("Navigates to Zone Page");
		}		
	}	
	public void navigateToProductPage() throws Exception
	{
		driverwait(2);
		moveToElementandClick(RegProduct);
		driverwait(2);

		loginfo("Regression Product clicked...");
		waitForElementClickable(GATab,wait);
		
	}	
	public void logoutskye() throws InterruptedException {
		waitForElementClickable(btnsettings, wait);
		btnsettings.click();
		btnlogout.click();
		loginfo("Logged out of Skye....");
	}	
	
}