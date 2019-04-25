package moodle_tests;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import moodle_test_resources.MoodleAuthentication;
import utils.CheckIfDisplayedBy;
import utils.ClickBy;
import utils.Screenshot;
import utils.SendKeysBy;

public class UserCrudTests {
	
	// Test report details and screenshot save location
	
			private static String testName = "Moodle User CRUD Tests";
			private static String testDescription = "Runs Create, Read, Update, and Delete tests on Moodle User component";
			private static String screenshotSaveLocationFilePath = "C:\\Users\\Daniel - new\\Desktop\\Poludo Institute\\Personal Github Repos 2019 onward\\Sea2Sky_LMS-CRM_Integration\\LMS-CRM-Integration\\\\User_CRUD_Fail.png";
			
			
	// Test specific Strings
			
			private static String creatableUserName = "smithalfred";
			private static String creatableFirstName = "Alfred";
			private static String creatableSurname = "Smith";
			private static String creatablePassword = "Alfred123$$";
			private static String creatableEmailAddress = "SmithAlfred@gmail.com";
			private static String creatableSecondEmail = "AltSmithAlfred@hotmail.com";

			
	// Instantiates what is needed for the test components 
				
			private static WebDriver driver = new ChromeDriver();
			//private static WebDriver driver = new FirefoxDriver();
			
			
			static ExtentHtmlReporter htmlReporter;
			static ExtentReports extent;
			static ExtentTest test;  
		

// Standard TestNG annotation structure
		
		@BeforeSuite
		public static void setUpBeforeClass() throws Exception {
			
			
			htmlReporter = new ExtentHtmlReporter("extent.html");
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			test = extent.createTest(testName, testDescription);
			htmlReporter.config().setTheme(Theme.DARK);
			
			test.info("Starting "+testName);
			
			test.info("Logging in");
			MoodleAuthentication.logIn(driver);	
			test.pass("Login succesful");
		
		
		}

		@AfterSuite
public static void tearDownAfterClass() throws Exception {
			
			test.info("Logging out");
			MoodleAuthentication.logOut(driver);
			test.pass("Logout successful");
			
			
			driver.close();
			test.pass("Browser closed");
			test.pass(testName+" complete");

			
			extent.flush();
			driver.quit();
			
		}

		@BeforeTest
		public void setUp() throws Exception {
		}

		@AfterTest
		public void tearDown() throws Exception {
		}
		
//Create User Test

		@Test(groups={"Create"}, priority= 1)
		public void createUser() throws IOException {
			
			test.info("Starting Create Test");
			
		
			
		try {
			
MoodleAuthentication.clickSiteAdminTabReliably(driver);
			
			
			ClickBy.LinkText(driver, "Users");
			ClickBy.LinkText(driver, "Add a new user");
			test.info("Navigated to Add New User");
			
			ClickBy.LinkText(driver, "Click to enter text");
			ClickBy.Id(driver, "id_newpassword");
			SendKeysBy.Id(driver, "id_newpassword", creatablePassword+Keys.ENTER);
			SendKeysBy.Id(driver, "id_username", creatableUserName);
			SendKeysBy.Id(driver, "id_firstname", creatableFirstName);
			SendKeysBy.Id(driver, "id_lastname", creatableSurname);
			SendKeysBy.Id(driver, "id_email", creatableEmailAddress);
			test.info("User Entry Fields populated");
			
			
			ClickBy.Id(driver, "id_submitbutton");
			test.info("Submit button clicked");
			test.info("User Created: "+creatableFirstName+" "+creatableSurname);
					
				
			test.pass("Create Test complete");	
			
		} catch (Exception e) {
			
			String failureReason = e.getMessage();
			test.fail(testName+" failed: "+failureReason);
			
			System.out.println(e.getCause());
			e.printStackTrace();
			
		}
	}
		

		@Test(groups={"Read"}, priority= 2)
		public void readUser() {
				
			test.info("Starting Read Test");
			
				
		try {	
		
			
			ClickBy.LinkText(driver, "Site administration");
			ClickBy.LinkText(driver, "Users");
			ClickBy.LinkText(driver, "Browse list of users");
			test.info("Navigated to Browse List of Users");
			
			ClickBy.LinkText(driver, creatableFirstName+" "+creatableSurname);
			test.info("Created User found and profile selected");
			
			
			if (CheckIfDisplayedBy.LinkText(driver, creatableEmailAddress)) {
			test.pass("User First Name, Surname and Email Address saved to account"); }
			
			MoodleAuthentication.logOut(driver);
			MoodleAuthentication.logInAsUser(driver, creatableUserName, creatablePassword);
			
			
			MoodleAuthentication.logOut(driver);
			test.pass("Login and Logout from User account successful");
			
			
			MoodleAuthentication.logIn(driver);
				
				
			test.pass("Read Test complete");
			
		} catch (Exception e) {
				
				String failureReason = e.getMessage();
				test.fail(testName+" failed: "+failureReason);
				
				System.out.println(e.getCause());
				e.printStackTrace();
				
			}
		}
		
			@Test(groups={"Update"}, priority= 3)
			public void updateUser() {
				
				test.info("Starting Update Test");
			
				
		try {		
		
			
			ClickBy.LinkText(driver, "Site administration");
			ClickBy.LinkText(driver, "Users");
			ClickBy.LinkText(driver, "Browse list of users");
			test.info("Navigated to Browse List of Users");
			
			ClickBy.LinkText(driver, creatableFirstName+" "+creatableSurname);
			test.info("Created User found and profile selected");
			
			ClickBy.LinkText(driver, "Edit profile");
			test.info("Edit profile button clicked");
			
			SendKeysBy.Id(driver, "id_email", creatableSecondEmail);
			ClickBy.Id(driver, "id_submitbutton");
			test.info("User Email updated and submit button clicked");
			
			ClickBy.LinkText(driver, creatableFirstName+" "+creatableSurname);
			ClickBy.LinkText(driver, creatableSecondEmail);
			if (CheckIfDisplayedBy.LinkText(driver, creatableSecondEmail)) {
			test.pass("Updated Email Saved to User Account"); }
				
				
			test.pass("Update Test complete");	
		} catch (Exception e) {
			
			String failureReason = e.getMessage();
			test.fail(testName+" failed: "+failureReason);
			
			System.out.println(e.getCause());
			e.printStackTrace();
			
		}
	}
			
			@Test(groups={"Delete"}, priority= 4)
			public void deleteUser() throws IOException {
				
				test.info("Starting Delete Test");
			
				
		try {	
			
		
			
			ClickBy.LinkText(driver, "Site administration");
			ClickBy.LinkText(driver, "Users");
			ClickBy.LinkText(driver, "Browse list of users");
			test.info("Navigated to Browse List of Users");
			
			ClickBy.Id(driver, "id_realname");
			SendKeysBy.Id(driver, "id_realname", creatableFirstName+" "+creatableSurname);
			ClickBy.Id(driver, "id_addfilter");
			
			ClickBy.Xpath(driver, "/html/body/div[1]/div[2]/div/div/section[1]/div/div[1]/table/tbody/tr/td[6]/a[1]/i");
			ClickBy.Xpath(driver, "(.//*[normalize-space(text()) and normalize-space(.)='Confirm'])[1]/following::button[1]");
			test.info("Created User deleted");
				
				
			test.pass("Delete Test complete");			
			
		
		
		} catch (Exception e) {
				
			
				//Auto-screenshot on failure
				Screenshot.take(driver, screenshotSaveLocationFilePath);
				
			
				String failureReason = e.getMessage();
				test.fail(testName+" failed: "+failureReason);
				
				System.out.println(e.getCause());
				e.printStackTrace();
				
			}
		
	
	

		}
		
}
