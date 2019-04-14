package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverMethods {
	
	public static void implicitWaitTwentySeconds(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
		
/*	public static void clickElementById(WebDriver driver, String id) {
		
		driver.findElement(By.id(id)).click();
		
	}
	
	public static void sendKeysById(WebDriver driver, String id, String keysToSend) {
		
		driver.findElement(By.id(id)).click();
		driver.findElement(By.id(id)).clear();
		driver.findElement(By.id(id)).sendKeys(keysToSend);
		
	}
	
	public static void clickElementByClassName(WebDriver driver, String className) {
		
		driver.findElement(By.className(className)).click();
		
	}
	
	public static void sendKeysByClassName(WebDriver driver, String className, String keysToSend) {
		
		driver.findElement(By.className(className)).click();
		driver.findElement(By.className(className)).clear();
		driver.findElement(By.className(className)).sendKeys(keysToSend);
		
	}
	
	public static void clickElementByCssSelector(WebDriver driver, String selector) {
		
		driver.findElement(By.cssSelector(selector)).click();
		
	}
	
	public static void sendKeysByCssSelector(WebDriver driver, String selector, String keysToSend) {
		
		driver.findElement(By.cssSelector(selector)).click();
		driver.findElement(By.cssSelector(selector)).clear();
		driver.findElement(By.cssSelector(selector)).sendKeys(keysToSend);
		
	}
	
	public static void clickElementByLinkText(WebDriver driver, String linkText) {
		
		driver.findElement(By.linkText(linkText)).click();
		
	}
	
	public static void sendKeysByLinkText(WebDriver driver, String linkText, String keysToSend) {
		
		driver.findElement(By.linkText(linkText)).click();
		driver.findElement(By.linkText(linkText)).clear();
		driver.findElement(By.linkText(linkText)).sendKeys(keysToSend);
		
	}
	
	public static void clickElementByXpath(WebDriver driver, String xpathExpression) {
		
		driver.findElement(By.xpath(xpathExpression)).click();
		
	}
	
	public static void sendKeysByXpath(WebDriver driver, String xpathExpression, String keysToSend) {
		
		driver.findElement(By.xpath(xpathExpression)).click();
		driver.findElement(By.xpath(xpathExpression)).clear();
		driver.findElement(By.xpath(xpathExpression)).sendKeys(keysToSend);
		
	}
	
	public static void clickElementByPartialLinkText(WebDriver driver, String linkText) {
		
		driver.findElement(By.partialLinkText(linkText)).click();
		
	}
	
	public static void sendKeysByPartialLinkText(WebDriver driver, String linkText, String keysToSend) {
		
		driver.findElement(By.partialLinkText(linkText)).click();
		driver.findElement(By.partialLinkText(linkText)).clear();
		driver.findElement(By.partialLinkText(linkText)).sendKeys(keysToSend);
		
	}
	
	public static void clickElementByTagName(WebDriver driver, String name) {
		
		driver.findElement(By.tagName(name)).click();
		
	}
	
	public static void sendKeysByTagName(WebDriver driver, String name, String keysToSend) {
		
		driver.findElement(By.tagName(name)).click();
		driver.findElement(By.tagName(name)).clear();
		driver.findElement(By.tagName(name)).sendKeys(keysToSend);
		
	}

	
	public static void clickElementByName(WebDriver driver, String name) {
		
		driver.findElement(By.name(name)).click();
		
	}
	
	public static void sendKeysByName(WebDriver driver, String name, String keysToSend) {
		
		driver.findElement(By.name(name)).click();
		driver.findElement(By.name(name)).clear();
		driver.findElement(By.name(name)).sendKeys(keysToSend);
		
	}
	
	*/
	
	
	
}
