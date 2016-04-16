package facebook;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AjaxDropBox {

	@Parameters("browser")
	@Test
	
	public void testAjaxDropBox(String browser){
		WebDriver driver = null;
		if(browser.equals("firefox")){
			driver = new FirefoxDriver();
		}else if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "binaries\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("ie")){
			System.setProperty("webdriver.ie.driver","binaries/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else{
			driver  = new HtmlUnitDriver();
		}
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "binaries\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("google");
		
		WebDriverWait  wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//*[text()=' maps']"))));
		WebElement googleMaps = driver.findElement(By.xpath("//*[text()=' maps']"));
		googleMaps.click();
		wait.until(ExpectedConditions.titleContains("maps"));
		String actualTitle  = driver.getTitle();
		String expectedTitle = "google maps - Google Search";
		Assert.assertEquals(expectedTitle, actualTitle);
		String actual =  search.getAttribute("value");
		String expected = "google maps";
		Assert.assertEquals(expected, actual);
		driver.close();
		
		
	}
	
}
