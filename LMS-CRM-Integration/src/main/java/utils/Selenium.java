package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

/**
 	* Methods that handle operations related to Selenium, serve as shorthands for various Selenium syntax.
 	*/

public class Selenium {
	
	/**
	    * Executes a twenty second implicit wait.
	    *
	    * @param driver 
	    * the WebDriver instance being used 
	    */
	
	public static void implicitWaitTwentySeconds(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	

	
}