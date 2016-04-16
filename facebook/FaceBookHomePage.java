package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class FaceBookHomePage {
	
	@Parameters("browser")
	@Test
	public  void testFaceBookHomePage (String browser) {
		WebDriver driver = null;
		if(browser.equals("firefox")){
			driver = new FirefoxDriver();
		}else if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","binaries/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("ie")){
			System.setProperty("webdriver.ie.driver", "binaries/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			}else {
				driver = new HtmlUnitDriver();
			}
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		clearAndType(username, "venuarelli");
		username.sendKeys("venuarelli");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("venu.s");
		WebElement submit = driver.findElement(By.xpath("//input[@id='u_0_v']"));
		submit.click();
		
		driver.close();
		
		
		
		
	}
	
	public static void clearAndType(WebElement element,String text){
		element.clear();
		element.sendKeys(text);
	}

}
