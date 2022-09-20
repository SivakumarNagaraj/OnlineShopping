package Org.Onlineshopping.GenricUtility;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SwitchWindowUtility 
{    
	/**
	 * This method is used to switch the control one browser to another browser
	 * 
	 * @param driver
	 */


	public void SwichWindow(WebDriver driver)
	{
		Set<String> childbrowser=driver.getWindowHandles();
			for (String id : childbrowser) 
			{
				driver.switchTo().window(id);
			}
	}
	/**
	 * This mothod is used to get back the control into parent browser
	 * 
	 * @param driver
	 * @param WindowId
	 */
	public void ParentWnidow(WebDriver driver, String WindowId) {
		driver.switchTo().window(WindowId);

	}
}
