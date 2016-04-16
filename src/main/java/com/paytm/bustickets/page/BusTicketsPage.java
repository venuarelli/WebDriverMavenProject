package com.paytm.bustickets.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.paytm.pages.BasePage;
import com.paytm.pages.SelectBuses;

public class BusTicketsPage extends BasePage{

	public BusTicketsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath = "//input[@ng-model='startLocation']")
	WebElement origin;
	
	@FindBy(xpath = "//input[@ng-model='destinationLocation']")
	WebElement destination;
	
	@FindBy(xpath = "//input[@ng-model='dateTravel']")
	WebElement selectDate;
	
	@FindBy (xpath = "(//div[text()='1'])[1]")
	WebElement dateDropDown;
	
	@FindBy (xpath = "//md-select[@ng-model='numberPassengers']")//  Aditional XPath--"//md-select[contains(@ng-model,'numberPassengers')]"
	WebElement seatesRequired;
	
	@FindBy (xpath = "//span[text()='1']")
	WebElement seatesRequiredDropDown;
	
	
	@FindBy (xpath = "//span[text()='Search Buses']")  
	WebElement searchBuses;
	
	
	public void setOrigin(String origin){
		this.origin.clear();
		this.origin.sendKeys(origin);
	}
	public void setDestination(String destination){
		this.destination.clear();
		this.destination.sendKeys(destination);
	}
	public void selectDate(){
		selectDate.click();
	}
	public void selectDateDropDown(){
		dateDropDown.click();
	}
	public void seatesRequired(){
		seatesRequired.click();
	}
	public void seatesRequiredDropDown(){
		seatesRequiredDropDown.click();
	}
	public SelectBuses searchBusesButton(){
		searchBuses.click();
		return PageFactory.initElements(driver, SelectBuses.class);
	}
	

}
