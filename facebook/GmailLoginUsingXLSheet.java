package facebook;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmailLoginUsingXLSheet {
	
	@DataProvider(name = "userData")
	public Object[][] getData() throws IOException {
		ExcelDataReader dataReader = new ExcelDataReader();
		Object[][] obj = dataReader.getSeleniumDataArray("XL Data\\Username.xlsx", null, true, true);
		return obj;
	}
	
	@Test(dataProvider="userData")
	public void testGmailLogin(String name,String pwd){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		
		WebElement userName = driver.findElement(By.id("Email"));
		userName.sendKeys(name+Keys.ENTER);
		WebElement password = driver.findElement(By.id("Passwd"));
		password.sendKeys(pwd);
		
	}

}
