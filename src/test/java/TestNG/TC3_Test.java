package TestNG;

import org.testng.annotations.Test;

import Org.Onlineshopping.GenricUtility.BaseClass;
import Org.Onlineshopping.GenricUtility.ConstantPath;

public class TC3_Test extends BaseClass {
	@Test
	public void tc3_Test() {
		webdriverutility.getUrl(driver, ConstantPath.AdminUrl);
		login.adminLogin(Adminid, Adminpassword);
		createCategory.CreateCatogry();
		createCategory.CateogryTextfield(CategoryName);
		createCategory.CateogryDescription(CategoryDescription);
		createCategory.CateogrySubmitButton();
		commonpage.entriesDropDown("100");

		createsubcateogry.SubCateogry();
		createsubcateogry.CateogryDropdown(CategoryName);
		createsubcateogry.SubCateogryTextfield(subcategoryname);
		createsubcateogry.SubmitButton();
		
		inserproduct.InsertProductButton();
		createsubcateogry.CateogryDropdown(CategoryName);
		inserproduct.SubCateogryDropdown(subcategoryname);
		inserproduct.SubmitButton();
		inserproduct.ProductNameTextfield(productName);
		inserproduct.ProductcomapnyTextfield(productCompany);
		inserproduct.ActualPriceTextfield(Actualproductprice);
		inserproduct.PriceTextfield(productprice);
		inserproduct.ProductDiscriptionTextfield(productDescription);
		inserproduct.ProductShippingchargeTextfield(productShippingcharge);
		inserproduct.ProductAvailabilityDropdown("In Stock");
		inserproduct.ProductImage1(Imagepath1);
		inserproduct.ProductImage2(Imagepath2);
		inserproduct.ProductImage3(Imagepath3);
		inserproduct.InsertSubmitButton();
		logout.AdminLogout();

		webdriverutility.getUrl(driver, ConstantPath.Url);
		login.userLoginPage(Userid, UserPassword);
		commonpage.searchTextfield(productName);
		commonpage.wishList();
		commonpage.addtoCart();
		enterAddress.enterBillingAddress(billingaddress, billingstate, billingcity, billingpincode);
		enterAddress.enterShippingAddress(shippingaddress, shippingstate, shippingcity, shippingpincode);
		commonpage.checkOut();
		commonpage.payment();

	}
}
