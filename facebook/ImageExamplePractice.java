package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImageExamplePractice {
	@Test 
	public void testImageExample(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.wpbeginner.com/beginners-guide/image-alt-text-vs-image-title-in-wordpress-whats-the-difference/");
		
		WebElement image = driver.findElement(By.xpath("(//img[contains(@title,'WPBeginner')])[2]"));
		String at = getElementAttribute(image, "title");
		String imageTitle = image.getAttribute("title");
		
		//System.out.println(imageTitle);
		String expectedTitle = "Blueprint";
		Assert.assertTrue(imageTitle.contains(expectedTitle));
		
		driver.close();
		
	}

	public String getElementAttribute(WebElement element,String attributeName){
		return element.getAttribute(attributeName);
	}
}
