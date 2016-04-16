package com.paytm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.paytm.bustickets.page.BusTicketsPage;
import com.paytm.datacard.page.DataCardPage;
import com.paytm.dthpage.DthRechargePage;
import com.paytm.landline.page.LandLinePage;
import com.paytm.movies.page.MoviesPage;


public class PayTmHeadersPage extends BasePage{

	public PayTmHeadersPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText="DTH")
	WebElement dthHeader;
	
	public DthRechargePage clickOnDTH(){
		dthHeader.click();
		return PageFactory.initElements(driver, DthRechargePage.class);
	}
	
	 @FindBy(xpath = "//a[text()='Movies']")
	 WebElement moviesHeader;
	 
	 public MoviesPage clickOnMovies(){
		 moviesHeader.click();
		 return PageFactory.initElements(driver, MoviesPage.class);
	 }
	 
	 @FindBy(linkText = "DataCard")
	 WebElement dataCardHeader;
	 
	public DataCardPage clickOnDataCard(){
		dataCardHeader.click();
	return PageFactory.initElements(driver, DataCardPage.class)	;
	}
	
	@FindBy(linkText = "Hotels")
	WebElement hotelsHeader;
	
	public void clickOnHotels(){
		hotelsHeader.click();
		
	}
	
	@FindBy(linkText = "Bus Tickets")
	WebElement busTicketsHeadder;
	
	public BusTicketsPage clickOnBusTicketsHeader(){
		busTicketsHeadder.click();
		return PageFactory.initElements(driver, BusTicketsPage.class);
	}
	
	@FindBy(linkText ="Landline")
	WebElement landLineHeader;
	
	public LandLinePage clickOnLandLineHeader(){
		landLineHeader.click();
		return PageFactory.initElements(driver, LandLinePage.class);
	}
}
