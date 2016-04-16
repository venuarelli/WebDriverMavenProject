package facebook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class LoggerExample {
	
	@Test
	
	public void testForeseegame(){
		WebDriver driver = new FirefoxDriver();
		Reporter.log("Open Java script");
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		
		//Example for Alert
		Reporter.log("find Click here element");
		driver.findElement(By.name("B2")).click();
		
		Reporter.log("Swtich to alert and click on Ok");
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		//Example for Confirm Alert.
		
		/*driver.findElement(By.name("B3")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		alert = driver.switchTo().alert();;
		alert.accept();*/
		
		//Example for Prompt Alerts.
		
		driver.findElement(By.name("B4")).click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("venu");
		alert1.accept();
		alert1 = driver.switchTo().alert();
		alert1.accept();
	}
	
	

}
