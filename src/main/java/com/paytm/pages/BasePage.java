package com.paytm.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public static final int MAX_TIMEOUT = 30;

	public WebDriver driver;
	
	public BasePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void clearAndType(WebElement element, String text){
		element.clear();
		element.sendKeys(text);
	}
	
	public void implicityWait(int seconds){
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	public void findVisibleElement(By by,int seconds){
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public void findClickableElement(By by,int seconds){
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		 wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	public void findClickableElement(WebElement element,int seconds){
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		 wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void selectDropDown(WebElement element,int index,String value,String visibleText){
		Select select = new Select(element);
		if(index>=0){
			select.selectByIndex(index);
		}else if(value!=null){
			select.selectByValue(value);
		}else if(visibleText!=null){
			select.selectByVisibleText(visibleText);
		}
	}
	
	public void moveToElement(WebElement element){
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	
	public void switchToFrame(WebElement element){
		driver.switchTo().frame(element);
	}
	
	public void switchToAlert(boolean isAccept){
		Alert alert = driver.switchTo().alert();
		if(isAccept){
			alert.accept();
		}else{
			alert.dismiss();
		}
	}
	
	public void switchToWindow(String windowName){
		driver.switchTo().window(windowName);
		
	}
	
	public String getText(WebElement element){
		String text = element.getText();
		return text;
	}
	public String getAttribute(WebElement element,String attribute){
		String text = element.getAttribute(attribute);
		return text;
	}
	
	public String getTitle(){
      String title =  driver.getTitle();
     return title;
	}
	
	public String getCurrentURL(){
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public void takeScreenShot(){
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:/Eclipse/WebDriver/Screenshots/"+file.getName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isDisplayed(WebElement element){
		boolean isDisplayed = false;
		try{
			isDisplayed = element.isDisplayed();
		}catch(Exception e){
		}
		return isDisplayed;
	}
	
	public boolean isDisplayed(By by){
		boolean isDisplayed = false;
		try{
			findVisibleElement(by, MAX_TIMEOUT);
			isDisplayed = driver.findElement(by).isDisplayed();
		}catch(Exception e){
		}
		return isDisplayed;
	}
	
	
	public boolean isEnabled(WebElement element){
		boolean isEnabled =  element.isEnabled();
		return isEnabled;
	}
	public boolean isSelected(WebElement element){
		boolean isSelected = element.isSelected();
		return isSelected;
	}
	
	 public void scrollToBottom(WebDriver driver) {
	        ((JavascriptExecutor) driver)
	                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    }
	
	 public void waitForSeconds(int sec){
		 
		 try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
}
