package Org.Onlineshopping.GenricUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility 
{	/**
	* This method is used to select the browser
	*
	*
	*/
	WebDriver driver;

	public WebDriver selectBrowser(String browser)
	{
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			break;

		default:
			System.out.println("Please enter the browser");
			break;
		}
		return driver;
	}
	/**
	 * This method is used to maximize the browser
	 * 
	 * @param driver
	 */
	public WebDriver maximizeTheBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
		return driver;
	}
	/**
	 * This method is used to minimize the browser
	 * 
	 * @param driver
	 */
	public void minimizeTheBrowser(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	/**
	 * 
	 * @param driver
	 * @param longTimeOut
	 */
	public void implicitwait(WebDriver driver, Long longTimeOut)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(longTimeOut));
	}
	/**
	 * This method is used to lanuch the url
	 * 
	 * @param driver
	 * @param url
	 */
	public void getUrl(WebDriver driver, String url)
	{
		driver.get(url);
	}
	/**
	 * This method is used to opent the application
	 * @return 
	 * 
	 */
	public WebDriver openTheBrowserWithApplications(String browser, long longTimeOuts, String url)
	{
		WebDriver driver=selectBrowser(browser);
		maximizeTheBrowser(driver);
		implicitwait(driver, longTimeOuts);
		getUrl(driver, url);
		return driver;
	}
	/**
	 * This method is used to close the browser
	 * @param driver
	 */
	public void closeTheBrowser(WebDriver driver)
	{
		driver.quit();
	}
	/**
	 * This method is used to close the window
	 * 
	 */
	public void closeTheWindow(WebDriver driver)
	{
		driver.close();
	}
	/**
	 * This methos is used to get the window Address
	 * @param driver
	 * @return 
	 */
	public String getWindowAddress(WebDriver driver) {
		String Id = driver.getWindowHandle();
		return Id;
	}
	/**
	 * This methos is used to get the all window Address
	 * @param driver
	 */
	public void getAllWindowAddress(WebDriver driver) {
		driver.getWindowHandles();
	}
	/**
	 * This method is used to validate the testcase
	 * 
	 */
	public void VerifyTheData() {
		
	}
}
