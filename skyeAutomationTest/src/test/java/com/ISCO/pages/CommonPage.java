package com.ISCO.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ISCO.base.BaseClass;
import com.ISCO.utilities.IscoFunctions;
import com.ISCO.utilities.commonFunctions;

public class CommonPage extends BaseClass{
	
	public CommonPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		wait = new WebDriverWait(driver, TIMEOUT, POLLING);
		// TODO Auto-generated constructor stub
	}
	WebDriver driver;
	Actions actionkey = new Actions(getDriver());
	WebDriverWait wait;
	RegProductsPage objRegressionZonePage;
	commonFunctions objcommonFunctions = new commonFunctions(getDriver());
	IscoFunctions objIscoFunctions = new IscoFunctions();
	
	
	
// User page xpaths 
	
	@FindBy(xpath = "//*[@id='root']/div[2]/div[2]/div[2]/div[2]/button")
    WebElement AddUser;

   @FindBy(xpath = "//*[@id='firstName']")
    WebElement FirstName;

   @FindBy(xpath = "//*[@id='lastName']")
    WebElement LastName;

   @FindBy(xpath = "//*[@id='email']")
    WebElement Email;

   @FindBy(xpath = "//div[@role='button']")
    WebElement AccountsDropdown;

   @FindBy(xpath = "//li[@role='option'][1]")
    WebElement SelectAccount1;

   @FindBy(xpath = "//li[@role='option'][2]")
    WebElement SelectAccount2;

   @FindBy(xpath = "//li[@role='option'][3]")
    WebElement SelectAccount3;

 //div[contains(text(),'Please select')]
   @FindBy(xpath = "//*[contains(text(),'Submit')]")
    WebElement SubmitButton;

   @FindBy(xpath = "(//*[@type='button'])[2]")
    WebElement GobackButton;

   @FindBy(xpath = "//*[contains(text(),'Submitted successfully!')]")
    WebElement SuccessText;
   @FindBy(xpath = "//div[contains(text(),'Please select')]")
   WebElement AccountPlanDropdown;

   @FindBy(xpath = "//*[@id='root']")
    static WebElement RandomClick;

   @FindBy(xpath = "//*[contains(text(),'Submit')]")
    WebElement SubmitDisableButton;

   @FindBy(xpath = "//th[contains(text(),'Email')]/following::td[3]")
    WebElement ActualEmail;

   @FindBy(xpath = "//span[contains(text(),\"AccName\")]")
   WebElement FirstAccountName;
   
   @FindBy(xpath = "//th[contains(text(),'First name')]/following::td[1]")
   WebElement ActualFirstName;
   
   @FindBy(xpath = "//th[contains(text(),'Last name')]/following::td[2]")
   WebElement AcutalLastName;
   
   @FindBy(xpath = "//div[contains(text(),'User could not be saved: This email address is alr')]")
    List<WebElement> AlertMsg;

   @FindBy(xpath = "//input[@type='search']")
    WebElement InputSearch;

   @FindBy(xpath = "//div[contains(text(),'Manage Users')]")
    WebElement ManageUsers;

   @FindBy(xpath = "//p[contains(text(),'Match not found')]")
    WebElement SearchMsg;

   @FindBy(xpath = "//th[contains(text(),'Email')]/following::td[5]/button[2]")
    WebElement UserFirstDeleteButton;
   
   @FindBy(xpath = "//th[contains(text(),'Action')]/following::td[4]/button[2]")
   WebElement AccountFirstDeleteButton;


   @FindBy(xpath = "//div[contains(text(),'Are you sure you want to delete user')]")
    WebElement AlertDeleteMsg;

   @FindBy(xpath = "//div[contains(text(),'Are you sure you want to delete')]/following::button[2]")
    WebElement YesButtonDeleteAlert;
   
   @FindBy(xpath = "//a[@href='/accounts']")
   WebElement MenuAccounts;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/button")
   WebElement AddAccount;
	
	@FindBy(xpath = "//*[@id='id']")
   WebElement AccountID;
	
	@FindBy(xpath = "//*[@id='name']")
   WebElement AccountName;
	
	@FindBy(xpath = "//*[@id='mui-39']")
   WebElement AccountPlan;
	
	@FindBy(xpath = "//li[@role='option'][2]")
   WebElement POC_Starter ;
	
// Accounts page xpaths and methods
	
		@FindBy(xpath = "//li[@role='option'][3]")
	    WebElement Professional;
		
		@FindBy(xpath = "//li[@role='option'][4]")
	    WebElement Enterprise;
		
		@FindBy(xpath = "//button[contains(text(),'Save account')]")
	    WebElement SaveAccount;
		
		@FindBy(xpath = "//th[contains(text(),'ID')]/following::td[1]")
		WebElement VerifyAccID;
		
		@FindBy(xpath = "//th[contains(text(),'ID')]/following::td[2]")
		WebElement VerifyAccName;
		
		@FindBy(xpath = "//th[contains(text(),'ID')]/following::td[3]")
		WebElement VerifyPlan;
		
		
		@FindBy(xpath = "//div[contains(text(),'Account with id DUPLICATE already exists')]")
	    WebElement DuplicateAlert;
		
		@FindBy(xpath = "//div[contains(text(),'Account with id')]/following::button")
	    WebElement OKbuttonDuplicateAlert;
		
		@FindBy(xpath = "//th[contains(text(),'Action')]/following::td[4]/button[1]")
	    WebElement FirstEditButton;
		
		@FindBy(xpath = "//*[contains(text(),'Are you sure you want to delete account')]")
	    WebElement DeleteAlert;
		
		@FindBy(xpath = "//*[contains(text(),'Are you sure you want to delete')]/following::button[2]")
		WebElement DeleteYesButton;
		
		@FindBy(xpath = "//div[contains(text(),'Dependent User is present. Please review Delete ac')]")
		WebElement UserDependencyAlert;
		
		@FindBy(xpath = "//div[contains(text(),'Dependent Application is present. Please review De')]")
		WebElement AppDependencyAlert;
		
		@FindBy(xpath = "//*[contains(text(),'Save changes')]")
		WebElement SaveChanges;
		
		@FindBy(xpath = "//a[@href='/users']")
		WebElement MenuUsers;
		
// Application page xpath 
		
		@FindBy(xpath = "//a[@href='/application']")
		WebElement MenuApplication;
		
		@FindBy(xpath = "//button[contains(text(),'Add application')]")
		WebElement AddApplication;
		
		@FindBy(xpath = "//*[@id='applicationId']")
		WebElement ApplicationID;
		
		@FindBy(xpath = "//input[@id='name']")
		WebElement ApplicationName;
		
		@FindBy(xpath = "(//*[contains(text(),'Please select')])[1]")
		WebElement AppSelectAccount;
		
		@FindBy(xpath = "//input[@name='url']")
		WebElement EnvironmentUrl;
		
		//(//div[@role='button'])[2]
		//*[contains(text(),'Please select')])[1]
		@FindBy(xpath = "(//div[@role='button'])[2]")
		WebElement EnvironmentType;
		
		@FindBy(xpath = "//button[contains(text(),'Add Environment')]")
		WebElement AddEnvironmentButton ;
		
		@FindBy(xpath = "//button[contains(text(),'Save application')]")
		WebElement SaveApplication;
		
		
		//ul[@role='listbox']
		@FindBy(xpath = "//ul[@role='listbox']/li")
		List<WebElement> EnvironmentTypeOptions;
		
		@FindBy(xpath = "//td[contains(text(),'DEPENDENCYAPP')]/following::button[2]")
		WebElement DepencyappDeleteButton;
	
			@FindBy(xpath = "//*[contains(text(),'Actions')]")
			WebElement Actions;
//				@FindBy(xpath = "")
				//	WebElement ;
//				@FindBy(xpath = "")
				//	WebElement ;
//				@FindBy(xpath = "")
				//	WebElement ;
//				@FindBy(xpath = "")
				//	WebElement ;
	
	
	
	public void User001(String[] strarrValidData) throws Exception {
		objcommonFunctions.moveToElementandClick(AddUser);
		objIscoFunctions.checkDisabledIsco(SubmitButton);
		objcommonFunctions.enterValue(FirstName, strarrValidData[0]); 
		objcommonFunctions.enterValue(LastName, strarrValidData[1]);
		objcommonFunctions.enterValue(Email, strarrValidData[2]);
		objcommonFunctions.moveToElementandClick(AccountsDropdown);
		objcommonFunctions.SelectOptionfromDW(1);
		driverwait(1);
		objIscoFunctions.tabOut();
		driverwait(1);
		objcommonFunctions.moveToElementandClick(SubmitButton);
		driverwait(8);
		objcommonFunctions.verifyDefaultValue(ActualEmail, strarrValidData[2]);
		objcommonFunctions.verifyDefaultValue(ActualFirstName, strarrValidData[0]);
		objcommonFunctions.verifyDefaultValue(AcutalLastName, strarrValidData[1]);
		deleteUserEntry();
	}

	public void deleteUserEntry() {
		objcommonFunctions.moveToElementandClick(UserFirstDeleteButton);
		driverwait(2);
		objcommonFunctions.moveToElementandClick(YesButtonDeleteAlert);
	}
	
	public void User002() throws Exception {
		objcommonFunctions.moveToElementandClick(AddUser);
		driverwait(5);
		objIscoFunctions.checkDisabledIsco(SubmitButton);
		objIscoFunctions.tabOut();
	}
	public void User003(String[] strarrValidData) throws Exception {
		for(int i =0;i<=1;i++) {
			objcommonFunctions.moveToElementandClick(AddUser);
			objIscoFunctions.checkDisabledIsco(SubmitButton);
			objcommonFunctions.enterValue(FirstName, strarrValidData[0]);
			objcommonFunctions.enterValue(LastName, strarrValidData[1]);
			objcommonFunctions.enterValue(Email, strarrValidData[2]);
			objcommonFunctions.moveToElementandClick(AccountsDropdown);
			objcommonFunctions.SelectOptionfromDW(1);
			driverwait(1);
			objIscoFunctions.tabOut();
			driverwait(1);
			objcommonFunctions.moveToElementandClick(SubmitButton);
			driverwait(5);
			
		}
		
//		objcommonFunctions.moveToElementandClick(AddUser);
//		objcommonFunctions.checkDisabledIsco(SubmitButton);
//		objcommonFunctions.enterValue(FirstName, strarrValidData[0]);
//		objcommonFunctions.enterValue(LastName, strarrValidData[1]);
//		objcommonFunctions.enterValue(Email, strarrValidData[2]);
//		objcommonFunctions.moveToElementandClick(AccountsDropdown);
//		objcommonFunctions.SelectOptionfromDW(1);
//		driverwait(1);
//		objIscoFunctions.tabOut();
//		//driverwait(3);
//	waitForElementClickable(SubmitButton,wait);
//		//SubmitButton.click();
//		objcommonFunctions.moveToElementandClick(SubmitButton);
//		driverwait(3);
		objcommonFunctions.verifyValidationMsg(AlertMsg, "User could not be saved: This email address is already in use.");//verify validation msgs
		objIscoFunctions.tabOut();
		}
	
	public void User005(String[] strarrValidData) throws Exception {
		objcommonFunctions.moveToElementandClick(AddUser);
		objcommonFunctions.enterValue(FirstName, strarrValidData[0]);
		objcommonFunctions.enterValue(LastName, strarrValidData[1]);
		objcommonFunctions.enterValue(Email, strarrValidData[2]);
		objcommonFunctions.moveToElementandClick(AccountsDropdown);
		objcommonFunctions.SelectOptionfromDW(1);
		driverwait(1);
		objIscoFunctions.tabOut();
		driverwait(1);
		objcommonFunctions.moveToElementandClick(SubmitButton);
		driverwait(3);
		objIscoFunctions.checkDisabledIsco(SubmitButton);
		objIscoFunctions.randomClickOnScreen();
		
		driverwait(5);
		}
	
	public void User006(String[] strarrValidData) throws Exception {
		objcommonFunctions.moveToElementandClick(AddUser);
		objIscoFunctions.checkDisabledIsco(SubmitButton);
		objcommonFunctions.enterValue(FirstName, strarrValidData[0]);
		objcommonFunctions.enterValue(LastName, strarrValidData[1]);
		objcommonFunctions.enterValue(Email, strarrValidData[2]);
		objcommonFunctions.moveToElementandClick(AccountsDropdown);
		objcommonFunctions.SelectOptionfromDW(1);
		driverwait(1);
		objIscoFunctions.tabOut();
		driverwait(1);
		objcommonFunctions.moveToElementandClick(SubmitButton);
		driverwait(8);
		objcommonFunctions.moveToElementandClick(UserFirstDeleteButton);
		objcommonFunctions.verifyDefaultValue(AlertDeleteMsg, strarrValidData[3]);
		objcommonFunctions.moveToElementandClick(YesButtonDeleteAlert);
		// need to check that it is deleted successfully
		
		}
	
	public void User007(String[] strarrValidData) throws Exception {
		objcommonFunctions.moveToElementandClick(AddUser);
		driverwait(5);
		objIscoFunctions.checkDisabledIsco(SubmitButton);
		objcommonFunctions.enterValue(FirstName, strarrValidData[0]);
		objcommonFunctions.enterValue(LastName, strarrValidData[1]);
		objcommonFunctions.enterValue(Email, strarrValidData[2]);
		objcommonFunctions.moveToElementandClick(AccountsDropdown);
		objcommonFunctions.SelectOptionfromDW(1);
		driverwait(1);
		objIscoFunctions.tabOut();
		driverwait(1);
		objcommonFunctions.moveToElementandClick(SubmitButton);
		driverwait(3);
		objcommonFunctions.enterValue(InputSearch, strarrValidData[0]);
		objcommonFunctions.verifyDefaultValue(ActualEmail, strarrValidData[2]);
		objcommonFunctions.verifyDefaultValue(ActualFirstName, strarrValidData[0]);
		objcommonFunctions.verifyDefaultValue(AcutalLastName, strarrValidData[1]);
		deleteUserEntry();
	}
	
	public void User008() throws Exception {
		objcommonFunctions.enterValue(InputSearch, "@$%");
		objcommonFunctions.verifyDefaultValue(SearchMsg, "Match not found");
	}
	
	public void User009(String[] strarrValidData) throws Exception {
		objcommonFunctions.moveToElementandClick(MenuAccounts);
		objcommonFunctions.moveToElementandClick(AddAccount);
		objIscoFunctions.checkDisabledIsco(SaveAccount);
		objcommonFunctions.enterValue(AccountID, strarrValidData[0]);
		objcommonFunctions.enterValue(AccountName, strarrValidData[1]);
		objcommonFunctions.moveToElementandClick(AccountPlanDropdown);
		objcommonFunctions.SelectOptionfromDW(1);
		driverwait(1);
		//objIscoFunctions.tabOut();
		driverwait(1);
		objcommonFunctions.moveToElementandClick(SaveAccount);
		driverwait(3);
		objcommonFunctions.verifyDefaultValue(VerifyAccID, strarrValidData[0]);
		objcommonFunctions.verifyDefaultValue(VerifyAccName, strarrValidData[1]);
		objcommonFunctions.moveToElementandClick(MenuUsers);
		objcommonFunctions.moveToElementandClick(AddUser);
		objcommonFunctions.enterValue(FirstName, strarrValidData[2]);
		objcommonFunctions.enterValue(LastName, strarrValidData[3]);
		objcommonFunctions.enterValue(Email, strarrValidData[4]);
		driverwait(5);
		objcommonFunctions.moveToElementandClick(AccountsDropdown);
		driverwait(3);
		objcommonFunctions.SelectOptionfromDW(1);
		driverwait(3);
		objIscoFunctions.tabOut();
		driverwait(1);
		objcommonFunctions.verifyDefaultValue(FirstAccountName, strarrValidData[1]);
		objIscoFunctions.randomClickOnScreen();
		objcommonFunctions.moveToElementandClick(MenuAccounts);
		driverwait(1);
		objcommonFunctions.moveToElementandClick(AccountFirstDeleteButton);
		objcommonFunctions.moveToElementandClick(YesButtonDeleteAlert);
		
	}
	
	
//********************************************************************************************************


	
	public void deleteAccountEntry() {
		objcommonFunctions.moveToElementandClick(AccountFirstDeleteButton);
		driverwait(3);
		objcommonFunctions.moveToElementandClick(DeleteYesButton);
	}
	
	public void Account010(String[] strarrValidData) throws Exception {
		objcommonFunctions.moveToElementandClick(MenuAccounts);
		objcommonFunctions.moveToElementandClick(AddAccount);
		objIscoFunctions.checkDisabledIsco(SaveAccount);
		objcommonFunctions.enterValue(AccountID, strarrValidData[0]);
		objcommonFunctions.enterValue(AccountName, strarrValidData[1]);
		objcommonFunctions.moveToElementandClick(AccountPlanDropdown);
		objcommonFunctions.SelectOptionfromDW(1);
		driverwait(1);
		objcommonFunctions.waitForElementClickable(SaveAccount, wait);
		objcommonFunctions.moveToElementandClick(SaveAccount);
		driverwait(3);
		objcommonFunctions.verifyDefaultValue(VerifyAccID, strarrValidData[0]);
		objcommonFunctions.verifyDefaultValue(VerifyAccName, strarrValidData[1]);
		objcommonFunctions.verifyDefaultValue(VerifyPlan, strarrValidData[2]);
		deleteAccountEntry();
		}

	public void Account011(String[] strarrValidData) throws Exception {
		objcommonFunctions.moveToElementandClick(MenuAccounts);
		objcommonFunctions.moveToElementandClick(AddAccount);
		objIscoFunctions.checkDisabledIsco(SaveAccount);
		objcommonFunctions.enterValue(AccountID, strarrValidData[0]);
		objcommonFunctions.enterValue(AccountName, strarrValidData[1]);
		objcommonFunctions.moveToElementandClick(AccountPlanDropdown);
		objcommonFunctions.SelectOptionfromDW(2);
		driverwait(1);
		objcommonFunctions.moveToElementandClick(SaveAccount);
		driverwait(3);
		objcommonFunctions.verifyDefaultValue(VerifyAccID, strarrValidData[0]);
		objcommonFunctions.verifyDefaultValue(VerifyAccName, strarrValidData[1]);
		objcommonFunctions.verifyDefaultValue(VerifyPlan, strarrValidData[2]);
		deleteAccountEntry();
		}
	
	public void Account012(String[] strarrValidData) throws Exception {
		objcommonFunctions.moveToElementandClick(MenuAccounts);
		objcommonFunctions.moveToElementandClick(AddAccount);
		objIscoFunctions.checkDisabledIsco(SaveAccount);
		objcommonFunctions.enterValue(AccountID, strarrValidData[0]);
		objcommonFunctions.enterValue(AccountName, strarrValidData[1]);
		objcommonFunctions.moveToElementandClick(AccountPlanDropdown);
		objcommonFunctions.SelectOptionfromDW(3);
		driverwait(1);
		objcommonFunctions.moveToElementandClick(SaveAccount);
		driverwait(3);
		objcommonFunctions.verifyDefaultValue(VerifyAccID, strarrValidData[0]);
		objcommonFunctions.verifyDefaultValue(VerifyAccName, strarrValidData[1]);
		objcommonFunctions.verifyDefaultValue(VerifyPlan, strarrValidData[2]);
		deleteAccountEntry();
		}
	
	public void Account013(String[] strarrValidData) throws Exception {
		objcommonFunctions.moveToElementandClick(MenuAccounts);
		objcommonFunctions.moveToElementandClick(AddAccount);
		objIscoFunctions.checkDisabledIsco(SaveAccount);
		objcommonFunctions.enterValue(AccountID, strarrValidData[0]);
		objcommonFunctions.enterValue(AccountName, strarrValidData[1]);
		objcommonFunctions.moveToElementandClick(AccountPlanDropdown);
		objcommonFunctions.SelectOptionfromDW(1);
		objcommonFunctions.moveToElementandClick(SaveAccount);
		driverwait(3);
		objcommonFunctions.moveToElementandClick(AddAccount);
		objIscoFunctions.checkDisabledIsco(SaveAccount);
		objcommonFunctions.enterValue(AccountID, strarrValidData[0]);
		objcommonFunctions.enterValue(AccountName, strarrValidData[1]);
		objcommonFunctions.moveToElementandClick(AccountPlanDropdown);
		objcommonFunctions.SelectOptionfromDW(1);
		objcommonFunctions.moveToElementandClick(SaveAccount);
		driverwait(2);
		objcommonFunctions.verifyDefaultValue(DuplicateAlert, "Account with id DUPLICATE already exists");
		objcommonFunctions.moveToElementandClick(OKbuttonDuplicateAlert);
		driverwait(2);
		objIscoFunctions.randomClickOnScreen();
		driverwait(4);
		deleteAccountEntry();
	}
	public void Account014(String[] strarrValidData) throws Exception {
		objcommonFunctions.moveToElementandClick(MenuAccounts);
		objcommonFunctions.moveToElementandClick(AddAccount);
		objIscoFunctions.checkDisabledIsco(SaveAccount);
		objcommonFunctions.enterValue(AccountID, strarrValidData[0]);
		objcommonFunctions.enterValue(AccountName, strarrValidData[1]);
		objcommonFunctions.moveToElementandClick(AccountPlanDropdown);
		objcommonFunctions.SelectOptionfromDW(1);
		driverwait(1);
		objIscoFunctions.checkDisabledIsco(SaveAccount);
		objIscoFunctions.randomClickOnScreen();
		driverwait(3);
		}
	
	public void Account015(String[] strarrValidData) throws Exception {
		objcommonFunctions.moveToElementandClick(MenuAccounts);
		objcommonFunctions.moveToElementandClick(AddAccount);
		objIscoFunctions.checkDisabledIsco(SaveAccount);
		objcommonFunctions.enterValue(AccountID, strarrValidData[0]);
		objcommonFunctions.enterValue(AccountName, strarrValidData[1]);
		objcommonFunctions.moveToElementandClick(AccountPlanDropdown);
		objcommonFunctions.SelectOptionfromDW(1);
		driverwait(1);
		objcommonFunctions.moveToElementandClick(SaveAccount);
		driverwait(3);
		objcommonFunctions.verifyDefaultValue(VerifyAccID, strarrValidData[0]);
		objcommonFunctions.verifyDefaultValue(VerifyAccName, strarrValidData[1]);
		objcommonFunctions.moveToElementandClick(FirstEditButton);
		driverwait(1);
		objcommonFunctions.enterValue(AccountName, strarrValidData[2]);
	//	objcommonFunctions.moveToElementandClick(AccountPlanDropdown);
	//	objcommonFunctions.SelectOptionfromDW(2);
		objcommonFunctions.moveToElementandClick(SaveChanges);
		driverwait(2);
		objcommonFunctions.verifyDefaultValue(VerifyAccName, strarrValidData[2]);
		deleteAccountEntry();
		}

	public void Account016(String[] strarrValidData) throws Exception {
		objcommonFunctions.moveToElementandClick(MenuAccounts);
		objcommonFunctions.moveToElementandClick(AddAccount);
		objIscoFunctions.checkDisabledIsco(SaveAccount);
		objcommonFunctions.enterValue(AccountID, strarrValidData[0]);
		objcommonFunctions.enterValue(AccountName, strarrValidData[1]);
		objcommonFunctions.moveToElementandClick(AccountPlanDropdown);
		objcommonFunctions.SelectOptionfromDW(1);
		driverwait(1);
		objcommonFunctions.moveToElementandClick(SaveAccount);
		driverwait(3);
		objcommonFunctions.verifyDefaultValue(VerifyAccID, strarrValidData[0]);
		objcommonFunctions.verifyDefaultValue(VerifyAccName, strarrValidData[1]);
		objcommonFunctions.moveToElementandClick(AccountFirstDeleteButton);
		objcommonFunctions.verifyDefaultValue(DeleteAlert, strarrValidData[2]);
		objcommonFunctions.moveToElementandClick(DeleteYesButton);
		}
	
	public void Account017(String[] strarrValidData) throws Exception {
		objcommonFunctions.moveToElementandClick(MenuAccounts);
		objcommonFunctions.moveToElementandClick(AddAccount);
		objIscoFunctions.checkDisabledIsco(SaveAccount);
		objcommonFunctions.enterValue(AccountID, strarrValidData[0]);
		objcommonFunctions.enterValue(AccountName, strarrValidData[1]);
		objcommonFunctions.moveToElementandClick(AccountPlanDropdown);
		objcommonFunctions.SelectOptionfromDW(1);
		driverwait(1);
		objcommonFunctions.moveToElementandClick(SaveAccount);
		driverwait(3);
		objcommonFunctions.verifyDefaultValue(VerifyAccID, strarrValidData[0]);
		objcommonFunctions.verifyDefaultValue(VerifyAccName, strarrValidData[1]);
		objcommonFunctions.moveToElementandClick(MenuUsers);
		driverwait(2);
		objcommonFunctions.moveToElementandClick(AddUser);
		objIscoFunctions.checkDisabledIsco(SubmitButton);
		objcommonFunctions.enterValue(FirstName, strarrValidData[2]);
		objcommonFunctions.enterValue(LastName, strarrValidData[3]);
		objcommonFunctions.enterValue(Email, strarrValidData[4]);
		objcommonFunctions.moveToElementandClick(AccountsDropdown);
		objcommonFunctions.SelectOptionfromDW(1);
		driverwait(1);
		objIscoFunctions.tabOut();
		driverwait(1);
		objcommonFunctions.moveToElementandClick(SubmitButton);
		driverwait(3);
		objcommonFunctions.moveToElementandClick(MenuAccounts);
		driverwait(3);
		deleteAccountEntry();
		driverwait(3);
		//objcommonFunctions.verifyDefaultValue(UserDependencyAlert, strarrValidData[5]);
		IscoFunctions.verifyValidationMsg(UserDependencyAlert, "Dependent User is present."); // Please review Delete action.
		objIscoFunctions.randomClickOnScreen();
		objcommonFunctions.moveToElementandClick(MenuUsers);
		driverwait(5);
		deleteUserEntry();
		objcommonFunctions.moveToElementandClick(MenuAccounts);
		driverwait(3);
		deleteAccountEntry();
	}
	
	public void Account018(String[] strarrValidData) throws Exception {
		objcommonFunctions.moveToElementandClick(MenuAccounts);
		objcommonFunctions.moveToElementandClick(AddAccount);
		objIscoFunctions.checkDisabledIsco(SaveAccount);
		objcommonFunctions.enterValue(AccountID, strarrValidData[0]);
		objcommonFunctions.enterValue(AccountName, strarrValidData[1]);
		objcommonFunctions.moveToElementandClick(AccountPlanDropdown);
		objcommonFunctions.SelectOptionfromDW(1);
		driverwait(1);
		objcommonFunctions.moveToElementandClick(SaveAccount);
		driverwait(3);
		objcommonFunctions.verifyDefaultValue(VerifyAccID, strarrValidData[0]);
		objcommonFunctions.verifyDefaultValue(VerifyAccName, strarrValidData[1]);
		objcommonFunctions.moveToElementandClick(MenuApplication);
		driverwait(2);
		objcommonFunctions.moveToElementandClick(AddApplication);
		objcommonFunctions.enterValue(ApplicationID, strarrValidData[2]);
		objcommonFunctions.enterValue(ApplicationName, strarrValidData[3]);
		objcommonFunctions.moveToElementandClick(AppSelectAccount);
		objcommonFunctions.SelectOptionfromDW(1);
		driverwait(1);
		objcommonFunctions.enterValue(EnvironmentUrl, strarrValidData[4]);
		IscoFunctions.clickOnElement(EnvironmentType);
		//objcommonFunctions.moveToElementandClick(EnvironmentType);
		objcommonFunctions.SelectFromDropdown(EnvironmentTypeOptions,"UAT");
		objcommonFunctions.moveToElementandClick(SaveApplication);
		driverwait(3);
		objcommonFunctions.moveToElementandClick(MenuAccounts);
		driverwait(3);
		deleteAccountEntry();
		driverwait(3);
		IscoFunctions.verifyValidationMsg(AppDependencyAlert, "Dependent Application is present. Please review Delete action.");
		objIscoFunctions.randomClickOnScreen();
		objcommonFunctions.moveToElementandClick(MenuApplication);
		objcommonFunctions.waitForElement(Actions, wait);
		objIscoFunctions.moveToElementISCO(DepencyappDeleteButton);
		objcommonFunctions.moveToElementandClick(DepencyappDeleteButton);
		driverwait(3);
		objcommonFunctions.moveToElementandClick(DeleteYesButton);
		objcommonFunctions.moveToElementandClick(MenuAccounts);
		driverwait(5);
		deleteAccountEntry();
		
	}

	public void Account019(String[] strarrValidData) throws Exception {
		objcommonFunctions.moveToElementandClick(MenuAccounts);
		objcommonFunctions.moveToElementandClick(AddAccount);
		objIscoFunctions.checkDisabledIsco(SaveAccount);
		objcommonFunctions.enterValue(AccountID, strarrValidData[0]);
		objcommonFunctions.enterValue(AccountName, strarrValidData[1]);
		objcommonFunctions.moveToElementandClick(AccountPlanDropdown);
		objcommonFunctions.SelectOptionfromDW(1);
		driverwait(1);
		objcommonFunctions.moveToElementandClick(SaveAccount);
		driverwait(3);
		objcommonFunctions.verifyDefaultValue(VerifyAccID, strarrValidData[0]);
		objcommonFunctions.verifyDefaultValue(VerifyAccName, strarrValidData[1]);
		driverwait(3);
		objcommonFunctions.enterValue(InputSearch, strarrValidData[0]);
		objcommonFunctions.verifyDefaultValue(VerifyAccID, strarrValidData[0]);
		objcommonFunctions.verifyDefaultValue(VerifyAccName, strarrValidData[1]);
		deleteAccountEntry();
	}
	
	public void Account020() throws Exception {
		objcommonFunctions.moveToElementandClick(MenuAccounts);
		objcommonFunctions.enterValue(InputSearch, "@$%");
		objcommonFunctions.verifyDefaultValue(SearchMsg, "Match not found");
	}
	
	public void Application021(String[] strarrValidData) throws Exception {
	objcommonFunctions.moveToElementandClick(MenuApplication);
	driverwait(2);
	objcommonFunctions.moveToElementandClick(AddApplication);
	objcommonFunctions.enterValue(ApplicationID, strarrValidData[0]);
	objcommonFunctions.enterValue(ApplicationName, strarrValidData[1]);
	objcommonFunctions.moveToElementandClick(AppSelectAccount);
	objcommonFunctions.SelectOptionfromDW(1);
	driverwait(1);
	objcommonFunctions.enterValue(EnvironmentUrl, strarrValidData[2]);
	IscoFunctions.clickOnElement(EnvironmentType);
	//objcommonFunctions.moveToElementandClick(EnvironmentType);
	objcommonFunctions.SelectFromDropdown(EnvironmentTypeOptions,"UAT");
	objcommonFunctions.moveToElementandClick(SaveApplication);
	driverwait(3);
	objcommonFunctions.waitForElement(Actions, wait);
	objIscoFunctions.moveToElementISCO(DepencyappDeleteButton);
	objcommonFunctions.moveToElementandClick(DepencyappDeleteButton);
	driverwait(3);
	objcommonFunctions.moveToElementandClick(DeleteYesButton);
}
}





	
	

