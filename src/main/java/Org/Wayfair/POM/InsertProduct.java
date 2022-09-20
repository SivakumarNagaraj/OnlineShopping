package Org.Wayfair.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Org.Onlineshopping.GenricUtility.DropdownUtility;

public class InsertProduct {

	@FindBy(xpath = "//a[text()='Insert Product ']")
	private WebElement InsertProductButton;
	
	@FindBy(id = "subcategory")
	private WebElement SubCateogryDropdown;
	
	@FindBy(name="submit")
	private WebElement SubmitButton;
	
	@FindBy(xpath = "//input[@name='productName']")
	private WebElement ProductNameTextfield;
	
	@FindBy(xpath = "//input[@name='productCompany']")
	private WebElement ProductcomapnyTextfield;
	
	@FindBy(xpath="//input[@name='productpricebd']")
	private WebElement ActualPriceTextfield;
	
	@FindBy(xpath = "//input[@name='productprice']")
	private WebElement PriceTextfield;
	
	@FindBy(xpath="//textarea[@name='productDescription']")
	private WebElement ProductDiscriptionTextfield;
	
	@FindBy(xpath = "//input[@name='productShippingcharge']")
	private WebElement ProductShippingchargeTextfield;
	
	@FindBy(xpath="//select[@name='productAvailability']")
	private WebElement ProductAvailabilityDropdown;
	
	@FindBy(xpath = "//input[@id='productimage1']")
	private WebElement ProductImage1;
	
	@FindBy(xpath = "//input[@name='productimage2']")
	private WebElement ProductImage2;
	
	@FindBy(xpath = "//input[@name='productimage3']")
	private WebElement ProductImage3;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement InsertSubmitButton;
	
	WebElement driver;
	DropdownUtility dropdownUtility;
	
	public InsertProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void InsertProductButton() {
		InsertProductButton.click();
	}
	public void SubCateogryDropdown(String text) {
		 dropdownUtility=new DropdownUtility();
		 dropdownUtility.Select(SubCateogryDropdown, text);
	}
	public void SubmitButton() {
		SubmitButton.click();
	}
	public void ProductNameTextfield(String text) {
		ProductNameTextfield.sendKeys(text);
	}
	public void ProductcomapnyTextfield(String text) {
		ProductcomapnyTextfield.sendKeys(text);
	}
	public void ActualPriceTextfield(String text) {
		ActualPriceTextfield.sendKeys(text);
	}
	public void PriceTextfield(String text) {
		PriceTextfield.sendKeys(text);
	}
	public void ProductDiscriptionTextfield(String text) {
		ProductDiscriptionTextfield.sendKeys(text);
	}
	public void ProductShippingchargeTextfield(String text) {
		ProductShippingchargeTextfield.sendKeys(text);
	}
	public void ProductAvailabilityDropdown(String text) {
		dropdownUtility.Select(ProductAvailabilityDropdown, text);
	}
	public void ProductImage1(String path) {
		ProductImage1.sendKeys(path);
	}
	public void ProductImage2(String path) {
		ProductImage2.sendKeys(path);
	}
	public void ProductImage3(String path) {
		ProductImage3.sendKeys(path);
	}
	public void InsertSubmitButton() {
		InsertSubmitButton.click();
	}
}
