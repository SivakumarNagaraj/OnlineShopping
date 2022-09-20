package Org.Onlineshopping.GenricUtility;

import org.openqa.selenium.WebDriver;

public class PopupUtility {
	/**
	 * This method is used to handle Alert Popup.
	 * 
	 * @param driver
	 */
	public void AlartPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
}
