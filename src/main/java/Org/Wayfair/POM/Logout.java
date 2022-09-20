package Org.Wayfair.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	@FindBy(xpath="//a[.='Logout']")
	private WebElement LogoutTab;
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement adminLogoutTab;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement adminLogoutButton;
	
	public Logout(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void userlogoutButton() {
		LogoutTab.click();
	}
	public void AdminLogout() {
		adminLogoutTab.click();
		adminLogoutButton.click();
	}
}
