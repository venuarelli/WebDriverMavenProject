package com.paytm.landline.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.paytm.pages.BasePage;
import com.paytm.pages.mobile.CouponsPage;

public class LandLinePage extends BasePage{

	public LandLinePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (name = "operatorDDL")
	WebElement operator;
	
	@FindBy(xpath = "//*[text()='Airtel Landline']")
	WebElement operatorDropDown;
	
	@FindBy (xpath = "//input[@ng-model='ctrl.config[field.config_key]']")
	WebElement numberWithSTDCode;
	
	@FindBy(name = "amount")
	WebElement amount;
	
	@FindBy(xpath = "//span[text()='Proceed to Bill Pay']")
	WebElement proceedToBillPay;
	
	@FindBy(xpath = "//div[contains(@ng-show,'operatorError')]")
	WebElement errorMessage;
	
	public void seceltOperator(){
		operator.click();
	}
	public void selectoperatorDropDown(){
		operatorDropDown.click();
	}
	public void enterNumberWithSTDCode(String number){
		numberWithSTDCode.clear();
		numberWithSTDCode.sendKeys(number);
	}
	public void enterAmount(String amount){
		this.amount.clear();
		this.amount.sendKeys(amount);
	}
	public CouponsPage clickProceedToBillPayButton(){
		proceedToBillPay.click();
		return PageFactory.initElements(driver, CouponsPage.class);
	}
	public String errorMessage(){
		return errorMessage.getText();
		
	}
	

}
