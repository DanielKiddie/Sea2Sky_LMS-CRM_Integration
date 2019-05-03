package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 	* A set of custom methods that serve as a shorthand notation for the Selenium syntax that finds and clicks on a Web Element with the standard selectors, one made for each selector.
 	*/

public class ClickBy {
	

   /**
    	* Finds and clicks a Web Element by Id.
    	*
    	* @param driver 
    	* the WebDriver instance being used 
    	* 
    	* @param id 
    	*  the Id of the desired Web Element as a String
    	*/
		
	public static void Id(WebDriver driver, String id) {
		
		driver.findElement(By.id(id)).click();
		
	}
	
	/**
	    * Finds and clicks a Web Element by ClassName.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param className 
	    *  the ClassName of the desired Web Element as a String
	    */
	
	public static void ClassName(WebDriver driver, String className) {
		
		driver.findElement(By.className(className)).click();
		
	}
	
	/**
	    * Finds and clicks a Web Element by CssSelector.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param cssSelector 
	    *  the CssSelector of the desired Web Element as a String
	    */
	
	public static void CssSelector(WebDriver driver, String cssSelector) {
		
		driver.findElement(By.cssSelector(cssSelector)).click();
		
	}
	
	/**
	    * Finds and clicks a Web Element by LinkText.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param linkText 
	    *  the LinkText of the desired Web Element as a String
	    */
	
	public static void LinkText(WebDriver driver, String linkText) {
		
		driver.findElement(By.linkText(linkText)).click();
		
	}
	
	/**
	    * Finds and clicks a Web Element by Xpath.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param xpathExpression 
	    *  the Xpath Expression of the desired Web Element as a String
	    */
	
	public static void Xpath(WebDriver driver, String xpathExpression) {
		
		driver.findElement(By.xpath(xpathExpression)).click();
		
	}
	
	/**
	    * Finds and clicks a Web Element by PartialLinkText.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param partialLinkText 
	    *  the PartialLinkText of the desired Web Element as a String
	    */
	
	public static void PartialLinkText(WebDriver driver, String partialLinkText) {
		
		driver.findElement(By.partialLinkText(partialLinkText)).click();
		
	}
	
	/**
	    * Finds and clicks a Web Element by TagName.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param tagName 
	    *  the TagName of the desired Web Element as a String
	    */
	
	public static void TagName(WebDriver driver, String tagName) {
		
		driver.findElement(By.tagName(tagName)).click();
		
	}
	
	/**
	    * Finds and clicks a Web Element by Name.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    * 
	    * @param name 
	    *  the Name of the desired Web Element as a String
	    */
	
	public static void Name(WebDriver driver, String name) {
		
		driver.findElement(By.name(name)).click();
		
	}
	

	

	
	
	
	
	
}
