package Org.Wayfair.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCategory {

	@FindBy(xpath="//a[text()=' Create Category ']")
	private WebElement CreateCatogryButton;

	@FindBy(name="category")
	private WebElement CatogryTextfield;

	@FindBy(name="description")
	private WebElement CatogryDescription;

	@FindBy(name="submit")
	private WebElement SubmitButton;

	WebDriver driver;
	public CreateCategory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void CreateCatogry() {
		CreateCatogryButton.click();
	}
	public void CateogryTextfield(String CategoryName) {
		CatogryTextfield.sendKeys(CategoryName);
	}
	public void CateogryDescription(String CategoryDescription) {
		CatogryDescription.sendKeys(CategoryDescription);
	}
	public void CateogrySubmitButton() {
		SubmitButton.click();
	}
}
