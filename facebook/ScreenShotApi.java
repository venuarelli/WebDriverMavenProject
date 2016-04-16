package facebook;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScreenShotApi {

	@Test
	public void testSwitchWindowExmaple(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/");
		
	takeScreenShot();
		driver.close();
	}
	
	public void takeScreenShot(){
		
		WebDriver driver = null;
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:\\Eclipse\\WebDriver\\Screenshots\\"+file.getName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
