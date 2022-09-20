package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import Org.Onlineshopping.GenricUtility.BaseClass;
import Org.Onlineshopping.GenricUtility.ConstantPath;

public class TC4_Test extends BaseClass{

	@Test
	public void tc4_Test() {
		webdriverutility.getUrl(driver, ConstantPath.AdminUrl);
		login.adminLogin(Adminid, Adminpassword);
		manageProduts.ManageProductButton();
		manageProduts.SearchTextfield(productName);
		manageProduts.ProductEditButton();		
		manageProduts.productShippingchargeTextField(UpdatedproductShippingcharge);
		manageProduts.SubmitButton();
		logout.AdminLogout();
		webdriverutility.getUrl(driver, ConstantPath.Url);
		login.userLoginPage(Userid, UserPassword);
		manageProduts.CategotyTab();
		manageProduts.ClickTheProduct();
		value = manageProduts.GetTheText();
		Assert.assertEquals(value, UpdatedproductShippingcharge);
//		if (value.equals(UpdatedproductShippingcharge))
//		{	
			commonpage.ProductDeatialsWislist();
			commonpage.addtoCart();
			enterAddress.enterBillingAddress(billingaddress, billingstate, billingcity, billingpincode);
			enterAddress.enterShippingAddress(shippingaddress, shippingstate, shippingcity, shippingpincode);
			commonpage.checkOut();
			commonpage.payment();
		}
	}
//}