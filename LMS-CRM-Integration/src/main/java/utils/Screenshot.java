package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
	* Methods that handle operations related to Screenshots using Commons IO.
	*/

public class Screenshot {
	
/**
     * Takes a screenshot and saves it in a specified location with specified name. 
     *
     * @param driver 
     * the WebDriver instance being used
	 *
	 * @param screenshotSaveLocationFilePath 
	 * filepath of intended save location, name screenshot file here by adding "\\DesiredName.png" after location path
     * @throws IOException
     */
	
	public static void take(WebDriver driver, String screenshotSaveLocationFilePath) throws IOException {
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(screenshotSaveLocationFilePath));
		
	}

}
