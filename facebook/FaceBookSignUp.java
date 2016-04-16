package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSignUp {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("mohan");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("raju");
		WebElement emailAddress = driver.findElement(By.name("reg_email__"));
		emailAddress.sendKeys("9676941090");
		WebElement reenter = driver.findElement(By.name("reg_email_confirmation__"));
		reenter.sendKeys("9676941090");
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("bokudanivi");
		Select daySelect = new Select(driver.findElement(By.id("day")));
		daySelect.selectByVisibleText("25");
		
		selectDropDownByVisibleText(driver.findElement(By.id("month")), "May");
		
		Select monthSelect = new Select(driver.findElement(By.id("month")));
		monthSelect.selectByVisibleText("May");
		
		Select yearSelect = new Select(driver.findElement(By.id("year")));
		yearSelect.selectByVisibleText("1990");
		
		WebElement sex = driver.findElement(By.xpath("//label[text()='Male']"));
		sex.click();
		WebElement createAnAccount = driver.findElement(By.name("websubmit"));
		createAnAccount.click();
		
		
	}
	
	public static void selectDropDownByVisibleText(WebElement element,String text){
		Select daySelect = new Select(element);
		daySelect.selectByVisibleText(text);
	}

	public static void selectDropDownByValue(WebElement element,String value){
		Select monthSelect = new Select(element);
		monthSelect.selectByValue(value);
	}
	
	public static void selectDropDownByIndex(WebElement element,int index){
		Select yearSelect = new Select(element);
		yearSelect.selectByIndex(index);
	}
}
