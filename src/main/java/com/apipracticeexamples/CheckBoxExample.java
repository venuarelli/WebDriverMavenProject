package com.apipracticeexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.paytm.pages.BasePage;

public class CheckBoxExample extends BasePage{

	public CheckBoxExample(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath = "(//input[@type='checkbox'])[1]")
	WebElement checkbox1;
	
	@FindBy (xpath = "(//input[@type='checkboxa'])[1]")
	WebElement checkbox2;
	
	@FindBy (name="B1")
	WebElement enableSubmitButton;
	
	
	@FindBy (id = "dropdown")
	WebElement dropDownList;
	
	
	public void clickCheckBox(){
		checkbox1.click();
		
	}
	
	public boolean isCheckBoxSelected(){
		boolean isSelected =  isSelected(checkbox1);
		return isSelected;
	}
	
	public boolean isDisplayed(){
		boolean isDisplayed =  isDisplayed(checkbox1);
		return isDisplayed;
	
	}
	
	public boolean isCheckBoxDisplayed(){
		boolean isDisplayed =isDisplayed(checkbox2);
		return isDisplayed;
	}
	
	
	public boolean isSubmitButtonEnabled(){
		boolean isEnabled = isEnabled(enableSubmitButton);
		return isEnabled;

		}
	 
	public void selectDropDown(int index){
		selectDropDown(dropDownList, index, null, null);
	}
	
	
	public String getSelectedValue(){
		Select select = new Select(dropDownList);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		String text = firstSelectedOption.getTagName();
		return text;
	}

}
