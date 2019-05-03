package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
	* A set of custom methods that serve as a shorthand notation for the Selenium syntax that checks if a Web Element if displayed with the standard selectors, one made for each selector.
	*/

public class CheckIfDisplayedBy {
	

    /**
     * Checks if Web Element is displayed by ID.
     *
     * @param driver 
     * the WebDriver instance being used 
     * 
     * @param id 
     *  the ID of the desired Web Element as a String
     * 
     * @return boolean 
     * true if element is displayed, false if it is not
     */
		
	public static boolean Id(WebDriver driver, String id) {

		return driver.findElement(By.id(id)).isDisplayed();
		
	}
	
    /**
     * Checks if Web Element is displayed by Class Name.
     *
     * @param driver 
     * the WebDriver instance being used 
     * 
     * @param className 
     *  the Class Name of the desired Web Element as a String
     * 
     * @return boolean 
     * true if element is displayed, false if it is not
     */
	
	public static boolean ClassName(WebDriver driver, String className) {
		
		return driver.findElement(By.className(className)).isDisplayed();
		
	}
	
    /**
     * Checks if Web Element is displayed by CssSelector.
     *
     * @param driver 
     * the WebDriver instance being used 
     * 
     * @param cssSelector 
     *  the CssSelector of the desired Web Element as a String
     * 
     * @return boolean 
     * true if element is displayed, false if it is not
     */
	
	public static boolean CssSelector(WebDriver driver, String cssSelector) {
		
		return driver.findElement(By.cssSelector(cssSelector)).isDisplayed();
		
	}
	
    /**
     * Checks if Web Element is displayed by LinkText.
     *
     * @param driver 
     * the WebDriver instance being used 
     * 
     * @param linkText 
     *  the LinkText of the desired Web Element as a String
     * 
     * @return boolean 
     * true if element is displayed, false if it is not
     */
	
	public static boolean LinkText(WebDriver driver, String linkText) {
		
		return driver.findElement(By.linkText(linkText)).isDisplayed();
		
	}
	
    /**
     * Checks if Web Element is displayed by Xpath.
     *
     * @param driver 
     * the WebDriver instance being used 
     * 
     * @param xpathExpression 
     *  the Xpath of the desired Web Element as a String
     * 
     * @return boolean 
     * true if element is displayed, false if it is not
     */
	
	public static boolean Xpath(WebDriver driver, String xpathExpression) {
		
		return driver.findElement(By.xpath(xpathExpression)).isDisplayed();
		
	}
	
    /**
     * Checks if Web Element is displayed by PartialLinkText.
     *
     * @param driver 
     * the WebDriver instance being used 
     * 
     * @param partialLinkText 
     *  the PartialLinkText of the desired Web Element as a String
     * 
     * @return boolean 
     * true if element is displayed, false if it is not
     */
	
	public static boolean PartialLinkText(WebDriver driver, String partialLinkText) {
		
		return driver.findElement(By.partialLinkText(partialLinkText)).isDisplayed();
		
	}
	
    /**
     * Checks if Web Element is displayed by TagName.
     *
     * @param driver 
     * the WebDriver instance being used 
     * 
     * @param tagName 
     *  the TagName of the desired Web Element as a String
     * 
     * @return boolean 
     * true if element is displayed, false if it is not
     */
	
	public static boolean TagName(WebDriver driver, String tagName) {
		
		return driver.findElement(By.tagName(tagName)).isDisplayed();
		
	}
	
    /**
     * Checks if Web Element is displayed by Name.
     *
     * @param driver 
     * the WebDriver instance being used 
     * 
     * @param name 
     *  the Name of the desired Web Element as a String
     * 
     * @return boolean 
     * true if element is displayed, false if it is not
     */

	
	public static boolean Name(WebDriver driver, String name) {
		
		return driver.findElement(By.name(name)).isDisplayed();
		
	}
	

	
	
	
	
	
}
