package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImageExample {

	@Test
	public void testImage(){
		WebDriver driver  =  new FirefoxDriver();
		driver.get("http://www.wpbeginner.com/beginners-guide/image-alt-text-vs-image-title-in-wordpress-whats-the-difference/");
		
		WebElement image = driver.findElement( By.xpath("//img[contains(@alt,'Image Alt Text')]"));
		String imageTitle = image.getAttribute("title");
		String expectedImageTitle = "What’s the Difference?";
		Assert.assertTrue(imageTitle.contains(expectedImageTitle));
		driver.close();
	}
}
