package facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TableExample1 {
	
	@Test
	
	public void testTableExample(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tedmontgomery.com/tutorial/tblxmpls.html");
		
		List<WebElement> tableRows = driver.findElements(By.xpath("(//table)[6]/tbody//following-sibling::tr"));
		
		for(WebElement element : tableRows){
			
			List<WebElement> tablecolms = element.findElements(By.xpath("td"));
			for(WebElement colomn : tablecolms){
				System.out.println("--"+colomn.getText());
				
			}
			System.out.println();
		}
		
			
		
		
	}

}
