package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenExamples {

	@Test(dataProvider="userData")
	public void sample(String userName,String password){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com");
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys(userName+Keys.ENTER);
		WebElement pwd =driver.findElement(By.id("Passwd"));
		pwd.sendKeys(password);
	}
	
	@DataProvider(name="userData")
	public Object[][] getData(){
     Object[][] obj = {{"venuarelli","1234"},{"venkatesharelly","1234"}};		
		return obj;
	}
	
}

