package com.apipracticeexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.paytm.pages.BasePage;

public class JqueryUIMenus extends BasePage{

	public JqueryUIMenus(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()='Enabled']")
	WebElement enabled;

	@FindBy(xpath ="//a[text()='Downloads']")
	WebElement downloads;
	
	@FindBy(xpath ="//a[text()='PDF']")
	WebElement pdf;
	
	public void clickOnEnabled(){
		enabled.click();
	}
	public void clickOnDownloads(){
		downloads.click();
	}
	public void clickOnPdf(){
		pdf.click();
	}
}

