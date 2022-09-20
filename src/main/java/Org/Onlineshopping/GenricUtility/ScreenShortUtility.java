package Org.Onlineshopping.GenricUtility;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShortUtility {

	/**
	 * This method is used to take a screenshoot for failed testcases
	 * 
	 */
	public void ScreenShort(WebDriver driver, JavaUtility javaUtility, String classname) {
		
		String currenttime = javaUtility.CurrentTime();
		TakesScreenshot takeScreenshot=(TakesScreenshot)driver;
		File src = takeScreenshot.getScreenshotAs(OutputType.FILE);
		File dst = new File("./ScreenShort/"+classname+"_"+currenttime+".png");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
