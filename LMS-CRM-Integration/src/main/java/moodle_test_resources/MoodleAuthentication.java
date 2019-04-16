package moodle_test_resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ClickBy;
import utils.SendKeysBy;

public class MoodleAuthentication {
	
	
public static void logIn(WebDriver driver) {
	

	final String testUsername = "testingbot";
	final String testPassword = "Testingbot123$$";

	
	//Opens Moodle
	driver.get("http://18.224.103.219/");
	
	//Clicks Login link
	ClickBy.LinkText(driver, "Log in");
	
	ClickBy.Id(driver, "username");
	SendKeysBy.Id(driver, "username", testUsername);

	ClickBy.Id(driver, "password");
	SendKeysBy.Id(driver, "password", testPassword);

	ClickBy.Id(driver, "loginbtn");
	
	
	
}

public static void logInAsUser(WebDriver driver, String username, String password) {
	
	
	//Opens Moodle
	driver.get("http://18.224.103.219/");
	
	//Clicks Login link
	ClickBy.LinkText(driver, "Log in");
	
	ClickBy.Id(driver, "username");
	SendKeysBy.Id(driver, "username", username);

	ClickBy.Id(driver, "password");
	SendKeysBy.Id(driver, "password", password);

	ClickBy.Id(driver, "loginbtn");
}

public static void logOut(WebDriver driver) {
	driver.findElement(By.id("dropdown-1")).click();
	
	driver.findElement(By.linkText("Log out")).click();
}

public static void clickSiteAdminTabReliably(WebDriver driver) {
	
	try {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Site administration")));
		
		ClickBy.LinkText(driver, "Site administration");
		
	} catch (Exception e) {
		
		
		
		ClickBy.Xpath(driver, "(.//*[normalize-space(text()) and normalize-space(.)='Skip to main content'])[1]/following::i[1]");
		
		ClickBy.LinkText(driver, "Site administration");
		
		e.printStackTrace();
	}
	
}

}
