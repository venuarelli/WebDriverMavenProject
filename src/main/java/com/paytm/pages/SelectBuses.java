package com.paytm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectBuses extends BasePage {

	public SelectBuses(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Search")
	WebElement searchText;
	
	public String selectBusesPage(){
		return searchText.getText();
		
		 
		
	}
	
	

}
