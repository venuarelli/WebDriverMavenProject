package facebook;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLoginUsingXLSheet {

	@DataProvider(name = "FacebookData")
	public Object[][] getData() throws IOException {
		ExcelDataReader excelDataReader = new ExcelDataReader();
		Object[][] obj = excelDataReader.getSeleniumDataArray(
				"XL Data/Facebook Data.xlsx", null, true, true);

		
		return obj;
	}

	@Test(dataProvider = "FacebookData")
	public void testFacebookLogin(String name, String pass) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys(name);
		WebElement passwd = driver.findElement(By.id("pass"));
		passwd.sendKeys(pass);

	}


}	


