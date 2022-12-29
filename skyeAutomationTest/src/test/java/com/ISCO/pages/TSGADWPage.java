package com.ISCO.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.ISCO.base.BaseClass;
import com.ISCO.utilities.commonFunctions;

public class TSGADWPage extends BaseClass {

	public TSGADWPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		wait = new WebDriverWait(driver, TIMEOUT, POLLING);
	}

	WebDriver driver;
	WebDriverWait wait;
	RegProductsPage objRegressionZonePage;
	commonFunctions objcommonFunctions = new commonFunctions(getDriver());
	Actions action = new Actions(getDriver());

	
	@FindBy(xpath = "//*[contains(text(),'Generic Attribute')]")
	List<WebElement> GATab;
	
	@FindBy(xpath = "//button[@id='RegDropDownProcess-SelectTS-next-button-1']/span")
	List<WebElement> TestPage;
	
	/*TSGADW001*/
	
	@FindBy(xpath = "//*[contains(text(),'TSGADW001')]")
	WebElement TSGADW001;

	@FindBy(xpath = "//*[contains(text(),'TSGADW001Save')]")
	WebElement TSGADW001Save;

	@FindBy(xpath = "//span[contains(text(),'TSGADW001Back')]")
	WebElement TSGADW001Back;

	@FindBy(xpath = "//*[@id='RegDropDown-TSGADW001-TSGADW001DW1']")
	WebElement TSGADW001DW1input;

	@FindBy(xpath = "//*[@id='sk-RegDropDown-TSGADW001-TSGADW001DW1']")
	WebElement TSGADW001DW1div;

	//@FindBy(xpath = "//*[@id='RegDropDown-TSGADW001-TSGADW001DW1-select']")
	@FindBy(xpath = "//div[@id='sk-RegDropDown-TSGADW001-TSGADW001DW1']//div[contains(@class,'react-select__control')]")
	WebElement TSGADW001DW1select;

	/*TSGADW002*/
	
	@FindBy(xpath = "//*[contains(text(),'TSGADW002')]")
	WebElement TSGADW002;

	@FindBy(xpath = "//*[contains(text(),'TSGADW002Save')]")
	WebElement TSGADW002Save;

	@FindBy(xpath = "//span[contains(text(),'TSGADW002Back')]")
	WebElement TSGADW002Back;
	
	@FindBy(xpath = "//*[@id='sk-RegDropDown-TSGADW002-TSGADW002DW1']")
	WebElement TSGADW002DW1label;

	@FindBy(id = "RegDropDown-TSGADW002-TSGADW002DW1")
	List<WebElement> TSGADW002DW1;

	//@FindBy(id = "RegDropDown-TSGADW002-TSGADW002DW2-select")
	@FindBy(xpath = "//div[@id='sk-RegDropDown-TSGADW002-TSGADW002DW2']//div[contains(@class,'react-select__control')]")
	WebElement TSGADW002DW2select;
	
	@FindBy(xpath = "//*[@id='RegDropDown-TSGADW002-TSGADW002DW2']")
	WebElement TSGADW002DW2input;
	
	@FindBy(xpath = "//*[@id='RegDropDown-TSGADW002-TSGADW002DW2']")
	List<WebElement> TSGADW002DW2;
	
	@FindBy(xpath = "//*[@id='sk-RegDropDown-TSGADW002-TSGADW002DW2']//*[contains(text(),'This field is mandatory')]")
	List<WebElement> TSGADW002DW2Errmsg;
	
//	@FindBy(id = "RegDropDown-TSGADW002-TSGADW002DW3-select")
//	WebElement TSGADW002DW3select;
	
	//@FindBy(xpath = "//*[@id='sk-RegDropDown-TSGADW002-TSGADW002DW3']")
	//WebElement TSGADW002DW3label;
	
	@FindBy(id= "sk-RegDropDown-TSGADW002-TSGADW002DW3")
	WebElement TSGADW002DW3label;
	
	@FindBy(id="sk-RegDropDown-TSGADW002-TSGADW002DW3")
	List<WebElement> TSGADW002DW3div;
	
	@FindBy(xpath = "//*[@id='sk-RegDropDown-TSGADW002-TSGADW002DW3']//*[contains(text(),'This field is mandatory')]")
	List<WebElement> TSGADW002DW3Errmsg;

	@FindBy(xpath = "//*[@id='sk-RegDropDown-TSGADW002-TSGADW002DW4']")
	List<WebElement> TSGADW002DW4div;
	
	/*TSGADW003*/
	
	@FindBy(xpath = "//*[contains(text(),'TSGADW003')]")
	WebElement TSGADW003;

	@FindBy(xpath = "//*[contains(text(),'TSGADW003Save')]")
	WebElement TSGADW003Save;

	@FindBy(xpath = "//span[contains(text(),'TSGADW003Back')]")
	WebElement TSGADW003Back;
	
	@FindBy(xpath = "//label[contains(@title,'TSGADW003DW1')]//i[contains(@class,'fa-info-circle')]")
	WebElement infoIconTSGADW003DW1;

	@FindBy(xpath = "//*[contains(text(),'Hint Text for TSGADW003DW1')]")
	WebElement hintTextTSGADW003DW1;
	
	@FindBy(xpath = "//*[@id='RegDropDown-TSGADW003-TSGADW003DW1']")
	WebElement TSGADW003DW1input;
	
	@FindBy(xpath = "//*[@id='RegDropDown-TSGADW003-TSGADW003DW1']")
	List <WebElement> TSGADW003DW1;
	
	@FindBy(xpath = "//*[@id='RegDropDown-TSGADW003-TSGADW003DW1-tooltip']//*[contains(text(),'Info Text')]")
	WebElement infoTextTSGADW003DW1;
	
	@FindBy(xpath = "//*[@id='RegDropDown-TSGADW003-TSGADW003DW2']")
	WebElement TSGADW003DW2input;
	
	@FindBy(xpath = "//div[@id='sk-RegDropDown-TSGADW003-TSGADW003DW2']//div[contains(@class,'react-select__control')]")
	WebElement TSGADW003DW2select;
	
	@FindBy(xpath = "//div[@id='sk-RegDropDown-TSGADW003-TSGADW003DW2']//div[contains(@class,'placeholder')]")
	WebElement PlaceHolderTSGADW003DW2;

	public void TSGADW001(String StyleClassName, String[] strFixValueRange) throws Throwable {
		
		objcommonFunctions.selectTestScenario(TSGADW001, TSGADW001Save);
		loginfo("Clicked on TSGADW001");
		
		loginfo("TSGADW001DW1 - Check the Style class of the Dropdown.");
		objcommonFunctions.verifyStyleClass(TSGADW001DW1div,StyleClassName);
		//Assert.assertTrue(TSGADW001DW1div.getAttribute("class").contains(StyleClassName),"TSGADW001DW1 - Expected : Style Class Name - "+StyleClassName+". / Actual : Style Class Name - "+TSGADW001DW1div.getAttribute("class"));
		loginfo("TSGADW001DW1 - Verified the Style class of the Dropdown.");
		
		loginfo("TSGADW001DW1 - Check the selected value of the Dropdown.");
		objcommonFunctions.verifyDefaultValue(TSGADW001DW1input,strFixValueRange[0]);
		//Assert.assertTrue(TSGADW001DW1input.getAttribute("value").contains(strFixValueRange[0]),"TSGADW001DW1 - Expected : Value - "+strFixValueRange[0]+". / Actual : Value - "+TSGADW001DW1input.getAttribute("value"));
		loginfo("TSGADW001DW1 - Verified the selected value of the Dropdown.");
		
		//replave with method, add correct log info
		//loginfo("TSGADW001DW1 - Expected : Value - "+strFixValueRange[0]+". / Actual : Value - "+TSGADW001DW1input.getAttribute("value"));
		for (int i = 0; i < strFixValueRange.length; i++) {
			//TSGADW001DW1select.click();
			int Noofdropdownvalue = 3;
			driverwait(1);

			loginfo("TSGADW001DW1 - Checking the value of the Dropdown : "+strFixValueRange[i]+".");
			objcommonFunctions.selectDWvalue(strFixValueRange[i], i, TSGADW001DW1input, TSGADW001DW1select, Noofdropdownvalue);
			objcommonFunctions.verifyDefaultValue(TSGADW001DW1input,strFixValueRange[i]);
			//Assert.assertEquals(TSGADW001DW1input.getAttribute("value"), strFixValueRange[i],"TSGADW001DW1 - Expected : Value - "+strFixValueRange[i]+". / Actual : Value - "+TSGADW001DW1input.getAttribute("value"));
			loginfo("TSGADW001DW1 - Verified the value of the Dropdown : "+strFixValueRange[i]+".");
			//call fix value range
		}
		
		objcommonFunctions.saveOrback(TSGADW001Save);
		objcommonFunctions.saveOrbackVerifcation(TestPage);
	}

	public void TSGADW002(String[] strFixValueRange, String strErrMsg) throws Throwable {
		objcommonFunctions.selectTestScenario(TSGADW002, TSGADW002Save);
		//Dw1- validations - ReadOnly
		
		loginfo("TSGADW002DW1 - Check the Default property(Read Only) of Dropdown.");
		objcommonFunctions.checkReadOnly(TSGADW002DW1label);
		loginfo("TSGADW002DW1 - Verified the Default property(Read Only) of Dropdown.");
	
		//Dw2 -validations - Read Write
		loginfo("TSGARB002DW2-Checking values are selectable(Read and Write) in Dropdown.");
		for (int i = 0; i < strFixValueRange.length; i++) {
			//TSGADW001DW1select.click();
			int Noofdropdownvalue = 3;
			driverwait(1);
			objcommonFunctions.selectDWvalue(strFixValueRange[i], i, TSGADW002DW2input, TSGADW002DW2select, Noofdropdownvalue);
			
			loginfo("TSGADW002DW2 - Checking the value of the Dropdown :"+strFixValueRange[i]+".");
			objcommonFunctions.verifyDefaultValue(TSGADW002DW2input,strFixValueRange[i]);
			//Assert.assertEquals(TSGADW002DW2input.getAttribute("value"), strFixValueRange[i],"TSGADW002DW2 - Expected : Value - "+strFixValueRange[i]+". / Actual : Value - "+TSGADW002DW2input.getAttribute("value"));
			loginfo("TSGADW002DW2 - Verified the value of the Dropdown :"+strFixValueRange[i]+".");
					
		}
		loginfo("TSGARB002DW2-Verifed values are selectable(Read and Write) in Dropdown.");
		
		//DW3-Validations - Disabled		
		loginfo("TSGADW002DW3-Checking Check the Default property(Disabled) of Dropdown.");
		objcommonFunctions.checkDisabled(TSGADW002DW3label);
		loginfo("TSGADW002DW3-Verified Check the Default property(Disabled) of Dropdown.");
		
		//DW4 Validations - Hidden
		loginfo("TSGADW002DW4-Checking Check the Default property(hidden) of Dropdown.");
		objcommonFunctions.checkHidden(TSGADW002DW4div);
		loginfo("TSGADW002DW4-Verified Check the Default property(hidden) of Dropdown.");
		
		objcommonFunctions.saveOrback(TSGADW002Save);
		//replace common method\
		loginfo("TSGADW002DW2 - Checking Error message is not displayed");
		objcommonFunctions.verifyValidationMsg(TSGADW002DW2Errmsg,"");
		loginfo("TSGADW002DW2 - Verified Error message is not displayed");
		
		loginfo("TSGADW002DW3 - Checking Error message is not displayed");
		objcommonFunctions.verifyValidationMsg(TSGADW002DW3Errmsg,"");
		loginfo("TSGADW002DW3 - Verified Error message is not displayed");
		
		//Assert.assertTrue(TSGADW002DW2Errmsg.isEmpty(),"Expected : There should not be any error / Actual : Error not is displayed.");
		//Assert.assertTrue(TSGADW002DW3Errmsg.isEmpty(),"Expected : There should not be any error / Actual : Error not is displayed.");
		objcommonFunctions.saveOrbackVerifcation(TestPage);
	}
	
	public void TSGADW003( String[] strFixValueRangeDW1, String[] strFixValueRangeDW2, String strInfotext ,String hinttext,String strPlaceHolderTextDW2) throws Throwable {
		
		int Noofdropdownvalue = 3;
		
		objcommonFunctions.selectTestScenario(TSGADW003, TSGADW003Save);		
		//DW1 = validations
		// Performing the mouse hover action on the info icon.
		action.moveToElement(infoIconTSGADW003DW1).perform();
		driverwait(1);
		
		loginfo("TSGADW003DW1 - Checking if default option is selected.");
		objcommonFunctions.verifyDefaultValue(TSGADW003DW1input,strFixValueRangeDW1[2]);
		//Assert.assertTrue(TSGADW003DW1input.getAttribute("value").contains(strFixValueRangeDW1[2]));
		loginfo("TSGADW003DW1 - Verified if default option is selected.");
		
		
		loginfo("TSGADW003DW1 - Checking info text for visibility.");
		objcommonFunctions.verifyInfoIcon(infoTextTSGADW003DW1);
		//Assert.assertTrue(infoTextTSGADW003DW1.isDisplayed(), "TSGADW003DW1 - Expected : Info Text not displayed. / Actual : Info Text not displayed.");
		loginfo("TSGADW003DW1 - Verified info text for visibility.");
		
		loginfo("TSGADW003DW1 - Checking hint text for visibility.");
		objcommonFunctions.verifyInfoIcon(hintTextTSGADW003DW1);
		//Assert.assertTrue(hintTextTSGADW003DW1.isDisplayed(), "TSGADW003DW1 - Expected : Hint Text not displayed. / Actual : Hint Text not displayed.");
		loginfo("TSGADW003DW1 - Verified hint text for visibility.");
		
		loginfo("TSGADW003DW1 - Checking info text for content.");
		objcommonFunctions.verifyInfoHintText(infoTextTSGADW003DW1,strInfotext);
		//Assert.assertEquals(infoTextTSGADW003DW1.getText(), strInfotext,"TSGADW003DW1 - Expected : Info Text - "+strInfotext+" / Actual : Info Text - "+infoTextTSGADW003DW1.getText());
		loginfo("TSGADW003DW1 - Verified info text for content.");
		
		loginfo("TSGADW003DW1 - Checking hint text for content.");
		objcommonFunctions.verifyInfoHintText(hintTextTSGADW003DW1,hinttext);
		//Assert.assertEquals(hintTextTSGADW003DW1.getText(), hinttext,"TSGADW003DW1 - Expected : Info Text - "+hinttext+" / Actual : Info Text - "+hintTextTSGADW003DW1.getText());
		loginfo("TSGADW003DW1 - Verified hint text for content.");
		
		//DW2 validations
		loginfo("TSGADW003DW2 - Checking placeholder text.");
		objcommonFunctions.verifyInfoHintText(PlaceHolderTSGADW003DW2,strPlaceHolderTextDW2);
		//Assert.assertEquals(PlaceHolderTSGADW003DW2.getText(),strPlaceHolderTextDW2,"TSGADW003DW2 - Expected : Value - "+strPlaceHolderTextDW2+" / Actual : Value - "+PlaceHolderTSGADW003DW2.getText());
		loginfo("TSGADW003DW2 - Verified placeholder text.");
		
		for (int i = 0; i < strFixValueRangeDW2.length; i++) {
			driverwait(1);
			objcommonFunctions.selectDWvalue(strFixValueRangeDW2[i], i, TSGADW003DW2input, TSGADW003DW2select, Noofdropdownvalue);
			
			loginfo("TSGADW003DW2 - Checking the value of the Dropdown :"+strFixValueRangeDW2[i]+".");
			objcommonFunctions.verifyDefaultValue(TSGADW003DW2input,strFixValueRangeDW2[i]);
			//Assert.assertEquals(TSGADW003DW2input.getAttribute("value"), strFixValueRangeDW2[i],"TSGADW003DW2 - Expected : Value - "+strFixValueRangeDW2[i]+" / Actual : Value - "+TSGADW003DW2input.getAttribute("value"));
			loginfo("TSGADW003DW2 - Verified the value of the Dropdown :"+strFixValueRangeDW2[i]+".");
		}
		//objcommonFunctions.selectDWvalue(strFixValueRangeDW2[1], 1, TSGADW003DW2input, TSGADW003DW2select, Noofdropdownvalue);
		objcommonFunctions.saveOrback(TSGADW003Save);
		objcommonFunctions.saveOrbackVerifcation(GATab);
	}	
}
