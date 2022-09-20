package Org.Onlineshopping.GenricUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownUtility 
{
	/**
	 * This method is used to select the dropdown options
	 * 
	 * @param element
	 * @param text
	 */
	public void Select(WebElement element, String text)
	{
		new Select(element).selectByVisibleText(text);

	}
}
