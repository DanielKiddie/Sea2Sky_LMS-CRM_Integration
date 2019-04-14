package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckIfDisplayedBy {
	

	
		
	public static boolean Id(WebDriver driver, String id) {
		
		return driver.findElement(By.id(id)).isDisplayed();
		
	}
	

	
	public static boolean ClassName(WebDriver driver, String className) {
		
		return driver.findElement(By.className(className)).isDisplayed();
		
	}
	

	
	public static boolean CssSelector(WebDriver driver, String cssSelector) {
		
		return driver.findElement(By.cssSelector(cssSelector)).isDisplayed();
		
	}
	

	
	public static boolean LinkText(WebDriver driver, String linkText) {
		
		return driver.findElement(By.linkText(linkText)).isDisplayed();
		
	}
	

	
	public static boolean Xpath(WebDriver driver, String xpathExpression) {
		
		return driver.findElement(By.xpath(xpathExpression)).isDisplayed();
		
	}
	

	
	public static boolean PartialLinkText(WebDriver driver, String partialLinkText) {
		
		return driver.findElement(By.partialLinkText(partialLinkText)).isDisplayed();
		
	}
	

	
	public static boolean TagName(WebDriver driver, String tagName) {
		
		return driver.findElement(By.tagName(tagName)).isDisplayed();
		
	}
	


	
	public static boolean Name(WebDriver driver, String name) {
		
		return driver.findElement(By.name(name)).isDisplayed();
		
	}
	

	
	
	
	
	
}
