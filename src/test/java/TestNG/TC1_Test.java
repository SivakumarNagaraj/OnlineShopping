package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import Org.Onlineshopping.GenricUtility.BaseClass;

public class TC1_Test extends BaseClass {
	@Test
	public void tc1_Test() {
		// Fetch the data from Excel

		commonpage.searchTextfield(searchproduct);
		commonpage.wishList();
		commonpage.addtoCart();
		enterAddress.enterBillingAddress(billingaddress, billingstate, billingcity, billingpincode);
		enterAddress.enterShippingAddress(shippingaddress, shippingstate, shippingcity, shippingpincode);
		commonpage.checkOut();
		commonpage.payment();
		String text = commonpage.ProductNameText();
		System.out.println(text);
		// Assert.assertEquals(searchproduct, text);
		Assert.assertTrue(text.contains(searchproduct));
	}
}
