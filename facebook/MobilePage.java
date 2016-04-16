package facebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobilePage {
	
	/**
	 * Web element for enter mobile number.
	 */
	@FindBy(id="number")
	WebElement enterMobileNumber;
	
	@FindBy(xpath="")
	WebElement submitButton;
	
	public void setMobileNumber(String mobileNumber){
		enterMobileNumber.clear();
		enterMobileNumber.sendKeys(mobileNumber);
	}

	public void clickButton(){
		submitButton.click();
	}
	
}
