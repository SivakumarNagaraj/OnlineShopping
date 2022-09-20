package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import Org.Onlineshopping.GenricUtility.BaseClass;
import Org.Onlineshopping.GenricUtility.ConstantPath;

public class TC2_Test extends BaseClass{
	@Test
	public void tc2_Test() {
		commonpage.searchTextfield(searchproduct);
		commonpage.wishList();
		commonpage.addtoCart();
		enterAddress.enterBillingAddress(billingaddress, billingstate, billingcity, billingpincode);
		enterAddress.enterShippingAddress(shippingaddress, shippingstate, shippingcity, shippingpincode);
		commonpage.checkOut();
		commonpage.payment();
		logout.userlogoutButton();
		ParentId = webdriverutility.getWindowAddress(driver);
		webdriverutility.getUrl(driver, ConstantPath.AdminUrl);
		login.adminLogin(Adminid, Adminpassword);
		commonpage.oderManagementDropDown();
		commonpage.todaysOrder();
		commonpage.entriesDropDown("100");
		commonpage.EditAction();
		window.SwichWindow(driver);
		orderid = commonpage.getOrderId();
		commonpage.statusDropdown("In Process");
		commonpage.addDiscription("Product is ready to deliver");
		commonpage.updateButton();
		popup.AlartPopup(driver);
		webdriverutility.closeTheWindow(driver);
		window.ParentWnidow(driver, ParentId);
		logout.AdminLogout();
		webdriverutility.getUrl(driver, ConstantPath.Url);
		login.userLoginPage(Userid, UserPassword);
		trackorder.tracTheOrder(orderid, Userid);
		window.SwichWindow(driver);
		status = commonpage.InprogressorderStatus();
		webdriverutility.closeTheWindow(driver);
		window.ParentWnidow(driver, ParentId);
		Assert.assertEquals(status, "in Process");
//		if(status.equals("in Process"));
//		{
			webdriverutility.getUrl(driver, ConstantPath.AdminUrl);
			login.adminLogin(Adminid, Adminpassword);
			commonpage.oderManagementDropDown();
			commonpage.pendingOrder();
			commonpage.entriesDropDown("100");
			commonpage.EditAction();
			window.SwichWindow(driver);
			commonpage.statusDropdown("Delivered");
			commonpage.addDiscription("Product is delivered");
			commonpage.updateButton();
			popup.AlartPopup(driver);
			webdriverutility.closeTheWindow(driver);
			window.ParentWnidow(driver, ParentId);
			logout.AdminLogout();
			webdriverutility.getUrl(driver, ConstantPath.Url);
			login.userLoginPage(Userid, UserPassword);
			trackorder.tracTheOrder(orderid, Userid);
			window.SwichWindow(driver);
			status = commonpage.DeliverStatusorderStatus();
			Assert.assertEquals(status, "Delivered");
//			if (status.equals("Delivered")) {
//				System.out.println("Testcase is pass");
//			} else {
//				System.out.println("Tc is fail");
//			}

			webdriverutility.closeTheWindow(driver);
			window.ParentWnidow(driver, ParentId);
		}
	}
//}
		

