package com.paytm.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "binaries/chromedriver.exe");
		 driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
}
