package facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InputCount {

	@Test
	
	public void testInputCount(){
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> element = driver.findElements(By.tagName("input"));
		int i= element.size();
		System.out.println(i);
		
		driver.close();
		
		
		
	}
	
	/*public int getElementsCount(By by){
		
		List<WebElement> element = driver.findElements(by);
		return element.size();
	}*/
}
