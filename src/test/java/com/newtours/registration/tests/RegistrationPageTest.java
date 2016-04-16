package com.newtours.registration.tests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.newtours.registration.pages.RegistrationPage;
import com.paytm.tests.BaseTest;
import com.paytm.tests.ExcelDataReader;



public class RegistrationPageTest extends BaseTest {
	
	
	@DataProvider(name = "LogInDetails")
	
	public Object[][] getData() throws IOException{ 
		ExcelDataReader dataReader = new ExcelDataReader();
		Object [][] obj = dataReader.getSeleniumDataArray("XL Data/XLDataForLogin.xlsx", null, true, true);
		return obj;
	}
	
	
	@Test(dataProvider = "LogInDetails" )
	public void testRegistrationPage(String firstName,String lastName,Double phone,String email,String address,String city,String state,Double postalCode,String country,String name,String password,String confirmPassword){ 
		driver.navigate().to("http://newtours.demoaut.com/mercuryregister.php?osCsid=28f04b5292d9ec707ac1ebe5d97de626");
		RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
		
		 registrationPage.enterFirstName(firstName);
		 registrationPage.enterLastName(lastName);
		 registrationPage.enterPhoneNumber(phone);
		 registrationPage.enterEmail(email);
		 registrationPage.enterAddress(address);
		 registrationPage.enterCity(city);
		 registrationPage.enterState(state);
		 registrationPage.enterPostalCode(postalCode);
		 registrationPage.selectCountry(country);
		 registrationPage.enterUserName(name);
		 registrationPage.enterPassword(password);
		 registrationPage.enterConfirmPassword(confirmPassword);
		 
	}

}
