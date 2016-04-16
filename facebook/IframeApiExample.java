package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class IframeApiExample {
	
	@Test
	public void testIframe(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement iframe = driver.findElement(By.id("IF2"));
		
		//Explicit wait
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
		//ExpectedConditions.elementToBeClickable(By or WebElement)
		//ExpectedConditions.presenceOfAllElementsLocatedBy(locator)
		//ExpectedConditions.visibilityOfElementLocated(locator)
		
		//WebElement iframe = driver.findElement(By.id("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		
		//WebElement praticeInfoText = driver.findElement(By.xpath("//h1[contains(text(),'Practice ')]"));
		//String text = praticeInfoText.getText();
		
		 WebElement homeText = driver.findElement(By.xpath("//h1[text()='Home']"));
		 String text = homeText.getText();
		
		System.out.println("Iframe text:===="+text);
		driver.close();
	}
	
	public void switchToiFrame(WebElement element){
		WebDriver driver = null;
		driver.switchTo().frame(element);
	}

}
