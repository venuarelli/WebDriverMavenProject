package com.paytm.landline.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.paytm.landline.page.LandLinePage;
import com.paytm.pages.PayTmHeadersPage;
import com.paytm.tests.BaseTest;

public class LandLineTest extends BaseTest{
	
	@Test
	
	public void testLandLinePage(){
		
		PayTmHeadersPage headersPage = PageFactory.initElements(driver, PayTmHeadersPage.class);
		LandLinePage landLinePage = headersPage.clickOnLandLineHeader();
		landLinePage.clickProceedToBillPayButton();
		
		String actualText = landLinePage.errorMessage();
		String expectedText = "Please Select Operator";
		
		Assert.assertEquals(actualText, expectedText);
		
		
	}

}
