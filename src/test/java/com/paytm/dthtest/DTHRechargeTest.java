package com.paytm.dthtest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.paytm.dthpage.DthRechargePage;
import com.paytm.pages.PayTmHeadersPage;
import com.paytm.pages.mobile.CouponsPage;
import com.paytm.tests.BaseTest;

/**
 * @author Venu
 * @since Mar 30, 2016.
 * @
 */
public class DTHRechargeTest extends BaseTest{

	/**
	 * Test case to verify DTH Recharge.
	 * @author venkatesh
	 */
	@Test(description="Test case to verify DTH Recharge.")
	public void testDTHRecharge(){
		// Click on DTH header.
		PayTmHeadersPage headersPage = PageFactory.initElements(driver, PayTmHeadersPage.class);
		DthRechargePage dthRechargePage = headersPage.clickOnDTH();
		
		// Select Operator.
		dthRechargePage.selectOperator();
		
		// Set customerID.
		dthRechargePage.setCustomerId("3456789012");
		
		// Set Amount.
		dthRechargePage.setAmount("1000");
		
		// Click on proceed to recharge and Navigate to Coupons page.
		CouponsPage couponsPage = dthRechargePage.clickProceedToRecharge();
		
		// Get actual and expected coupons text.
		String actualText = couponsPage.getCouponsText();
		String expectedText = "Coupons";
		
		// Verify Coupons text available on page.
		Assert.assertEquals(actualText, expectedText,"Coupons text not matched with expected");
	}
}
