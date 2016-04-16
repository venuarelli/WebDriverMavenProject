package facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TableExample {

	@Test
	public void testTable(){
		WebDriver driver  = new FirefoxDriver();
		driver.get("http://www.w3schools.com/html/html_tables.asp");
		
		//preceding-sibling::tr --- before rows
		// following rows ---- after rows
		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='w3-table-all']//following-sibling::tr"));
		for(WebElement element : tableRows){
			
			List<WebElement> tableCols = element.findElements(By.xpath("td"));
			for(WebElement col : tableCols){
				System.out.print(col.getText()+"---");
			}
			System.out.println();
		}
		driver.close();
	}
}
