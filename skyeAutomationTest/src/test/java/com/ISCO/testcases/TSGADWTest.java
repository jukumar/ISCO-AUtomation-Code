package com.ISCO.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ISCO.base.BaseClass;
import com.ISCO.pages.RegProductsPage;
import com.ISCO.pages.TSGADWPage;

public class TSGADWTest extends BaseClass {

	public TSGADWTest() {
		// TODO Auto-generated constructor stub
	}
	
	TSGADWPage objTSGADWPage;
	RegProductsPage objRegProductsPage;
	
	@BeforeClass
	public void loadPageElements()
	{
		objRegProductsPage = PageFactory.initElements(getDriver(), RegProductsPage.class);
		objTSGADWPage = PageFactory.initElements(getDriver(), TSGADWPage.class);
	}
	
	@BeforeMethod
	public void navigateGATab() throws Exception {
		objRegProductsPage.selectTestTab("GA");
		loginfo("TSGADWTest - Before Method is called..");		
		objRegProductsPage.selectTest("DropdownTest");		
		
	}
	
	@AfterMethod
	public void navigateToRegZone() throws Exception {
		
		
		objRegProductsPage.navigateToZonePage();
		loginfo("TSGADWTest -  After Method is called..");
	}

	
	
	/*
	 * TSGADW001 - Verify Radio Button - Basic properties - Orientation, Style Class and Default Value
	 */
	@Test
	public void TSGADW001_BasicProp_StyleClass_DefaultValue() throws Throwable {
		
		
		String strStyleClassName="styleclass";
		String[] strFixValueRange= {"TSGADW001DW1Car","TSGADW001DW1Bus","TSGADW001DW1Van"};
		objTSGADWPage.TSGADW001(strStyleClassName, strFixValueRange);
	}
	
	/*
	 * TSGADW002 - Context Settings - Visibility, Sort Order and Mandatory
	 */
	@Test
	public void TSGADW002_Context_Visibity_Mandatory() throws Throwable {
		
		String strErrMsg="This field is mandatory";
		String[] strFixValueRange= {"TSGADW002DW2Car","TSGADW002DW2Bus","TSGADW002DW2Van"};
		objTSGADWPage.TSGADW002(strFixValueRange,strErrMsg);
	}
	
	/*
	 * TSGADW003 - Verify Dropdown - Text Properties - Infotext, hint text and Place holder
	 */
	@Test
	public void TSGADW003_TextProp_InfoText_HintText() throws Throwable {
		
		String strInfotext="Info Text for TSGADW003DW1",hinttext="Hint Text for TSGADW003DW1",strPlaceHolderTextDW2="Place Holder for TSGADW003DW2";
		String[] strFixValueRangeDW1= {"TSGADW003DW1Car","TSGADW003DW1Bus","TSGADW003DW1Van"};
		String[] strFixValueRangeDW2= {"TSGADW003DW2Car","TSGADW003DW2Bus","TSGADW003DW2Van"};
		objTSGADWPage.TSGADW003( strFixValueRangeDW1, strFixValueRangeDW2, strInfotext, hinttext, strPlaceHolderTextDW2);
	}
	

}
