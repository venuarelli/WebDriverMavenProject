package com.paytm.pages.mobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.paytm.pages.BasePage;

public class CouponsPage extends BasePage{

	@FindBy(xpath="//*[text()='Coupons']")
	WebElement couponsText;
	
	public CouponsPage(WebDriver driver) {
		super(driver);
	}
	
	public String getCouponsText(){
		return couponsText.getText();
	}

}
