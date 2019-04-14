package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForClickableElementBy {
	

	
	public static void Id(WebDriver driver, String id) {
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
		
	}
	

	
	public static void ClassName(WebDriver driver, String className) {
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.className(className)));
		
	}
	

	
	public static void CssSelector(WebDriver driver, String CssSelector) {
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(CssSelector)));
		
	}
	

	
	public static void LinkText(WebDriver driver, String linkText) {
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText(linkText)));		
	}
	

	
	public static void Xpath(WebDriver driver, String xpathExpression) {
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression)));		
	}
	

	
	public static void PartialLinkText(WebDriver driver, String partialLinkText) {
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(partialLinkText)));		
	}
	

	
	public static void TagName(WebDriver driver, String tagName) {
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.tagName(tagName)));		
	}
	


	
	public static void Name(WebDriver driver, String name) {
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.name(name)));		
	}

}
