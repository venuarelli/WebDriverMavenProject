package com.paytm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayTmLoginPage extends BasePage {

	public PayTmLoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Log In / Sign Up")
	WebElement loginButton;

	@FindBy(name = "username")
	WebElement userName;

	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//iframe[contains(@ng-src,'login')]")
	WebElement iframeSwitch;
	
	@FindBy(xpath = "//span[text()=' Secure Login']")
	WebElement secureLoginButton;

	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	public void setUserName(String userName){
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	public void setPassword(String password){
		this.password.clear();
		this.password.sendKeys(password);
	}
	public void SwitchToIframe(){
		
		driver.switchTo().frame(iframeSwitch);
	}
	
	public void clickOnSecureLoginButton(){
		secureLoginButton.click();
	}

}
