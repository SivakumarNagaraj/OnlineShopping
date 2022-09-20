package TestNG;

import org.testng.annotations.Test;

import Org.Onlineshopping.GenricUtility.WebDriverUtility;

public class FetchTheDataFromCMDTest {

	@Test
	public void cmd() {
		String browser=System.getProperty("brow");
		String url=System.getProperty("Url");
		System.out.println(browser);
		System.out.println(url);
		WebDriverUtility webDriverUtility=new WebDriverUtility();
		webDriverUtility.openTheBrowserWithApplications(browser, 10, url);
	}
}
