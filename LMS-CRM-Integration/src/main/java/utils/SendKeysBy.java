package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendKeysBy {
	

		

	
	public static void Id(WebDriver driver, String id, String keysToSend) {
		
		driver.findElement(By.id(id)).click();
		driver.findElement(By.id(id)).clear();
		driver.findElement(By.id(id)).sendKeys(keysToSend);
		
	}
	
	
	
	public static void ClassName(WebDriver driver, String className, String keysToSend) {
		
		driver.findElement(By.className(className)).click();
		driver.findElement(By.className(className)).clear();
		driver.findElement(By.className(className)).sendKeys(keysToSend);
		
	}
	
	
	
	public static void CssSelector(WebDriver driver, String cssSelector, String keysToSend) {
		
		driver.findElement(By.cssSelector(cssSelector)).click();
		driver.findElement(By.cssSelector(cssSelector)).clear();
		driver.findElement(By.cssSelector(cssSelector)).sendKeys(keysToSend);
		
	}
	
	
	
	public static void LinkText(WebDriver driver, String linkText, String keysToSend) {
		
		driver.findElement(By.linkText(linkText)).click();
		driver.findElement(By.linkText(linkText)).clear();
		driver.findElement(By.linkText(linkText)).sendKeys(keysToSend);
		
	}
	
	
	
	public static void Xpath(WebDriver driver, String xpathExpression, String keysToSend) {
		
		driver.findElement(By.xpath(xpathExpression)).click();
		driver.findElement(By.xpath(xpathExpression)).clear();
		driver.findElement(By.xpath(xpathExpression)).sendKeys(keysToSend);
		
	}
	

	
	public static void PartialLinkText(WebDriver driver, String partialLinkText, String keysToSend) {
		
		driver.findElement(By.partialLinkText(partialLinkText)).click();
		driver.findElement(By.partialLinkText(partialLinkText)).clear();
		driver.findElement(By.partialLinkText(partialLinkText)).sendKeys(keysToSend);
		
	}
	

	
	public static void TagName(WebDriver driver, String tagName, String keysToSend) {
		
		driver.findElement(By.tagName(tagName)).click();
		driver.findElement(By.tagName(tagName)).clear();
		driver.findElement(By.tagName(tagName)).sendKeys(keysToSend);
		
	}

	

	
	public static void Name(WebDriver driver, String name, String keysToSend) {
		
		driver.findElement(By.name(name)).click();
		driver.findElement(By.name(name)).clear();
		driver.findElement(By.name(name)).sendKeys(keysToSend);
		
	}
	
	
	
	
	
}
