package com.paytm.datacard.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.paytm.pages.BasePage;
import com.paytm.pages.mobile.CouponsPage;

public class DataCardPage extends BasePage{

	public DataCardPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name = "serviceType")
	WebElement selectPrepaidDataCard;
	
	@FindBy(name = "dataCardNumber")
	WebElement enterDataCardNumber;
	
	@FindBy(xpath="//input[@ng-model='operatorName']")
	WebElement selectOperator;
	
	@FindBy(xpath="(//*[text()='Airtel'])[1]")
	WebElement selectOperatorDropDown;
	
	@FindBy(xpath="//input[@ng-model='amount']")
	WebElement amount;
	
	@FindBy(xpath = "//span[text()='Proceed to Recharge']")
	WebElement proceedToRecharge;
	
	
	public void selectPrepaidDataCard(){
		selectPrepaidDataCard.click();
	}
	public void enterDataCardNumber(String enterDataCardNumber){
		this.enterDataCardNumber.clear();
		this.enterDataCardNumber.sendKeys(enterDataCardNumber);
	}
	public void selectOperator(){
	selectOperator.click();	
	}

	public void selectOperatorDropDown(){
		selectOperatorDropDown.click();
	}
	public void enterAmoount(String amount){
		this.amount.clear();
		this.amount.sendKeys(amount);
	}

	public CouponsPage proceedToRecharge(){
		proceedToRecharge.click();
		
		return PageFactory.initElements(driver, CouponsPage.class);
	}
}
