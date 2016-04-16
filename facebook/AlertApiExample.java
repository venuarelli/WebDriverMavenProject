package facebook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertApiExample {

	@Test
	public void testAlertBox(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		/*WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("//iframe[@id='iframeResult']")));
		
		WebElement iframe = driver.findElement(By.id("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		
		WebElement tryIt = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryIt.click();*/
		
		
		Alert alert = driver.switchTo().alert();
		//alert.accept();
		//alert.dismiss();
		//String text = alert.getText();
		alert.sendKeys("Venu");
	}
}
