package Org.Wayfair.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Org.Onlineshopping.GenricUtility.DropdownUtility;

public class CommonPage 
{	
	// Declaration
	
	@FindBy(xpath="//h2[.='Shopping Portal']")
	private WebElement Applogo;
	
	@FindBy(xpath="//input[@class='search-field']")
	private WebElement SearchTextfield;
	
	@FindBy(xpath="//button[@name='search']")
	private WebElement SearchButton;
	
	@FindBy(xpath="//a[@title='Wishlist']")
	private WebElement WishlistIcon;
	
	@FindBy(xpath="//a[.='Add to cart']")
	private WebElement AddtocartButton;
	
	@FindBy(xpath="//i[@class='icon fa fa-shopping-cart']")
	private WebElement CartTabButton;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement CheckBox;
	
	@FindBy(xpath="//i[@class='fa fa-heart']")
	private WebElement ProductDeatialsWislist;
	
	
	
	@FindBy(xpath="//button[@name='ordersubmit']")
	private WebElement ProceedtoCheckout;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement Payment;
	
	@FindBy(xpath = "//table/tbody/tr[last()]/td[3]")
	private WebElement ProductName;
	//
	@FindBy(xpath="//i[@class='icon-chevron-down pull-right']")
	private WebElement OrderManagement;
	
	@FindBy(xpath="//a[@href='todays-orders.php']")
	private WebElement TodaysOrder;
	
	@FindBy(xpath="//a[@href='pending-orders.php']")
	private WebElement PendingOrder;
	//Entrydropdown
	@FindBy(xpath="//select[@name='DataTables_Table_0_length']")
	private WebElement EntriesDropdown;
	//
	@FindBy(xpath="//table[@id='DataTables_Table_0']/tbody/tr[last()]/td[last()]/a")
	private WebElement EditAction;
	//Oder Id
	@FindBy(xpath="//table//tr[2]/td[2]")
	private WebElement OderId;
	//Statusdropdown
	@FindBy(xpath="//select[@name='status']")
	private WebElement StatusDropdown;
	//
	@FindBy(xpath="//textarea[@name='remark']")
	private WebElement Description;
	
	@FindBy(xpath="//input[@value='update']")
	private WebElement update;
	//
	@FindBy(xpath="//tbody//tr[last()-2]/td[2]")
	private WebElement InprogressStatus;
	
	@FindBy(xpath = "//tbody//tr[last()-3]/td[2]")
	private WebElement DeliverStatus;
	//
	@FindBy(xpath="//select[@name='category']")
	private WebElement catogryDropdown;
	
	DropdownUtility dropdown;
	public CommonPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void searchTextfield(String value) {
		Applogo.click();
		SearchTextfield.click();
		SearchTextfield.sendKeys(value);
		SearchButton.click();
	}
	public void wishList() {
		WishlistIcon.click();
	}
	public void addtoCart() {
		AddtocartButton.click();
		CartTabButton.click();
		CheckBox.click();
	}
	
	public void checkOut() {
		ProceedtoCheckout.click();
	}
	public void payment() {
		Payment.click();
	}
	public void oderManagementDropDown() {
		OrderManagement.click();
	}
	public void todaysOrder() {
		TodaysOrder.click();
	}
	public void pendingOrder() {
		PendingOrder.click();
	}
	public void entriesDropDown(String text) {
		dropdown = new DropdownUtility();
		dropdown.Select(EntriesDropdown, text);
	}
	public void statusDropdown(String text) {
		dropdown.Select(StatusDropdown,text);
	}
	public void catogryDropdown(String text) {
		dropdown.Select(catogryDropdown, text);
	}
	public void EditAction() {
		EditAction.click();
	}
	public String getOrderId() {
	String orderid=OderId.getText();
	return orderid;
	}
	public void addDiscription(String discription) {
		Description.sendKeys(discription);
	}
	public void updateButton() {
		update.click();
	}
	public String InprogressorderStatus() {
		String status = InprogressStatus.getText();
		return status;
	}	
	public String DeliverStatusorderStatus() {
		String status = DeliverStatus.getText();
		return status;
	}
	public void ProductDeatialsWislist() {
		ProductDeatialsWislist.click();
	}
	public String ProductNameText() {
		String productname = ProductName.getText();
		return productname;
	}
	
}
