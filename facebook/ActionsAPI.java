package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ActionsAPI {
	
	@Parameters("browser")
	@Test()
	public void testActionsAPI(String browser){
		WebDriver driver=null;
		if(browser.equals("firefox")){
			driver = new FirefoxDriver();
		}else if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "binaries/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("ie")){
			System.setProperty("webdriver.ie.driver", "binaries/IEDriverServer.exe");
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		By googleAppsBy = By.xpath("//a[@title='Google apps']");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(googleAppsBy));
		
		WebElement googleApps = driver.findElement(googleAppsBy);
		googleApps.click();
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Gmail']")));
		WebElement gmail = driver.findElement(By.xpath("//span[text()='Gmail']"));
		gmail.click();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Gmail";
		Assert.assertTrue(actualTitle.contains(expectedTitle), "Title is not found");
		WebElement signIn = driver.findElement(By.linkText("Sign in"));
		if(signIn.isDisplayed()){
			signIn.click();
		}
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("venuarelli"+Keys.ENTER);
		driver.close();
	}
	
	@Test()
	public void sample(){
		Assert.assertTrue(true);
	}

}
