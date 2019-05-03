package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
	* A set of custom methods that serve as a shorthand notation for the Selenium syntax that waits for a clickable Web Element with the standard selectors, one made for each selector.
	*/

public class WaitForClickableElementBy {
	
	/**
	 	* Waits five seconds for a clickable Web Element by Id.
	 	*
	 	* @param driver 
	 	* the WebDriver instance being used 
	 	* 
	 	* @param id 
	 	*  the Id of the desired Web Element as a String
	 	*/
	
	public static void Id(WebDriver driver, String id) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
		
	}
	
	/**
	    * Waits five seconds for a clickable Web Element by ClassName.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param className 
	    *  the ClassName of the desired Web Element as a String
	    */
	
	public static void ClassName(WebDriver driver, String className) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.className(className)));
		
	}
	
	/**
	    * Waits five seconds for a clickable Web Element by CssSelector.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param cssSelector 
	    *  the CssSelector of the desired Web Element as a String
	    */
	
	public static void CssSelector(WebDriver driver, String cssSelector) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssSelector)));
		
	}
	
	/**
	    * Waits five seconds for a clickable Web Element by LinkText.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param linkText 
	    *  the LinkText of the desired Web Element as a String
	    */
	
	public static void LinkText(WebDriver driver, String linkText) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText(linkText)));		
	}
	
	/**
	    * Waits five seconds for a clickable Web Element by Xpath.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param xpathExpression 
	    *  the Xpath Expression of the desired Web Element as a String
	    */
	
	public static void Xpath(WebDriver driver, String xpathExpression) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression)));		
	}
	
	/**
	    * Waits five seconds for a clickable Web Element by PartialLinkText.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param partialLinkText 
	    *  the PartialLinkText of the desired Web Element as a String
	    */
	
	public static void PartialLinkText(WebDriver driver, String partialLinkText) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(partialLinkText)));		
	}
	
	/**
	    * Waits five seconds for a clickable Web Element by TagName.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param tagName 
	    *  the TagName of the desired Web Element as a String
	    */
	
	public static void TagName(WebDriver driver, String tagName) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.tagName(tagName)));		
	}
	
	/**
	    * Waits five seconds for a clickable Web Element by Name.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param name 
	    *  the Name of the desired Web Element as a String
	    */
	
	public static void Name(WebDriver driver, String name) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.name(name)));		
	}

}
