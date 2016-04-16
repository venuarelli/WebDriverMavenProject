package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Paytm {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://paytm.com/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement prepaid = driver.findElement(By.xpath("//md-radio-button[@value='prepaid']"));
		prepaid.click();
		WebElement number = driver.findElement(By.xpath("//input[@id='input_4']"));
		number.sendKeys("9550172285");
		 driver.findElement(By.xpath("//input[@id='input_5']")).click();
		 WebElement operator = driver.findElement(By.xpath("//span[text()='Airtel']"));
		 operator.click();
		 WebElement amount = driver.findElement(By.xpath("//input[@id='input_7']"));
		 amount.sendKeys("100");
		 driver.findElement(By.xpath("//*[text()='Proceed to Recharge']")).click();
		 
		 WebElement coupon = driver.findElement(By.xpath("//*[text()='Coupons']"));
		 String actual = coupon.getText();
		 String expected  = "Coupons";
		 Assert.assertEquals(actual, expected);
		
		
	}

}
