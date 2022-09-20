package Org.Wayfair.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(xpath="//a[.='Login']")
	private WebElement LoginTabButton;

	@FindBy(xpath="//input[@name='email']")
	private WebElement EmailAddress;

	@FindBy(xpath="//input[@id='exampleInputPassword1']")
	private WebElement Password;

	@FindBy(xpath="//button[.='Login']")
	private WebElement userLoginButton;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement Adminid;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement AdminPassword;
	
	@FindBy(xpath="//button[.='Login']")
	private WebElement adminLoginButton;

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void userLoginPage(String Userid, String UserPassword){
		LoginTabButton.click();
		EmailAddress.sendKeys(Userid);
		Password.sendKeys(UserPassword);
		userLoginButton.click();
	}
	public void adminLogin(String AdminName, String Adminpassword) {
		Adminid.sendKeys(AdminName);
		AdminPassword.sendKeys(Adminpassword);
		adminLoginButton.click();
	}
}
