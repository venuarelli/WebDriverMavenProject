package com.paytm.bustickets.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.paytm.bustickets.page.BusTicketsPage;
import com.paytm.pages.PayTmHeadersPage;
import com.paytm.tests.BaseTest;

public class BusTicketsTest extends BaseTest{
	
	@Test 
	
	public void testBusTicketsPage(){
	 PayTmHeadersPage headersPage = PageFactory.initElements(driver, PayTmHeadersPage.class); 
		BusTicketsPage busTicketsPage = headersPage.clickOnBusTicketsHeader();
		busTicketsPage.setOrigin("Hyderabad");
		busTicketsPage.setDestination("vijayawada");
		busTicketsPage.selectDate();
		busTicketsPage.selectDateDropDown();
		//busTicketsPage.seatesRequired();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		//busTicketsPage.seatesRequiredDropDown();
		busTicketsPage.searchBusesButton();
		
	}

}
