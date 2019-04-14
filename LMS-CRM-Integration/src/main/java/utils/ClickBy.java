package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickBy {
	

	
		
	public static void Id(WebDriver driver, String id) {
		
		driver.findElement(By.id(id)).click();
		
	}
	

	
	public static void ClassName(WebDriver driver, String className) {
		
		driver.findElement(By.className(className)).click();
		
	}
	

	
	public static void CssSelector(WebDriver driver, String cssSelector) {
		
		driver.findElement(By.cssSelector(cssSelector)).click();
		
	}
	

	
	public static void LinkText(WebDriver driver, String linkText) {
		
		driver.findElement(By.linkText(linkText)).click();
		
	}
	

	
	public static void Xpath(WebDriver driver, String xpathExpression) {
		
		driver.findElement(By.xpath(xpathExpression)).click();
		
	}
	

	
	public static void PartialLinkText(WebDriver driver, String partialLinkText) {
		
		driver.findElement(By.partialLinkText(partialLinkText)).click();
		
	}
	

	
	public static void TagName(WebDriver driver, String tagName) {
		
		driver.findElement(By.tagName(tagName)).click();
		
	}
	


	
	public static void Name(WebDriver driver, String name) {
		
		driver.findElement(By.name(name)).click();
		
	}
	

	

	
	
	
	
	
}
