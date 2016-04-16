package com.paytm.pages.mobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.paytm.pages.BasePage;

public class MobilePage extends BasePage{

	@FindBy(xpath="//md-radio-button[@value='prepaid']")
	WebElement prepaid;
	
	@FindBy(name="operatorName")
	WebElement mobileNumber;
	
	@FindBy(xpath="//input[@ng-model='amount']")
	WebElement amount;
	
	@FindBy(xpath="//*[text()='Proceed to Recharge']")
	WebElement rechargeButton;
	
	public MobilePage(WebDriver driver){
		super(driver);
	}
	
	public CouponsPage prepaidRecharge(String mobileNumber,String amount){
		prepaid.click();
		this.mobileNumber.clear();
		this.mobileNumber.sendKeys(mobileNumber);
		this.amount.clear();
		this.amount.sendKeys(amount);
		this.rechargeButton.click();
		return PageFactory.initElements(driver, CouponsPage.class);
	}
}
