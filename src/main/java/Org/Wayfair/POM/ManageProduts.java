package Org.Wayfair.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageProduts {
	
	@FindBy(xpath = "//a[.='Manage Products ']")
	private WebElement ManageProductButton;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement SearchTextfield;
	
	@FindBy(xpath="//table//tbody/tr/td[last()]//i[@class='icon-edit']")
	private WebElement ProductEditButton;
	
	@FindBy(xpath = "//input[@name='productShippingcharge']")
	private WebElement productShippingchargeTextField;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement SubmitButton;
	
	@FindBy(xpath=" //a[.=' Toys']")
	private WebElement CategotyTab;
	
	@FindBy(xpath="//a[.='New Model Cars']")
	private WebElement ClickTheProduct;
	
	@FindBy(xpath = "//div[@class='product-info']/div[@class='stock-container info-container m-t-10'][last()]//div[@class='col-sm-9']//span")
	private WebElement GetTheText;
	
	//@FindBy(xpath="")
	public ManageProduts(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ManageProductButton() {
		ManageProductButton.click();
	}
	public void SearchTextfield(String text) {
		SearchTextfield.sendKeys(text);
	}
	public void ProductEditButton() {
		ProductEditButton.click();
	}
	public void productShippingchargeTextField(String text) {
		productShippingchargeTextField.clear();
		productShippingchargeTextField.sendKeys(text);
	}
	public void SubmitButton() {
		SubmitButton.click();
	}
	public void CategotyTab() {
		CategotyTab.click();
	}
	public void ClickTheProduct() {
		ClickTheProduct.click();
	}
	public String GetTheText() {
		String value = GetTheText.getText();
		return value;
	}
}
