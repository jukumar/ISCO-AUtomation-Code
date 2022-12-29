package com.ISCO.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ISCO.base.BaseClass;
import com.ISCO.dataSource.readDataSource;
import com.ISCO.pages.LoginPage;

public class LoginTC extends BaseClass {

	public LoginTC() {
		// TODO Auto-generated constructor stub
		
	}

	LoginPage objloginPage;
	readDataSource objdataSource;

//	@BeforeClass
//	@Parameters({ "browser", "appURL" })
//	public void setup(String browser, String appURL) throws Exception {

//	}

	@BeforeSuite
	public void loadTestData() throws Throwable {
		objdataSource= new readDataSource();
		objdataSource.readDataFormExcel();
		objdataSource.readFromProperties();
	}
	
	@BeforeTest
	public void LoginToSkye() throws Throwable {

		
		try {			
			
			objloginPage = PageFactory.initElements(getDriver(), LoginPage.class);
			String userN = objdataSource.username;
			String passW = objdataSource.password;
			objloginPage.LoginToSkye(userN,passW);			
			driverwait(1);
			
		} catch (Exception e) {
			e.printStackTrace();
			loginfo("Login Failed with an exception:"+e.getStackTrace());
			
		}
		
	}
	
}
