package com.apipracticeexamples.tests;

import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apipracticeexamples.MultiWindowHandling;
import com.paytm.tests.BaseTest;

public class MultiWindowHandlingTest extends BaseTest {
	
	@Test
	
	public void testMultiWindowHandling(){
		driver.navigate().to("http://toolsqa.com/");
		MultiWindowHandling handling = PageFactory.initElements(driver, MultiWindowHandling.class);
		handling.clickOnFacebookIcon();
		String mainWindow = driver.getWindowHandle();
		Set<String>windows = driver.getWindowHandles();
		for(String s : windows){
			driver.switchTo().window(s);
		}
		String title = driver.getTitle();
		System.out.println("Title is :"+title);
		driver.close();
		
		driver.switchTo().window(mainWindow);
		
		String mainWindowTitle = driver.getTitle();
		System.out.println("Title is :"+mainWindowTitle);
		driver.close();
	}
	
	@Test
	public void testInnovapath(){
		driver.navigate().to("http://innova-path.com/");
		
		MultiWindowHandling multiWindowHandling = PageFactory.initElements(driver, MultiWindowHandling.class);
		multiWindowHandling.waitForSeconds(10);
		
		multiWindowHandling.scrollToBottom(driver);
		multiWindowHandling.clickOnFacebook();
		
		String mainWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for(String s : windows){
			driver.switchTo().window(s);
		}
		String text = driver.getTitle();
		System.out.println("Title is : " +text);
		Assert.assertTrue(true);
		driver.close();
		
		driver.switchTo().window(mainWindow);
		
		String title = driver.getTitle();
		System.out.println("Title is : " +title);
		Assert.assertTrue(true);
		driver.close();
	}

	
}
