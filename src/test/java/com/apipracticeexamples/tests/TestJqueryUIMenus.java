package com.apipracticeexamples.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.apipracticeexamples.JqueryUIMenus;
import com.paytm.tests.BaseTest;

public class TestJqueryUIMenus extends BaseTest {

	@Test
	
	public void testJqueryUIMenus(){
		driver.navigate().to("http://the-internet.herokuapp.com/jqueryui/menu#");
		JqueryUIMenus jqueryUIMenus = PageFactory.initElements(driver, JqueryUIMenus.class);
		jqueryUIMenus.clickOnEnabled();
		jqueryUIMenus.clickOnDownloads();
		jqueryUIMenus.clickOnPdf();
	}
}
