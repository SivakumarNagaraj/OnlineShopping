package Org.Wayfair.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterAddress {

	@FindBy(xpath="//textarea[@name='billingaddress']")
	private WebElement BillingaddressTextfield;

	@FindBy(xpath="//input[@name='bilingstate']")
	private WebElement BillingStateTextfield;

	@FindBy(xpath="//input[@name='billingcity']")
	private WebElement BillingcityTextfield;

	@FindBy(xpath="//input[@id='billingpincode']")
	private WebElement BillingpincodeTextfield;

	@FindBy(xpath="//textarea[@name='shippingaddress']")
	private WebElement ShippingaddressTextfield;

	@FindBy(xpath="//input[@name='shippingstate']")
	private WebElement ShippingstateTextfield;

	@FindBy(xpath="//input[@name='shippingcity']")
	private WebElement ShippingcityTextfield;

	@FindBy(xpath="//input[@id='shippingpincode']")
	private WebElement ShippingpincodeTextfield;

	public EnterAddress(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterBillingAddress(String billingaddress,String billingstate,String billingcity,String billingpincode) {
		BillingaddressTextfield.sendKeys(billingaddress);
		BillingStateTextfield.sendKeys(billingstate);
		BillingcityTextfield.sendKeys(billingcity);
		BillingpincodeTextfield.sendKeys(billingpincode);
	}
	public void enterShippingAddress(String shippingaddress,String shippingstate,String shippingcity,String shippingpincode) {	
		ShippingaddressTextfield.sendKeys(shippingaddress);
		ShippingstateTextfield.sendKeys(shippingstate);
		ShippingcityTextfield.sendKeys(shippingcity);
		ShippingpincodeTextfield.sendKeys(shippingpincode);	
	}
}
