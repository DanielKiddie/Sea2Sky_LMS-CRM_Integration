package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
	* A set of custom methods that serve as a shorthand notation for the Selenium syntax that finds, clicks on, clears and populates an entry field with the standard selectors, one made for each selector.
	*/

public class SendKeysBy {
	
	/**
	    * Finds, clicks and populates an entry field by Id.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param id 
	    * the Id of the desired entry field as a String
	    *  
	    * @param keysToSend
	    * the keys to be entered into selected entry field as a String
	    */
	
	public static void Id(WebDriver driver, String id, String keysToSend) {
		
		driver.findElement(By.id(id)).click();
		driver.findElement(By.id(id)).clear();
		driver.findElement(By.id(id)).sendKeys(keysToSend);
		
	}
	
	/**
	    * Finds, clicks and populates an entry field by ClassName.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param className 
	    *  the ClassName of the desired entry field as a String
	    *  
	    * @param keysToSend
	    * the keys to be entered into selected entry field as a String
	    */
	
	public static void ClassName(WebDriver driver, String className, String keysToSend) {
		
		driver.findElement(By.className(className)).click();
		driver.findElement(By.className(className)).clear();
		driver.findElement(By.className(className)).sendKeys(keysToSend);
		
	}
	
	/**
	    * Finds, clicks and populates an entry field by CssSelector.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param cssSelector 
	    *  the CssSelector of the desired entry field as a String
	    *   
	    * @param keysToSend
	    * the keys to be entered into selected entry field as a String
	    */
	
	public static void CssSelector(WebDriver driver, String cssSelector, String keysToSend) {
		
		driver.findElement(By.cssSelector(cssSelector)).click();
		driver.findElement(By.cssSelector(cssSelector)).clear();
		driver.findElement(By.cssSelector(cssSelector)).sendKeys(keysToSend);
		
	}
	
	/**
	    * Finds, clicks and populates an entry field by LinkText.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param linkText 
	    *  the LinkText of the desired entry field as a String
	    *    
	    * @param keysToSend
	    * the keys to be entered into selected entry field as a String
	    */
	
	public static void LinkText(WebDriver driver, String linkText, String keysToSend) {
		
		driver.findElement(By.linkText(linkText)).click();
		driver.findElement(By.linkText(linkText)).clear();
		driver.findElement(By.linkText(linkText)).sendKeys(keysToSend);
		
	}
	
	/**
	    * Finds, clicks and populates an entry field by Xpath.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param xpathExpression 
	    *  the Xpath Expression of the desired entry field as a String
	    *    
	    * @param keysToSend
	    * the keys to be entered into selected entry field as a String
	    */
	
	public static void Xpath(WebDriver driver, String xpathExpression, String keysToSend) {
		
		driver.findElement(By.xpath(xpathExpression)).click();
		driver.findElement(By.xpath(xpathExpression)).clear();
		driver.findElement(By.xpath(xpathExpression)).sendKeys(keysToSend);
		
	}
	
	/**
	    * Finds, clicks and populates an entry field by PartialLinkText.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param partialLinkText 
	    *  the PartialLinkText of the desired entry field as a String
	    *    
	    * @param keysToSend
	    * the keys to be entered into selected entry field as a String
	    */
	
	public static void PartialLinkText(WebDriver driver, String partialLinkText, String keysToSend) {
		
		driver.findElement(By.partialLinkText(partialLinkText)).click();
		driver.findElement(By.partialLinkText(partialLinkText)).clear();
		driver.findElement(By.partialLinkText(partialLinkText)).sendKeys(keysToSend);
		
	}
	
	/**
	    * Finds, clicks and populates an entry field by TagName.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param tagName 
	    *  the TagName of the desired entry field as a String
	    *    
	    * @param keysToSend
	    * the keys to be entered into selected entry field as a String
	    */
	
	public static void TagName(WebDriver driver, String tagName, String keysToSend) {
		
		driver.findElement(By.tagName(tagName)).click();
		driver.findElement(By.tagName(tagName)).clear();
		driver.findElement(By.tagName(tagName)).sendKeys(keysToSend);
		
	}

	/**
	    * Finds, clicks and populates an entry field by Name.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param name 
	    *  the Name of the desired entry field as a String
	    *    
	    * @param keysToSend
	    * the keys to be entered into selected entry field as a String
	    */

	public static void Name(WebDriver driver, String name, String keysToSend) {
		
		driver.findElement(By.name(name)).click();
		driver.findElement(By.name(name)).clear();
		driver.findElement(By.name(name)).sendKeys(keysToSend);
		
	}
	
	
	
	
	
}
