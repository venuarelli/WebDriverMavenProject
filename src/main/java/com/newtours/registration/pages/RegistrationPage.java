package com.newtours.registration.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.paytm.pages.BasePage;

public class RegistrationPage extends BasePage{

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "firstName")
	WebElement firstName;
	
	@FindBy (name = "lastName")
	WebElement lastName;
	
	@FindBy(name = "phone")
	WebElement phone;
	
	@FindBy (name = "userName")
	WebElement email;
	
	@FindBy (name = "address1")
	WebElement address;
	
	@FindBy (name = "city" )
	WebElement city;
	
	@FindBy(name = "state")
	WebElement state;
	
	@FindBy (name = "postalCode")
	WebElement postalCode;
	
	@FindBy (name = "country")
	WebElement country;
	
	@FindBy (name = "email")
	WebElement name;
	
	@FindBy (name = "password")
	WebElement password;
	
	@FindBy (name = "confirmPassword")
	WebElement confirmPassword;
	
	
	public void enterFirstName(String firstName){
		clearAndType(this.firstName, firstName);
	}
	
	public void enterLastName(String lastName){
          clearAndType(this.lastName, lastName);
	}
	
	public void enterPhoneNumber(double phone){
		this.phone.clear();
		this.phone.sendKeys(String.valueOf(phone));
	}
	/*public void enterPhoneNumber(String phone){
            clearAndType(this.phone, phone);		
	}*/
	
	public void enterEmail(String email){
		clearAndType(this.email, email);
	}
	
	public void enterAddress(String address){
		clearAndType(this.address, address);
	}
	
	public void enterCity(String city){
		clearAndType(this.city, city);
	}
	
	public void enterState(String state){
		clearAndType(this.state, state);
	}
	
	public void enterPostalCode(Double postalCode){
		this.postalCode.clear();
		this.postalCode.sendKeys(String.valueOf(postalCode));
	}
	
	/*public void enterPostalCode(String postalCode){
		clearAndType(this.postalCode,postalCode );
	}*/
	
	public void selectCountry(String countryName){
		selectDropDown(country, -1, null, countryName);
	}
	
	public void enterUserName(String uname){
		clearAndType(this.name,uname);
	}
	
	public void enterPassword(String password){
		clearAndType(this.password, password);
	}
	
	public void enterConfirmPassword(String cpasswoed){
		clearAndType(this.confirmPassword, cpasswoed);
	}
	
	
	public String getSelectedValue(){
		Select select = new Select(country);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		return text;
	}
}
