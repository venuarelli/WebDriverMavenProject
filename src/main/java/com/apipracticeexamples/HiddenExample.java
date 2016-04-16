package com.apipracticeexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.paytm.tests.BaseTest;

public class HiddenExample extends BaseTest{

	@Test
	public void testHiddenExample(){
		driver.navigate().to("http://www.echoecho.com/htmlforms07.htm"); 
		
	/*	JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("document.getElementsByName('Language')[0].style.display='block';");
		WebElement element = driver.findElement(By.name("Language"));
		element.sendKeys("Telugu");
		String value = element.getAttribute("value");*/
		
		 WebElement elementToSelect = driver.findElement(By.name("Language"));
	        // making drop down visible
	        ((JavascriptExecutor) this.driver).executeScript("arguments[0].style.display='block';",
	                elementToSelect);
	        WebElement element = driver.findElement(By.name("Language"));
			String value = element.getAttribute("value");
	}
}
