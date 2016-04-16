package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YoutubePage {
	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.xpath("//input[@id='masthead-search-term']"));
		search.sendKeys("Funny videos");
		WebElement searchButton = driver.findElement(By.xpath("//button[@id='search-btn']"));
		searchButton.click();
				
		
	}

}
