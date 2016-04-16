package com.paytm.tests.mobile;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.paytm.pages.mobile.CouponsPage;
import com.paytm.pages.mobile.MobilePage;
import com.paytm.tests.BaseTest;

public class MobileTest extends BaseTest{

	MobilePage mobilePage;
	
	@Test
	
	public void testPrepaidMobileRecharge(){
		mobilePage = PageFactory.initElements(driver, MobilePage.class);
		CouponsPage couponsPage = mobilePage.prepaidRecharge("9550172285", "100");
		
		String actualText = couponsPage.getCouponsText();
		String expectedText = "Coupons";
		
		Assert.assertEquals(actualText, expectedText,"Coupons text is not matched with expected");
	}
}
