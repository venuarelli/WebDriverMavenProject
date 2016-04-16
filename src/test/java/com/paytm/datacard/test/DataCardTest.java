package com.paytm.datacard.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.paytm.datacard.page.DataCardPage;
import com.paytm.pages.PayTmHeadersPage;
import com.paytm.pages.mobile.CouponsPage;
import com.paytm.tests.BaseTest;

public class DataCardTest extends BaseTest {

	@Test
	public void testDataCardPage() {
		PayTmHeadersPage headersPage = PageFactory.initElements(driver,
				PayTmHeadersPage.class);
		DataCardPage dataCardPage = headersPage.clickOnDataCard();
		dataCardPage.selectPrepaidDataCard();
		dataCardPage.enterDataCardNumber("9550172285");
		dataCardPage.selectOperator();
		dataCardPage.selectOperatorDropDown();
		dataCardPage.enterAmoount("100");
		CouponsPage couponsPage = dataCardPage.proceedToRecharge();
		String actualText = couponsPage.getCouponsText();
		String expectedText = "Coupons";

		Assert.assertEquals(actualText, expectedText);

	}

}
