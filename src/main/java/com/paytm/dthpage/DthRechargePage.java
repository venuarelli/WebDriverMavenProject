package com.paytm.dthpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.paytm.pages.BasePage;
import com.paytm.pages.mobile.CouponsPage;

public class DthRechargePage extends BasePage {
	
	@FindBy(name="operatorDDL")
	WebElement selectOperator;
	
	@FindBy(xpath="//*[text()='Airtel Digital TV']")
	WebElement selectOperatorDropDown;
	
	@FindBy(name="dthNumber")
	WebElement customerId;
	
	@FindBy(xpath="//input[@ng-model='amount']")
	WebElement enterAmount;
	
	@FindBy(xpath="//span[text()='Fast Forward It']")
	WebElement fastForward;
	
	@FindBy(xpath="//span[text()='Proceed to Recharge']")
	WebElement proceedToRecharge;
	

	public DthRechargePage(WebDriver driver) {
		super(driver);
	}
	
	public void selectOperator(){
		selectOperator.click();
		selectOperatorDropDown.click();
	}
	
	public void setCustomerId(String custID){
		this.customerId.clear();
		this.customerId.sendKeys(custID);
	}
	
	public void setAmount(String amount){
		this.enterAmount.clear();
		this.enterAmount.sendKeys(amount);
	}
	
	public void clickOnFastForwardRecharge(){
		fastForward.click();
	}
	
	public CouponsPage clickProceedToRecharge(){
		proceedToRecharge.click();
		return PageFactory.initElements(driver, CouponsPage.class);
	}
	
	
	
	@FindBy (xpath = "//div[contains(text(),'provider')]")
	WebElement operatorErrorMessage;
	
	@FindBy(xpath = "//div[contains(text(),'Recharge amount')]")
	WebElement rechargeAmountErrorMessage;
	
	public String operatorErrorMessage(){
		return operatorErrorMessage.getText();
	}
	
	public String rechargeAmountErrorMessage(){
		return  rechargeAmountErrorMessage.getText();
	}
}
