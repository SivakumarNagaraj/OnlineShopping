package Org.Wayfair.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Org.Onlineshopping.GenricUtility.DropdownUtility;

public class CreateSubCateogry {

	@FindBy(xpath="//a[text()='Sub Category ']")
	private WebElement SubCateogryButton;

	@FindBy(xpath ="//select[@name='category']")
	private WebElement CateogryDropdown;

	@FindBy(xpath="//input[@name='subcategory']")
	private WebElement SubCateogryTextfield;

	@FindBy(name="submit")
	private WebElement SubmitButton;

	WebDriver driver;
	DropdownUtility dropdownUtility;
	public CreateSubCateogry(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void SubCateogry() {
		SubCateogryButton.click();
	}
	public void CateogryDropdown(String text) {
		dropdownUtility=new DropdownUtility();
		dropdownUtility.Select(CateogryDropdown, text);
	}
	public void SubCateogryTextfield(String text) {
		SubCateogryTextfield.sendKeys(text);
	}
	public void SubmitButton() {
		SubmitButton.click();
	}
}
