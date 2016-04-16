package facebook;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowsSwitchExample {

	
	@Test
	public void testSwitchWindowExmaple(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/");
		
		String mainWindow = driver.getWindowHandle();
		WebElement rssFeed = driver.findElement(By.xpath("//a[contains(@href,'feed')]"));
		rssFeed.click();
		//String firstWindowTitle = driver.getTitle();
		Set<String> windows = driver.getWindowHandles();
		
		// First way
		
		/*String firstWindow = null;
		String secondWindow = null;
		Iterator<String> it = windows.iterator();
		while(it.hasNext()){
			firstWindow = it.next();
			secondWindow = it.next();
		}
		driver.switchTo().window(secondWindow);*/
		
		// second way
		
		/*for(String s : windows){
			if(!mainWindow.equals(s)){
				driver.switchTo().window(s);
			}
		}
		*/
		for(String s:windows){
			driver.switchTo().window(s);
		}
		
		String title = driver.getTitle();
		System.out.println("Title is:  "+title);
		
		driver.close();
		
		driver.switchTo().window(mainWindow);

		title = driver.getTitle();
		System.out.println("Title is:  "+title);
		
		driver.close();
	}
	
}
