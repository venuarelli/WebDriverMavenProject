package com.paytm.movies.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.paytm.pages.BasePage;

public class MoviesPage extends BasePage{

	public MoviesPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()='Hyderabad']")
	WebElement selectLocation;
	
	@FindBy(xpath = "//a[text()=' telugu']")
	WebElement selectTelugu;
	
	@FindBy(xpath ="//h1[text()='Top Movies This Week']")
	WebElement topMoviesText;
	
	
	public void selectLocation(){
		selectLocation.click();
		
	}
	public void selectTeluguMovies(){
	
		selectTelugu.click();
	}
	
	public String getTopMoviesText(){
		return topMoviesText.getText();
	}

}
