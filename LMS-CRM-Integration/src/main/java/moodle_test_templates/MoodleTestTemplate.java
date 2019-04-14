package moodle_test_templates;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import moodle_test_resources.MoodleAuthenticationMethods;

public class MoodleTestTemplate {
	
// Test name and description that will be used through the test and report
	
	private static String testName = "Test Name";
	private static String testDescription = "enter test description here";
	
	
// Instantiates what is needed for the test components 
		
	private static WebDriver driver = new ChromeDriver();
	//private static WebDriver driver = new FirefoxDriver();
	
	static WebDriverWait wait = new WebDriverWait(driver, 10);
	
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports extent;
	static ExtentTest test; 
	

// Standard TestNG annotation structure
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	
	htmlReporter = new ExtentHtmlReporter("extent.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	test = extent.createTest(testName, testDescription);
	htmlReporter.config().setTheme(Theme.DARK);
	
	test.info("Starting "+testName);
	
	test.info("Logging in");
	MoodleAuthenticationMethods.logIn(driver);	
	test.pass("Login succesful");
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		test.info("Logging out");
		MoodleAuthenticationMethods.logOut(driver);
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
	
//Test details

	@Test
	public void test() {
		
	
		
	try {
		
		//Step
		
		test.pass("passedStepDetails");
			
			
			
		} catch (Exception e) {
			
			String failureReason = e.getMessage();
			test.fail(testName+" failed: "+failureReason);
			
			System.out.println(e.getCause());
			e.printStackTrace();
			
		}

			
		
}



	
	
	
}

