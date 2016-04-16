package com.paytm.dthtest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.paytm.dthpage.DthRechargePage;
import com.paytm.pages.PayTmHeadersPage;
import com.paytm.tests.BaseTest;

public class CheckingErrorMessages  extends BaseTest{
	
	@Test  
	
	public void testCheckingErrorMessages(){
		
		PayTmHeadersPage headersPage = PageFactory.initElements(driver, PayTmHeadersPage.class);
		DthRechargePage dthRechargePage = headersPage.clickOnDTH();
		dthRechargePage.clickProceedToRecharge();
		
		String actualText =  dthRechargePage.operatorErrorMessage();
		String expectedText = "DTH provider";
		Assert.assertTrue(actualText.contains(expectedText));
		
		
		String actual = dthRechargePage.rechargeAmountErrorMessage();
		String expected = "Recharge amount";
		
		Assert.assertTrue(actual.contains(expected));
		
		
	}

}
