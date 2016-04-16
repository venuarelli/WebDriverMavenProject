package com.apipracticeexamples.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apipracticeexamples.CheckBoxExample;
import com.newtours.registration.pages.RegistrationPage;
import com.paytm.tests.BaseTest;

public class TestCheckBoxExample extends BaseTest{
	
	@Test
	public void testCheckBoxExample(){
		driver.navigate().to("http://the-internet.herokuapp.com/checkboxes");
		CheckBoxExample checkBoxExample = PageFactory.initElements(driver, CheckBoxExample.class);
		boolean isCheckBoxSelected = checkBoxExample.isCheckBoxSelected();
		Assert.assertFalse(isCheckBoxSelected);
		
		checkBoxExample.clickCheckBox();
		isCheckBoxSelected = checkBoxExample.isCheckBoxSelected();
		Assert.assertTrue(isCheckBoxSelected);
		
		boolean isDisplayed = checkBoxExample.isDisplayed();
		Assert.assertTrue(isDisplayed);
		
		boolean isCheckBoxDisplayed = checkBoxExample.isCheckBoxDisplayed();
		Assert.assertFalse(isCheckBoxDisplayed);
	}
	
	@Test 
	
	public void testIsEnabled(){
		driver.navigate().to("http://the-internet.herokuapp.com/checkboxes");
		CheckBoxExample checkBoxExample = PageFactory.initElements(driver, CheckBoxExample.class);
		 boolean isSubmitButtonEnabled =  checkBoxExample.isSubmitButtonEnabled();
		 Assert.assertFalse(isSubmitButtonEnabled);
		
	}
	
	@Test
	
	public void testDropDown(){
		driver.navigate().to("http://newtours.demoaut.com/mercuryregister.php?osCsid=28f04b5292d9ec707ac1ebe5d97de626");
		RegistrationPage checkBoxExample = PageFactory.initElements(driver, RegistrationPage.class);
		checkBoxExample.selectCountry("ALGERIA");
		 String actualText = checkBoxExample.getSelectedValue();
		 String expectedText = "ALGERIA ";
		 Assert.assertEquals(actualText, expectedText);
		 
		
		
	}

}
