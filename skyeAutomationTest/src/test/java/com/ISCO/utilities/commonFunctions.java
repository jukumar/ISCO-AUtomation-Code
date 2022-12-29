package com.ISCO.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.ISCO.base.BaseClass;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

public class commonFunctions extends BaseClass {

	public commonFunctions(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
		wait = new WebDriverWait(driver, TIMEOUT, POLLING);
	}

	WebDriver driver;
	WebDriverWait wait;
	SoftAssert SoftAssert = new SoftAssert();
	Actions action = new Actions(getDriver());

	// Supporting method for GetOutputFormatNumber()
		private NumberFormat getNumberFormat(Locale locale) {

			NumberFormat numberFormat = NumberFormat.getIntegerInstance(locale);
			numberFormat.setGroupingUsed(true);
			numberFormat.setParseIntegerOnly(true);
			numberFormat.setRoundingMode(RoundingMode.FLOOR);
			return numberFormat;
		}

		public String GetOutputFormatNumber(String value) {
			try {
				NumberFormat numberFormat = getNumberFormat(new Locale("en", "US"));
				String data = numberFormat.format(Double.parseDouble(value));				
				return data;
				//return numberFormat.format(Long.parseLong(value));
				//return numberFormat.format(value);
				//return numberFormat.format(Float.parseFloat(value));
				
			} catch (Exception e) {
				loginfo("Could not parse value " + value + " to number : " + e);
			}
			return value;
		}

		public boolean validatePhoneNumber(String strPhoneNumber, String strCountryCode, String strFormat) {

			// creating an instance of PhoneNumber Utility class
			PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();

			// creating a variable of type PhoneNumber
			PhoneNumber phoneNumber = null;
			try {

				// the parse method parses the string and
				// returns a PhoneNumber in the format of
				// specified region
				phoneNumber = phoneUtil.parse(strPhoneNumber, strCountryCode);

				if (strFormat.equalsIgnoreCase("NONE"))
					return phoneUtil.isValidNumber(phoneNumber);

				PhoneNumberFormat numberFormat = null;
				if (strFormat.equalsIgnoreCase("E164"))
					numberFormat = PhoneNumberFormat.E164;
				else if (strFormat.equalsIgnoreCase("NATIONAL"))
					numberFormat = PhoneNumberFormat.NATIONAL;
				else if (strFormat.equalsIgnoreCase("INTERNATIONAL"))
					numberFormat = PhoneNumberFormat.INTERNATIONAL;

				// prints the type of the phone number
				loginfo("\nType : " + phoneUtil.getNumberType(phoneNumber));
				loginfo("\nNumberFormat : " + numberFormat);
				// Format the Phone Number
				phoneUtil.format(phoneNumber, numberFormat);

			} catch (NumberParseException e) {
				// TODO: handle exception
				loginfo("Error while asserting Phone Number : " + e);
				loginfo("Unable to parse the given phone number : " + strPhoneNumber);

			}
			// return the boolean value of the validation
			// performed
			return phoneUtil.isValidNumber(phoneNumber);
		}
	
	public void buildXpath(String RootName, String BrickName, String AttributeName, int size) throws Throwable {
		String temp = "";
		WebElement tempelement;
		for (int i = 1; i <= size; i++) {
			temp = "//*[@id='" + RootName + "-" + BrickName + "-" + AttributeName + "-" + i + "checkbox']";
			tempelement = driver.findElement(By.xpath(temp));			
			moveToElementandClick(tempelement);
			driverwait(1);
		}
	}

	

	public WebElement CreateXpathForskOptions(String RootName, String BrickName, String AttributeName, int index,
			String typeofdiplay) {
		String temp = "";
		WebElement tempelement;
		temp = "//label[@for='" + RootName + "-" + BrickName + "-" + AttributeName + "-" + index + "']//"
				+ typeofdiplay;
		tempelement = driver.findElement(By.xpath(temp));
		return tempelement;
	}

	public int rand(int min, int max) {
		if (min > max || (max - min + 1 > Integer.MAX_VALUE)) {
			throw new IllegalArgumentException("Invalid range");
		}

		return new Random().nextInt(max - min + 1) + min;
	}

	public Float randDecimal(int min, int max) {
		if (min > max || (max - min + 1 > Float.MAX_VALUE)) {
			throw new IllegalArgumentException("Invalid range");
		}

		return new Random().nextFloat() * (max - min);
	}

	public boolean isValidInputData(String regex, String data) {
		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// to find matching between given data
		// and regular expression.
		Matcher m = p.matcher(data);

		// Return if the data
		// matched the ReGex
		return m.matches();
	}

	public String createString(int stringLength) {
		// teststring of length 20
		String strCharacter = "This is Test String!";
		// Multiply the teststring length with n

		StringBuilder sbString = new StringBuilder(stringLength);

		for (int i = 0; i < (stringLength / 20); i++) {
			sbString.append(strCharacter);
		}
		loginfo("Test string length - " + sbString.length());
		return sbString.toString();
	}
	/*
	 * /Select the Test scenario number and wait for save button on the page.
	 * Parameters:1. Element of TestScenario Number 2. wait for Element that will be
	 * displayed on the target page after clicking on the test scenario number.
	 */

	public void selectTestScenario(WebElement weTestScenarioNumber, WebElement webEleWaitElement) {

		waitForElementClickable(weTestScenarioNumber, wait);
		moveToElementandClick(weTestScenarioNumber);
		waitForElement(webEleWaitElement, wait);

	}
	
	public void verifyStyleClass(WebElement weInputElement, String strStyleClassName) {
		
		Assert.assertTrue(weInputElement.getAttribute("class").contains(strStyleClassName),"Expected : Styleclass Name = "+ strStyleClassName+". / Actual : Styleclass Name = "+weInputElement.getAttribute("class"));
		
	}
	
	public void SelectOptionfromDW(int index) {
			//Actions actionkey = new Actions(driver);
			// String strCountPress = ",Keys.ARROW_DOWN",strCommand=null;
			for (int i = 0; i< index; i++) 
				action.sendKeys(Keys.chord(Keys.ARROW_DOWN)).perform();
				action.sendKeys(Keys.chord(Keys.ENTER)).build().perform();
		}

		public void selectDWvalue(String strFixValueRange, int index, WebElement dropDown, WebElement selectDropdown, int Noofdropdownvalue) {
			
			int i=0;
			do {
				selectDropdown.click();
				driverwait(1);
				if(index==0) {
					action.sendKeys(Keys.ENTER).build().perform();
					driverwait(1);	
					loginfo("Enter alone Performed");
					loginfo(dropDown.getAttribute("value").toString()+" compare with "+strFixValueRange);
				}
				else if(index==2) {
					action.sendKeys(Keys.ARROW_UP).build().perform();
					driverwait(1);
					action.sendKeys(Keys.ENTER).build().perform();
					driverwait(1);
					loginfo("Arrow Up Performed");
					loginfo(dropDown.getAttribute("value").toString()+" compare with "+strFixValueRange);
				}
				else {
					action.sendKeys(Keys.ARROW_DOWN).build().perform();
					driverwait(1);
					action.sendKeys(Keys.ENTER).build().perform();
					driverwait(1);
					loginfo("Arrow Down Performed");
					//actionkey.sendKeys(Keys.chord(Keys.ENTER)).build().perform();
					loginfo(dropDown.getAttribute("value").toString()+" compare with "+strFixValueRange);
									
				}
				i++;
				if(i >= Noofdropdownvalue) {
					loginfo("No of dropdown options : "+i+" executed.");
					break;
				}
			}
			while (!dropDown.getAttribute("value").toString().equals(strFixValueRange));
			
		}
		
		public void saveOrback(WebElement webElement) {
			waitForElement(webElement, wait);
			moveToElement(webElement);
			webElement.click();
			driverwait(1);
			loginfo("Save or Back clicked to complete.");
		}

		public void saveOrbackVerifcation(List<WebElement> webElement) {
			try {
				wait.until(ExpectedConditions.visibilityOfAllElements(webElement));
				checkEnabeled(webElement,true);
				loginfo("Save Or Back sucessfully executed");
			}catch(Exception e) {
				Assert.assertTrue(false,"Save Or Back was not successfully executed.");
				loginfo("Save Or Back was not sucessfully executed.");
			}
		}
	public void verifyDefaultValue(WebElement webInputElement, String strDefaultValue) {

		if (strDefaultValue == "") {
			//if (webInputElement.getAttribute("value") == null) 
			try {
				if (webInputElement.getAttribute("value").isEmpty()){
					
					Assert.assertTrue(webInputElement.getAttribute("value").isEmpty());
					loginfo("Default value verified - is Empty");
				}	
				
				else if (webInputElement.getAttribute("value").isBlank()){
				
					Assert.assertTrue(webInputElement.getAttribute("value").isBlank());
					loginfo("Default value verified - is Empty");
				}
			}
			catch (NullPointerException ex){			
				Assert.assertTrue(webInputElement.getText().isBlank());
				loginfo("Default value verified - is Empty");	
			}
		}
		else {
			try {
				if(!webInputElement.getAttribute("value").isEmpty()) {
					Assert.assertEquals(webInputElement.getAttribute("value"), strDefaultValue, "Expected : "+strDefaultValue+". / Actual : "+webInputElement.getAttribute("value"));
					loginfo("Default value is verified : "+webInputElement.getAttribute("value"));
				}
				else 
				{
					Assert.assertEquals(webInputElement.getText(), strDefaultValue, "Expected : "+strDefaultValue+". / Actual : "+webInputElement.getText());
					loginfo("Default value is verified : "+webInputElement.getText());
				}
			}
			catch (NullPointerException ex){			
				Assert.assertEquals(webInputElement.getText(), strDefaultValue, "Expected : "+strDefaultValue+". / Actual : "+webInputElement.getText());
				loginfo("Default value is verified : "+webInputElement.getText());	
			}
			
		}

	}
	public void verifyLable(WebElement webInputElement, String strlabel) {
		Assert.assertEquals(webInputElement.getText(), strlabel,"Expected : Label should be "+strlabel+". / Actual : "+webInputElement.getText());
	}
	
	public void verifyInfoIcon(WebElement webInputElement) {
		Assert.assertTrue(webInputElement.isDisplayed(),
				"Expected: Info Icon should be displayed. / Actual : Info Icon is not displayed.");
	}
	public void verifyInfoHintText(WebElement weInputElement, String txtInfoHint) {
		// Verify InfoText or HintText
		Assert.assertEquals(weInputElement.getText(), txtInfoHint,"Expected: Info or Hint Text should be displayed. / Actual : Info or Hint Text is not displayed." );

	}
	
	public void verifyValidationMsg(List<WebElement> webElementList, String validationMsg) {
		// Verify validation message
		if(validationMsg.isBlank()) {
			Assert.assertTrue(webElementList.isEmpty(),"Expected : There should not be any validation messages. / Acutal : Validation message is appearing.");
		}
		else {
			Assert.assertEquals(webElementList.get(0).getText(), validationMsg,"Expected: Validation message should be displayed. / Actual : Validation message is not displayed." );
		}
	}
	public void verifyfileremoval(List<WebElement> webElementList, boolean flag) {
		// Verify file present or removed
		if(flag) {
			Assert.assertTrue(webElementList.isEmpty(),"Expected : File is removed. / Actual : File should not be removed.");
		}
			
		else {
			Assert.assertFalse(webElementList.isEmpty(),"Expected : File should not be removed. / Actual : File is removed.");
		}
	}
	
	public void verifyReadWrite(List<WebElement> webListElement) {

		try {
			waitForElement(webListElement.get(0), wait);
			Assert.assertTrue(webListElement.get(0).isEnabled(),"Expected : Webelement available and enabled. / Actual : Webelement is not available or disabled");
			
		}
		catch(IndexOutOfBoundsException e) {
			loginfo("Expected : Webelement available and enabled. / Actual : Webelement is not available or disabled. Error occured : "+e);
			Assert.fail("Expected : Webelement available and enabled. / Actual : Webelement is not available or disabled. Error occured : "+e);
			
		}
		


	}

	
	
	public void checklabelOfOptions(List<WebElement> listele, String[] arrOptions) {

		Assert.assertEquals(listele.size(), arrOptions.length);
		int i = 0;
		for (WebElement tempEle : listele) {
			Assert.assertEquals(tempEle.getAttribute("value"), arrOptions[i].toString());
			i++;
		}

	}
	public boolean checkOrientation(boolean result, List<WebElement> element, String alignment) throws InterruptedException {

		boolean flag = false;
		ArrayList<Integer> xlist = new ArrayList<Integer>();
		ArrayList<Integer> ylist = new ArrayList<Integer>();

		Set<Integer> yset = new HashSet<Integer>();
		//Set<Integer> xset = new HashSet<Integer>();

		for (WebElement tempEle : element) {
			// Used points class to get x and y coordinates of element.
			Point point = tempEle.getLocation();
			xlist.add(point.getX());
			ylist.add(point.getY());

		}
		/*
		 * for horizontal alignment y-cordinate will be same.Hence checking if atleast 2
		 * options has the same y-cordinate
		 */
		  if (alignment.equalsIgnoreCase("H")) {
			  for (Integer ycor : ylist) { 
				  if (yset.add(ycor) == false) {
					 
					  flag = true; 
					  
				}
			} 
			  if(flag) {
				  loginfo("More than one value of Y-axes are same : " + ylist);
				  result = true;
			  }
			  else
			  {
				  loginfo("More than one value of Y-axes are not same : " + ylist);
				  result = false;
			  }
		  
		  } 
		//for vertical alignment x-cordinate all will be same.
		  else if (alignment.equalsIgnoreCase("V")) {
			  //for (Integer xcor : xlist) { 
				 // if (xset.add(xcor) == false) {					  
					  
					  //flag = true;
				  //} 
			  for (int i = 1; i < xlist.size(); i++) {
				  //Set threshold +-5
				  if (xlist.get(0)+5 >= (xlist.get(i)) && xlist.get(0)-5 <= (xlist.get(i))){
						flag = true;
					} else {						
						flag = false;
						break;
						
					}
				}
			  if(flag) {
				  loginfo("All values of X-axes are in threshold : " + xlist);
				  result = true;
			  }
			  else
			  {
				  loginfo("All values of X-axes are not in threshold : " + xlist);
				  result = false;
			  }
			}
		  return result;

	}
		
	/*** Check box and Radio button default value***/
	public void checkboxDefaultSelected(List<WebElement> listele, int selectedoption) throws Throwable {
		int i = 1;
		boolean flag = false;
		// selectedoption = 0 - means no default value should be selected.
		if (selectedoption == 0) {
			for (WebElement tempEle : listele) {
				if (tempEle.getAttribute("data-selected") == "true") {
					flag = false;
					Assert.assertTrue(flag, "Expected : No default option. / Actual : Default option is selected");
				}
			}

		} else {
			for (WebElement tempEle : listele) {

				if ((tempEle.getAttribute("data-selected") == "true") && i == selectedoption) {
					flag = true;
					Assert.assertTrue(flag,
							"Expected : Default option to be selected. / Actual :  No Default option is selected");
				}
				i++;

			}

		}

	}

	public void checkEnabeled(List<WebElement> listele, boolean condition) {
		boolean flag = true;
		if (condition == true) {
			for (WebElement tempEle : listele) {
				if (tempEle.getAttribute("data-disabled") == "false") {
					flag = false;
					Assert.assertTrue(flag, "Expected : Options Enabled. / Actual : options found to be disabled");
				}
			}

		} else {
			for (WebElement tempEle : listele) {
				if (tempEle.getAttribute("data-disabled") == "true") {
					flag = false;
					Assert.assertTrue(flag, "Expected : Options Disabled. / Actual : Options found to be Enabeled");
				}
			}

		}

	}

	

	public void clickOnElementsWithArrowKeys(List<WebElement> listele, int size) throws Throwable {


		for (int i = 0; i <= 2; i++) {

			listele.get(i).sendKeys(Keys.ARROW_UP);
			loginfo("ARROW UP");
			driverwait(1);
		}

	}

	public void checkLengthOfText(List<WebElement> listele, int index, int lengthofstring) throws Throwable {

		int i = 1;
		for (WebElement tempEle : listele) {
			i++;
			loginfo("Text of the option string : " + tempEle.getAttribute("value"));
			
			if (i == index)
				Assert.assertTrue(tempEle.getText().length() == lengthofstring,
						"Expected : Length of the option string should be longer. / Actual : Length of the option found shorter ");
		}

	}
	
	public int checkLength(WebElement webElement) {		
		int length;
		return length = webElement.getAttribute("value").length();
		
	}

	public void checkFixValueRangeCount(List<WebElement> listele, int size) {

		Assert.assertTrue((listele.size()) == size,
				"Expected : No. Of Elements(Fix value range) of the " + listele + " = " + size
						+ " / Actual : Found the Size of the  options list in " + listele + " : " + listele.size());
	}

	public void checkReadOnly(WebElement weLabelElement) {

		Assert.assertTrue(weLabelElement.getAttribute("data-readonly").contains("true"),"Expected : "+weLabelElement+"  should be readonly. / Actual : "+weLabelElement+ " is not readonly");
		//ToDo: add this for text box cases in page only to validate and remove unused list webelement
		//Assert.assertTrue(lstTextBoxElement.isEmpty()); 

	}
	/*** Checkbox and Radio button related***/
	public void checkboxReadandWrite(List<WebElement> listele) throws Throwable {

		/// check if each option is clickable
		// Creating object of an Actions class
		//Actions action = new Actions(driver);
		for (WebElement tempEle : listele) {
			// Performing the mouse hover action on the info icon.
			action.click(tempEle).perform();
			driverwait(1);

		}

	}
	
	//Enter data and verify default value
	public void validInvalidDataEnter(WebElement webElement, String strDefaultValueToEnter, String strDefaultValueToVerify) {
		enterValue(webElement, strDefaultValueToEnter);
		verifyDefaultValue(webElement, strDefaultValueToVerify);		
	}
	
	//Enter data, verify default value optional, verify validation msg.
	public void validInvalidDataEnter(WebElement webElement, List<WebElement> WebListElement, String strDefaultValueToEnter, String strDefaultValueToVerify, String strValidationMsg, boolean skipDefaultValueVerify) {
		enterValue(webElement, strDefaultValueToEnter);
		if(skipDefaultValueVerify) {
			verifyDefaultValue(webElement, strDefaultValueToVerify);
		}
		verifyValidationMsg(WebListElement, strValidationMsg);
		
	}

	public void checkHidden(List<WebElement> WebListElement) {


		Assert.assertTrue(WebListElement.isEmpty(),"Expected: Attribute should be hidden. / Actual : Attribute is not hidden.");

	}


public void enterValue(WebElement element, String data){
        
        waitForElementClickable(element, wait);    
        try{
            if (!element.getAttribute("Value").isEmpty()) {
                Clear(element);
                driverwait(1);
            }
        }    
        catch (NullPointerException ex){
            if (!element.getText().isEmpty()) {
            Clear(element);
            driverwait(1);
            }
        }
        element.sendKeys(data);
        driverwait(1);
        element.sendKeys(Keys.TAB);
        driverwait(1);
        loginfo("Value entered is : "+data+".");
   }


	
	
	public void verifyNotEmpty(WebElement element, String elementName){
		
		if (!element.getText().isEmpty()) {
			Assert.assertTrue(!element.getText().isEmpty());
			loginfo("Verified Web Element "+elementName+" - is Not Empty");
		}
		else {
			Assert.assertTrue(element.getText().isEmpty());
			loginfo("Verified Web Element "+elementName+" - is Empty");
		}
	}
	
	public void uploadFile(String fileName) throws AWTException {
		StringSelection s = new StringSelection(System.getProperty("user.dir") + fileName);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		/*
		 * driverwait(2); Robot r = new Robot(); driverwait(2);
		 * r.keyPress(KeyEvent.VK_CONTROL); r.keyPress(KeyEvent.VK_V);
		 * r.keyPress(KeyEvent.VK_TAB); r.keyPress(KeyEvent.VK_TAB);
		 * r.keyPress(KeyEvent.VK_ENTER); r.keyPress(KeyEvent.VK_CONTROL);
		 */
		// imitate mouse events like ENTER, CTRL+C, CTRL+V
		Robot robot = new Robot();
		// robot.keyPress(KeyEvent.VK_ENTER);
		// robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(1000);
		// robot.keyRelease(KeyEvent.VK_V);
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.delay(1000);
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.delay(1000);
		// robot.keyRelease(KeyEvent.VK_CONTROL);
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.delay(2000);
		//robot.keyPress(KeyEvent.VK_CONTROL);
		//robot.delay(500);		
		//robot.delay(500);
		//robot.keyRelease(KeyEvent.VK_ENTER);
		//robot.delay(500);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);		
		driverwait(2);
		s = null;
		StringSelection t = new StringSelection("");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(t, null);
	}
	
	

	public void checkDisabled(WebElement weLabelElement) {
		Assert.assertTrue(weLabelElement.getAttribute("data-disabled").contains("true"),"Expected : "+weLabelElement+"  should be disabled. / Actual : "+weLabelElement+ " is not disabled");
		//ToDo: add this for text box cases in page only to validate and remove unused list webelement
		//Assert.assertFalse(lstTextBoxElement.get(0).isEnabled()); 

	}
	
	public void tabOut() {
        Actions action = new Actions(driver);
       action.sendKeys(Keys.TAB).build().perform();
    }
	
	// The lst options will get loaded only when the dropdown is clicked. So first click
    // on the dropdown and then call this function to select respected value.
    public void SelectFromDropdown(List<WebElement> lstElementOPtions, String OptionText) {
        int iSize=lstElementOPtions.size();
        for (int i = 0; i < iSize; i++) {
            if(lstElementOPtions.get(i).getText().equals(OptionText))
            {
                //moveToElement(lstElementOPtions.get(i));
                lstElementOPtions.get(i).click();
                break;
            }
        }
    }
	
    
    }

