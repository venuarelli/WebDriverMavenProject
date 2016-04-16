package com.apipracticeexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.paytm.pages.BasePage;

public class MultiWindowHandling  extends BasePage{

	public MultiWindowHandling(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "(//a[@title='Facebook'])[1]")
	WebElement facebook;
	
	
	public void clickOnFacebookIcon(){
		facebook.click();
	}
	
	@FindBy(xpath = "//span[@class='social_facebook_square']")
	WebElement facebookIcon;
	
	
	
	
	public void clickOnFacebook(){
		findVisibleElement(By.xpath("//span[@class='social_facebook_square']"), 20000);
		facebookIcon.click();
	}

}
