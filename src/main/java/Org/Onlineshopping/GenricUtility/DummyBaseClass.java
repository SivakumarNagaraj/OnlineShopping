package Org.Onlineshopping.GenricUtility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DummyBaseClass {
	WebDriverUtility wdu;
//	Hi this Siva
	WebDriver driver;
	@BeforeMethod
	public void open()
	{
		 wdu=new WebDriverUtility();
		driver=wdu.selectBrowser("chrome");
	}

	@AfterMethod
	public void close()
	{
		wdu.closeTheBrowser(driver);
	}
}
