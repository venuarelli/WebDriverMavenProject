package com.paytm.hotels.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.paytm.pages.BasePage;

public class HotelsPage extends BasePage{
	
	public HotelsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@ng-model='hotels.cityOrHotel']")
	WebElement hotelName;
	
	@FindBy (xpath = "(//*[text()='Hyderabad'])[1]")
	WebElement dropDown;
	
	@FindBy (xpath = "//input[@ng-model='hotels.checkInDate']")
	WebElement checkIn;
	
	

}
