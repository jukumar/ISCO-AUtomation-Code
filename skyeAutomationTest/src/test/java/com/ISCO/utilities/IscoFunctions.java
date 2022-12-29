package com.ISCO.utilities;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.interactions.internal.Locatable;
import org.testng.Assert;

import com.ISCO.base.BaseClass;

public class IscoFunctions extends BaseClass {
	
	public void tabOut() {
        Actions action = new Actions(driver);
       action.sendKeys(Keys.TAB).build().perform();
    }
	
	public void randomClickOnScreen() {
        Actions action = new Actions(driver);
        action.moveByOffset(0, 0).click().build().perform();
    }
	
	// This function is created for isco because Checkdisables is not working 
	public void checkDisabledIsco(WebElement weLabelElement) {
		moveToElement(weLabelElement);
		Assert.assertTrue(weLabelElement.getAttribute("class").contains("disabled"),"Expected : "+weLabelElement+"  should be disabled. / Actual : "+weLabelElement+ " is not disabled");
    }
	
	public static void verifyValidationMsg(WebElement webElement, String validationMsg) {
		// Verify validation message
		if(validationMsg.isBlank()) {
		//	Assert.assertTrue(webElement.,"Expected : There should not be any validation messages. / Acutal : Validation message is appearing.");
		}
		else {
			//Assert.assertEquals(webElementList.get(0).getText(), validationMsg,"Expected: Validation message should be displayed. / Actual : Validation message is not displayed." );
			Assert.assertEquals(webElement.getText(), validationMsg,"Expected: Validation message should be displayed. / Actual : Validation message is not displayed." );
		}
	}
	
	public void selectValuefromDropdown(WebElement dropDown, WebElement selectDropdown) {
		
		
	}

	public static void clickOnElement(WebElement Element) {
    	Element.click();
    }
	
	public void moveToElementISCO(WebElement element)  {
	    
		   // ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
		        Coordinates cor=((Locatable)element).getCoordinates();
		        cor.inViewPort();
		        driverwait(1);
		    }
	
	
//	public void selectDWvalue(String strFixValueRange, int index, WebElement dropDown, WebElement selectDropdown, int Noofdropdownvalue) {
//		
//		int i=0;
//		do {
//			selectDropdown.click();
//			driverwait(1);
//			if(index==0) {
//				action.sendKeys(Keys.ENTER).build().perform();
//				driverwait(1);	
//				loginfo("Enter alone Performed");
//				loginfo(dropDown.getAttribute("value").toString()+" compare with "+strFixValueRange);
//			}
//			else if(index==2) {
//				action.sendKeys(Keys.ARROW_UP).build().perform();
//				driverwait(1);
//				action.sendKeys(Keys.ENTER).build().perform();
//				driverwait(1);
//				loginfo("Arrow Up Performed");
//				loginfo(dropDown.getAttribute("value").toString()+" compare with "+strFixValueRange);
//			}
//			else {
//				action.sendKeys(Keys.ARROW_DOWN).build().perform();
//				driverwait(1);
//				action.sendKeys(Keys.ENTER).build().perform();
//				driverwait(1);
//				loginfo("Arrow Down Performed");
//				//actionkey.sendKeys(Keys.chord(Keys.ENTER)).build().perform();
//				loginfo(dropDown.getAttribute("value").toString()+" compare with "+strFixValueRange);
//								
//			}
//			i++;
//			if(i >= Noofdropdownvalue) {
//				loginfo("No of dropdown options : "+i+" executed.");
//				break;
//			}
//		}
//		while (!dropDown.getAttribute("value").toString().equals(strFixValueRange));
//		
//	}
}
