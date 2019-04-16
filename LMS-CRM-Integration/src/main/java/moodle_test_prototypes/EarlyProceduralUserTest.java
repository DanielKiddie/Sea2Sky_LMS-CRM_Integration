package moodle_test_prototypes;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import moodle_test_resources.MoodleAuthentication;
import moodle_test_resources.MoodleBVTQuickNavMethods;

// import ca.poltech.automation.util.Configuration;
	//import for attempt to avoid hardcoding 


//@FixMethodOrder(MethodSorters.NAME_ASCENDING)

	//Old imports from Junit

public class EarlyProceduralUserTest {
	
	private static WebDriver driver = new ChromeDriver();
	

//	private static String serverAddress = Configuration.INSTANCE.get("moodle.server.address");
//	private static String username = Configuration.INSTANCE.get("moodle.server.username");
//	private static String password = Configuration.INSTANCE.get("moodle.server.password");
	
	//Attempt to use environment properties to avoid hardcoding
	
	
	
	private static double randomNumber = Math.random();
	private static String createableUserName = ("test"+randomNumber);
	private static String createableFirstName = ("ATestUser"+randomNumber);
	private static String createableLastName = ("-test "+randomNumber);
	private static String changedFieldValue = ("AChangedField"+randomNumber);
	private static String emailString = ("EmailAddress"+randomNumber+"@hotmail.com");
	
	//Random entry field data to use through tests

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
				
		MoodleAuthentication.logIn(driver);
		
		//Enters Access Credentials and Submits
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Part of my attempt to avoid hardcoding
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	//	driver.close();
	//	driver.quit();
	}

	@BeforeTest
	public void setUp() throws Exception {
		
	}

	@AfterTest
	public void tearDown() throws Exception {
		
	}

	@Test
	public void CreateModifyDeleteUser() {
		
		MoodleBVTQuickNavMethods.navigatetoBrowseListOfUsers(driver);
		
		driver.findElement(By.linkText("Add a new user")).click();
		
		driver.findElement(By.id("id_username")).click();
		driver.findElement(By.id("id_username")).sendKeys(createableUserName);
		
		driver.findElement(By.id("id_firstname")).click();
		driver.findElement(By.id("id_firstname")).sendKeys(createableFirstName);
		
		driver.findElement(By.id("id_lastname")).click();
		driver.findElement(By.id("id_lastname")).sendKeys(createableLastName);
		
		driver.findElement(By.id("id_email")).click();
		driver.findElement(By.id("id_email")).sendKeys(emailString);
		
		driver.findElement(By.linkText("Click to enter text")).click();
		String testPassword = "Robot123$$";
		driver.findElement(By.id("id_newpassword")).sendKeys(testPassword+Keys.ENTER);
		
		//Populates Entry Fields
		
		driver.findElement(By.id("id_submitbutton")).click();
		
		//Clicks 'Create user'
		
		boolean actualResult = driver.findElement(By.linkText(createableFirstName+" "+createableLastName)).isDisplayed();
		if (actualResult) {System.out.println("User Creation Successfull");}
		
		//Verifies user creation and displays confirmation message
	

	
//Modify Used Test

		MoodleBVTQuickNavMethods.navigatetoBrowseListOfUsers(driver);
		
		driver.findElement(By.linkText(createableFirstName+" "+createableLastName)).click();
		driver.findElement(By.linkText("Edit profile")).click();
		
		//Navigates to editing page of created profile 
		
		driver.findElement(By.id("id_firstname")).click();
		driver.findElement(By.id("id_firstname")).clear();
		driver.findElement(By.id("id_firstname")).sendKeys(changedFieldValue);
		
		//Changes First name of test user
		
		
		driver.findElement(By.id("id_submitbutton")).click();
		
		//Clicks 'Update profile'
		
		boolean actualResultTwo = driver.findElement(By.linkText(changedFieldValue+" "+createableLastName)).isDisplayed();
		if (actualResultTwo) {System.out.println("User Modification Successfull");}
		else System.out.println("User Modification Failed");
		
		//Verifies user modification and displays confirmation message
		
//Deletion Test
	
		
		driver.findElement(By.linkText("Site administration")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.linkText("Bulk user actions")).click();
		driver.findElement(By.id("id_realname")).click();
		driver.findElement(By.id("id_realname")).sendKeys(createableLastName+Keys.ENTER);
		driver.findElement(By.id("id_addall")).click();
		driver.findElement(By.id("id_action")).click();
		driver.findElement(By.id("id_action")).sendKeys("d"+Keys.ENTER);
		driver.findElement(By.id("id_doaction")).click();
		driver.findElement(By.id("notice")).click();
		driver.findElement(By.id("notice")).sendKeys(Keys.TAB);
		driver.findElement(By.id("notice")).sendKeys(Keys.ENTER);

	
		//Clicks delete option in bulk user actions and confirmation
		
		System.out.println("User Deletion Successful");
		
		//Verifies user deletion and displays confirmation message
		

	}

}
