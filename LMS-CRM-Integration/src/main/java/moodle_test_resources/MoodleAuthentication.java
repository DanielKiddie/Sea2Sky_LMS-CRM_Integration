package moodle_test_resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ClickBy;
import utils.Excel;
import utils.SendKeysBy;

/**
 	* Methods to handle operations related to Moodle authentication.
	*/

public class MoodleAuthentication {

/**
     * Acquires Moodle testing profile access credentials and test server IP from an Excel file and logs into Moodle with them. 
     *
     * @param driver 
     * the WebDriver instance being used 
     */
	
public static void logIn(WebDriver driver) {
	

	
	Excel excel = new Excel("C:\\\\Users\\\\Daniel - new\\\\Desktop\\\\Access_Creds.xlsx", "Sheet1");
	
	String testUsername = excel.getStringCellData(1, 0);
	
	String testPassword = excel.getStringCellData(1, 1);
	
	String testIP = excel.getStringCellData(1, 2);

	
	//Opens Moodle
	driver.get(testIP);
	
	//Clicks Login link
	ClickBy.LinkText(driver, "Log in");
	
	ClickBy.Id(driver, "username");
	SendKeysBy.Id(driver, "username", testUsername);

	ClickBy.Id(driver, "password");
	SendKeysBy.Id(driver, "password", testPassword);

	ClickBy.Id(driver, "loginbtn");
	
	
	
}

/**
 	* Acquires Moodle test server IP from an Excel file and logs into Moodle with access credentials provided through the parameters. 
 	*
 	* @param driver 
 	* the WebDriver instance being used 
 	* 
 	* @param username 
 	* a String of the username to be used in login sequence
 	* 
 	* @param password 
 	* a String of the password to be used in login sequence
 	*/

public static void logInAsUser(WebDriver driver, String username, String password) {
	
	

	Excel excel = new Excel("C:\\\\Users\\\\Daniel - new\\\\Desktop\\\\Access_Creds.xlsx", "Sheet1");
	
	String testIP = excel.getStringCellData(1, 2);
	
	
	//Opens Moodle
	driver.get(testIP);
	
	//Clicks Login link
	ClickBy.LinkText(driver, "Log in");
	
	ClickBy.Id(driver, "username");
	SendKeysBy.Id(driver, "username", username);

	ClickBy.Id(driver, "password");
	SendKeysBy.Id(driver, "password", password);

	ClickBy.Id(driver, "loginbtn");
}

/**
 	* Logs out from Moodle. 
 	*
 	* @param driver 
 	* the WebDriver instance being used 
 	*/

public static void logOut(WebDriver driver) {
	driver.findElement(By.id("dropdown-1")).click();
	
	driver.findElement(By.linkText("Log out")).click();
}

/**
	* Waits for visibility of Site Administration tab, 
	* if visible it's clicked, if it's not the hamburger icon to open the main navigation window is clicked then the Site Administration tab is clicked. 
	*
	* @param driver 
	* the WebDriver instance being used 
	*/

public static void clickSiteAdminTabReliably(WebDriver driver) {
	
	try {
		WebDriverWait wait = new WebDriverWait(driver, 5);
				
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Site administration")));
		
		ClickBy.LinkText(driver, "Site administration");
		
	} catch (Exception e) {
		
		
		
		ClickBy.Xpath(driver, "(.//*[normalize-space(text()) and normalize-space(.)='Skip to main content'])[1]/following::i[1]");
		
		ClickBy.LinkText(driver, "Site administration");
		
		e.printStackTrace();
	}
	
}

}
