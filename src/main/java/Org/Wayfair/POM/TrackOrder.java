package Org.Wayfair.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrackOrder {

	@FindBy(xpath="//span[.='Track Order']")
	private WebElement TrackorderButton;
	@FindBy(xpath="//input[@name='orderid']")
	private WebElement OrderidTextfield;
	@FindBy(xpath="//input[@name='email']")
	private WebElement Useridtextfield;
	@FindBy(xpath="//button[@name='submit']")
	private WebElement SubmitButton;
	@FindBy(xpath="//a[@title='Track order']")
	private WebElement TrackOrder;
	
	public TrackOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void tracTheOrder(String orderid, String Userid ) {
		TrackorderButton.click();
		OrderidTextfield.sendKeys(orderid);
		Useridtextfield.sendKeys(Userid);
		SubmitButton.click();
		TrackOrder.click();
	}
}
