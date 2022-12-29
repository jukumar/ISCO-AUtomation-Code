package com.ISCO.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ISCO.base.BaseClass;
import com.ISCO.dataSource.readDataSource;
import com.ISCO.pages.CommonPage;
import com.ISCO.pages.RegProductsPage;

public class CommonTC extends BaseClass{
	
	
		public CommonTC() {
			// TODO Auto-generated constructor stub
		}
	
		RegProductsPage objRegProductsPage;
		readDataSource objDataSource;
		CommonPage objCommonPage;

		// Initiation page factory and other classes
		@BeforeClass
		public void loadPageElements()
		{
			objRegProductsPage = PageFactory.initElements(getDriver(), RegProductsPage.class);
			objCommonPage = PageFactory.initElements(getDriver(), CommonPage.class);
		}
		
		@BeforeMethod
		public void navigateGATab() throws Exception {
			objRegProductsPage.selectTestTab("Users");
			loginfo("Users - Before Method is called..");
			objRegProductsPage.selectTest("Users");		}
			

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//**************************************************Users Testcases*******************************************
	
	/*
	 * UserTC001 - Create a new user using admin access
	 */
	@Test
	public void UserTC001() throws Throwable {		
		objDataSource.readSpecificTestCaseData("User001");
		String [] strarrValidData = new String[] {objDataSource.testcasevalidDataValue.get(0),objDataSource.testcasevalidDataValue.get(1),objDataSource.testcasevalidDataValue.get(2)};
		//String [] strarrValidData = new String[] {"Jude2","Joseph2","jude2.kumar@innoveo.com","dependent name"};
		objCommonPage.User001(strarrValidData);
	}
	
	/*
	 * UserTC002 - Create a user without having mandatory fields
	 */
	@Test
	public void UserTC002() throws Throwable {		
		objCommonPage.User002();
	}
	
	/*
	 * UserTC003 - Create a user with duplicate email address
	 */
	@Test
	public void UserTC003() throws Throwable {		
		objDataSource.readSpecificTestCaseData("User003");
		String [] strarrValidData = new String[] {objDataSource.testcasevalidDataValue.get(0),objDataSource.testcasevalidDataValue.get(1),objDataSource.testcasevalidDataValue.get(2)};
		//String [] strarrValidData = new String[] {"Jude2","Joseph2","jude2.kumar@innoveo.com","dependent name"};
		objCommonPage.User003(strarrValidData);
	}
	
	/*
	 * UserTC005 - Create a new user with special characters 
	 */
	@Test
	public void UserTC005() throws Throwable {		
		objDataSource.readSpecificTestCaseData("User005");
		//String [] strarrValidData = new String[] {objDataSource.testcasevalidDataValue.get(0),objDataSource.testcasevalidDataValue.get(1),objDataSource.testcasevalidDataValue.get(2),objDataSource.testcasevalidDataValue.get(3)};
		String [] strarrValidData = new String[] {"&$&^$","$@$@$","#!#@kj.com"};
		objCommonPage.User005(strarrValidData);
	}

	
	/*
	 * UserTC006 - Delete a user
	 */
	@Test
	public void UserTC006() throws Throwable {		
		objDataSource.readSpecificTestCaseData("User006");
		String [] strarrValidData = new String[] {objDataSource.testcasevalidDataValue.get(0),objDataSource.testcasevalidDataValue.get(1),objDataSource.testcasevalidDataValue.get(2),objDataSource.testcasevalidDataValue.get(3)};
		//String [] strarrValidData = new String[] {"Jude2","Joseph2","jude2.kumar@innoveo.com","dependent name"};
		objCommonPage.User006(strarrValidData);
	}
	
	/*
	 * UserTC007 - Search for created user
	 */
	@Test
	public void UserTC007() throws Throwable {		
		objDataSource.readSpecificTestCaseData("User007");
		String [] strarrValidData = new String[] {objDataSource.testcasevalidDataValue.get(0),objDataSource.testcasevalidDataValue.get(1),objDataSource.testcasevalidDataValue.get(2)};
		//String [] strarrValidData = new String[] {"Jude2","Joseph2","jude2.kumar@innoveo.com","dependent name"};
		objCommonPage.User007(strarrValidData);
	}
	
	/*
	 * UserTC008 - Search for non existing user
	 */
	@Test
	public void UserTC008() throws Throwable {		
		objCommonPage.User008();
	}
	
	/*
	 * UserTC009 - Verification of Accounts for users
	 */
	@Test
	public void UserTC009() throws Throwable {		
		objDataSource.readSpecificTestCaseData("User009");
		String [] strarrValidData = new String[] {objDataSource.testcasevalidDataValue.get(0),objDataSource.testcasevalidDataValue.get(1),objDataSource.testcasevalidDataValue.get(2),objDataSource.testcasevalidDataValue.get(3),objDataSource.testcasevalidDataValue.get(4)};
		//String [] strarrValidData = new String[] {"Jude2","Joseph2","jude2.kumar@innoveo.com","dependent name"};
		objCommonPage.User009(strarrValidData);
	}

	
//**************************************************Accounts Testcases*******************************************

	/*
	 * AccountTC010 - Create a new Account as Admin with POC_StarterPlan
	 */
	@Test
	public void AccountTC010() throws Throwable {		
		objDataSource.readSpecificTestCaseData("Account010");
		String [] strarrValidData = new String[] {objDataSource.testcasevalidDataValue.get(0),objDataSource.testcasevalidDataValue.get(1),objDataSource.testcasevalidDataValue.get(2)};
		//String [] strarrValidData = new String[] {"Jude2","Joseph2","jude2.kumar@innoveo.com","dependent name"};
		objCommonPage.Account010(strarrValidData);
	}
	
	/*
	 * AccountTC011 - Create a new Account as Admin with ProfessionalPlan
	 */
	@Test
	public void AccountTC011() throws Throwable {		
		objDataSource.readSpecificTestCaseData("Account011");
		String [] strarrValidData = new String[] {objDataSource.testcasevalidDataValue.get(0),objDataSource.testcasevalidDataValue.get(1),objDataSource.testcasevalidDataValue.get(2)};
		//String [] strarrValidData = new String[] {"Jude2","Joseph2","jude2.kumar@innoveo.com","dependent name"};
		objCommonPage.Account011(strarrValidData);
	}
	
	/*
	 * AccountTC012 - Create a new Account as Admin with EnterprisePlan
	 */
	@Test
	public void AccountTC012() throws Throwable {		
		objDataSource.readSpecificTestCaseData("Account012");
		String [] strarrValidData = new String[] {objDataSource.testcasevalidDataValue.get(0),objDataSource.testcasevalidDataValue.get(1),objDataSource.testcasevalidDataValue.get(2)};
		//String [] strarrValidData = new String[] {"Jude2","Joseph2","jude2.kumar@innoveo.com","dependent name"};
		objCommonPage.Account012(strarrValidData);
	}

	/*
	 * AccountTC013 - Create a Account with duplicate Account ID
	 */
	@Test
	public void AccountTC013() throws Throwable {		
		objDataSource.readSpecificTestCaseData("Account013");
		String [] strarrValidData = new String[] {objDataSource.testcasevalidDataValue.get(0),objDataSource.testcasevalidDataValue.get(1),objDataSource.testcasevalidDataValue.get(2)};
		//String [] strarrValidData = new String[] {"Jude2","Joseph2","jude2.kumar@innoveo.com","dependent name"};
		objCommonPage.Account013(strarrValidData);
	}
	
	/*
	 * AccountTC014 - Create a new Account with account name as special characters
	 */
	@Test
	public void AccountTC014() throws Throwable {		
		//objDataSource.readSpecificTestCaseData("Account014");
		//String [] strarrValidData = new String[] {objDataSource.testcasevalidDataValue.get(0),objDataSource.testcasevalidDataValue.get(1),objDataSource.testcasevalidDataValue.get(2)};
		String [] strarrValidData = new String[] {"@$@%","^&$&^$&"};
		objCommonPage.Account014(strarrValidData);
	}
	
	/*
	 * AccountTC015 - Edit an already created Account
	 */
	@Test
	public void AccountTC015() throws Throwable {		
		objDataSource.readSpecificTestCaseData("Account015");
		String [] strarrValidData = new String[] {objDataSource.testcasevalidDataValue.get(0),objDataSource.testcasevalidDataValue.get(1),objDataSource.testcasevalidDataValue.get(2)};
		//String [] strarrValidData = new String[] {"Jude2","Joseph2","jude2.kumar@innoveo.com","dependent name"};
		objCommonPage.Account015(strarrValidData);
	}
	
	/*
	 * AccountTC016 - Delete an Account
	 */
	@Test
	public void AccountTC016() throws Throwable {		
		//objDataSource.readSpecificTestCaseData("Account016");
		//String [] strarrValidData = new String[] {objDataSource.testcasevalidDataValue.get(0),objDataSource.testcasevalidDataValue.get(1),objDataSource.testcasevalidDataValue.get(2)};
		String [] strarrValidData = new String[] {"DELETID","DeletedName","Are you sure you want to delete account 'DeletedName'?"};
		objCommonPage.Account016(strarrValidData);
	}
	
	/*
	 * AccountTC017 - Delete Account which have dependancy on 'Users'
	 */
	@Test
	public void AccountTC017() throws Throwable {		
		objDataSource.readSpecificTestCaseData("Account017");
		String [] strarrValidData = new String[] {objDataSource.testcasevalidDataValue.get(0),objDataSource.testcasevalidDataValue.get(1),objDataSource.testcasevalidDataValue.get(2),objDataSource.testcasevalidDataValue.get(3),objDataSource.testcasevalidDataValue.get(4),objDataSource.testcasevalidDataValue.get(5)};
		//String [] strarrValidData = new String[] {"Jude2","Joseph2","jude2.kumar@innoveo.com","dependent name"};
		objCommonPage.Account017(strarrValidData);
	}
	
	/*
	 * AccountTC018 - Delete Account which have dependancy on 'Applications'
	 */
	@Test
	public void AccountTC018() throws Throwable {		
		objDataSource.readSpecificTestCaseData("Account018");
		String [] strarrValidData = new String[] {objDataSource.testcasevalidDataValue.get(0),objDataSource.testcasevalidDataValue.get(1),objDataSource.testcasevalidDataValue.get(2),objDataSource.testcasevalidDataValue.get(3),objDataSource.testcasevalidDataValue.get(4),objDataSource.testcasevalidDataValue.get(5)};
		//String [] strarrValidData = new String[] {"Jude2","Joseph2","jude2.kumar@innoveo.com","dependent name"};
		objCommonPage.Account018(strarrValidData);
	}
	
	/*
	 * AccountTC019 - Search for created Account
	 */
	@Test
	public void AccountTC019() throws Throwable {		
		//objDataSource.readSpecificTestCaseData("Account019");
		String [] strarrValidData = new String[] {objDataSource.testcasevalidDataValue.get(0),objDataSource.testcasevalidDataValue.get(1)};
		//String [] strarrValidData = new String[] {"DELETID","DeletedName","Are you sure you want to delete account 'DeletedName'?"};
		objCommonPage.Account019(strarrValidData);
	}
	
	/*
	 * AccountTC020 - Search for non existing Account
	 */
	@Test
	public void AccountTC020() throws Throwable {		
		objCommonPage.Account020();
	}
	
	/*
	 * ApplicationTC021 - Create a new Application using admin access
	 */
	@Test
	public void ApplicationTC021() throws Throwable {		
		objDataSource.readSpecificTestCaseData("Application021");
		String [] strarrValidData = new String[] {objDataSource.testcasevalidDataValue.get(0),objDataSource.testcasevalidDataValue.get(1),objDataSource.testcasevalidDataValue.get(2)};
		//String [] strarrValidData = new String[] {"Jude2","Joseph2","jude2.kumar@innoveo.com","dependent name"};
		objCommonPage.Application021(strarrValidData);
	}
}

