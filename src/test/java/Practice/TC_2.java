package Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import Org.Onlineshopping.GenricUtility.ConstantPath;
import Org.Onlineshopping.GenricUtility.ExcelUtility;
import Org.Onlineshopping.GenricUtility.PopupUtility;
import Org.Onlineshopping.GenricUtility.SwitchWindowUtility;
import Org.Onlineshopping.GenricUtility.WebDriverUtility;
import Org.Wayfair.POM.CommonPage;
import Org.Wayfair.POM.EnterAddress;
import Org.Wayfair.POM.Login;
import Org.Wayfair.POM.Logout;
import Org.Wayfair.POM.TrackOrder;

public class TC_2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{	
		WebDriver driver;
		//		WebElement EntriesDropdown;
		//		WebElement StatusDropdown;

		//Launch the browser
		WebDriverUtility webdriverutility = new WebDriverUtility();
		driver = webdriverutility.openTheBrowserWithApplications("chrome", 10, ConstantPath.Url);
		//Fetch the data from Excel
		ExcelUtility excelutility=new ExcelUtility();
		String Userid = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials","Userid");
		String UserPassword = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "UserPassword");
		//User
		Login login = new Login(driver);
		login.userLoginPage(Userid, UserPassword);
		CommonPage commonpage=new CommonPage(driver);
		commonpage.searchTextfield("The Wimpy Kid Do -It- Yourself Book");
		commonpage.wishList();
		commonpage.addtoCart();
		String billingaddress = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "billingaddress");
		String	billingstate=excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "billingstate");
		String	billingcity=excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "billingcity");
		String billingpincode=excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "billingpincode");
		String shippingaddress=excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "shippingaddress");
		String shippingstate=excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "shippingstate");
		String shippingcity=excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "shippingcity");
		String shippingpincode=excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "shippingpincode");
		EnterAddress enterAddress=new EnterAddress(driver);
		enterAddress.enterBillingAddress(billingaddress, billingstate, billingcity, billingpincode);
		enterAddress.enterShippingAddress(shippingaddress, shippingstate, shippingcity, shippingpincode);
		//commonpage.enterAddress("28/10,Manjanayakanpatti,Dindigul", "Tamilnadu", "Oddanchatram", "624614", "28/10,Manjanayakanpatti,Dindigul", "Tamilnadu", "Oddanchatram", "624614");
		commonpage.checkOut();
		commonpage.payment();
		//		driver.findElement(By.xpath("//a[.='Login']")).click();
		//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Userid);
		//		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys(Password);
		//		driver.findElement(By.xpath("//button[.='Login']")).click();
		//		driver.findElement(By.xpath("//h2[.='Shopping Portal']")).click();
		//		driver.findElement(By.xpath("//input[@placeholder='Search here...']")).sendKeys("The Wimpy Kid Do -It- Yourself Book");
		//		driver.findElement(By.xpath("//button[@name='search']")).click();
		//		driver.findElement(By.xpath("//a[@title='Wishlist']")).click();
		//		driver.findElement(By.xpath("//a[.='Add to cart']")).click();
		//		driver.findElement(By.xpath("//i[@class='icon fa fa-shopping-cart']")).click();
		//		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		//		driver.findElement(By.xpath("//textarea[@name='billingaddress']")).sendKeys("28/10,Manjanayakanpatti,Dindigul");
		//		driver.findElement(By.xpath("//input[@name='bilingstate']")).sendKeys("Tamilnadu");
		//		driver.findElement(By.xpath("//input[@name='billingcity']")).sendKeys("Oddanchatram");
		//		driver.findElement(By.xpath("//input[@id='billingpincode']")).sendKeys("624614");
		//		driver.findElement(By.xpath("//textarea[@name='shippingaddress']")).sendKeys("28/10,Manjanayakanpatti,Dindigul");
		//		driver.findElement(By.xpath("//input[@name='shippingstate']")).sendKeys("Tamilnadu");
		//		driver.findElement(By.xpath("//input[@name='shippingcity']")).sendKeys("Oddanchatram");
		//		driver.findElement(By.xpath("//input[@id='shippingpincode']")).sendKeys("624614");
		//		driver.findElement(By.xpath("//button[@name='ordersubmit']")).click();
		//		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Logout logout=new Logout(driver);
		logout.userlogoutButton();
		//		driver.findElement(By.xpath("//a[.='Logout']")).click();
		//Admin
		String ParentId = webdriverutility.getWindowAddress(driver);
		//String ParentId = driver.getWindowHandle();
		webdriverutility.getUrl(driver, ConstantPath.AdminUrl);
		String Adminid = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "Adminid");
		String Adminpassword = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "AdminPassword");
		login.adminLogin(Adminid, Adminpassword);
		//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Adminid);
		//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Adminpassword);
		//		driver.findElement(By.xpath("//button[.='Login']")).click();
		commonpage.oderManagementDropDown();
		commonpage.todaysOrder();
		//		driver.findElement(By.xpath("//i[@class='icon-chevron-down pull-right']")).click();
		//		driver.findElement(By.xpath("//a[@href='todays-orders.php']")).click();
		//		WebElement select = driver.findElement(By.xpath("//select[@name='DataTables_Table_0_length']"));
		commonpage.entriesDropDown("100");
		//		driver.findElement(By.xpath("//table[@id='DataTables_Table_0']/tbody/tr[last()]/td[last()]/a")).click();
		commonpage.EditAction();
		//Switch window
		SwitchWindowUtility window = new SwitchWindowUtility();
		window.SwichWindow(driver);
		//		String Orderid = driver.findElement(By.xpath("//table//tr[2]/td[2]")).getText();
		String orderid = commonpage.getOrderId();
		//		WebElement Select = driver.findElement(By.xpath("//select[@name='status']"));
		commonpage.statusDropdown("In Process");
		//dropdown.Select(StatusDropdown, "In Process");
		commonpage.addDiscription("Product is ready to deliver");
		commonpage.updateButton();
		//		driver.findElement(By.xpath("//textarea[@name='remark']")).sendKeys("Product is ready to deliver");
		//		driver.findElement(By.xpath("//input[@value='update']")).click();
		PopupUtility popup=new PopupUtility();
		popup.AlartPopup(driver);
		//	driver.switchTo().alert().accept();
		webdriverutility.closeTheWindow(driver);
		window.ParentWnidow(driver, ParentId);
		//		driver.switchTo().window(ParentId);
		logout.AdminLogout();
		//		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		//		driver.findElement(By.xpath("//a[.='Logout']")).click();
		webdriverutility.getUrl(driver, ConstantPath.Url);
		//Track Order
		TrackOrder trackorder = new TrackOrder(driver);
		trackorder.tracTheOrder(orderid, Userid);
		//		driver.findElement(By.xpath("//span[.='Track Order']")).click();
		//		driver.findElement(By.xpath("//input[@name='orderid']")).sendKeys(orderid);
		//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Userid);
		//		driver.findElement(By.xpath("//button[@name='submit']")).click();
		//		driver.findElement(By.xpath("//a[@title='Track order']")).click();
		window.SwichWindow(driver);
		String status = commonpage.InprogressorderStatus();
		//String Status = driver.findElement(By.xpath("//tbody//tr[last()-2]/td[2]")).getText();
		webdriverutility.closeTheWindow(driver);
		window.ParentWnidow(driver, ParentId);
		if(status.equals("in Process"));
		{
			webdriverutility.getUrl(driver, ConstantPath.AdminUrl);
			login.adminLogin(Adminid, Adminpassword);
			commonpage.oderManagementDropDown();
			commonpage.pendingOrder();
			//			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Adminid);
			//			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Adminpassword);
			//			driver.findElement(By.xpath("//button[.='Login']")).click();
			//			driver.findElement(By.xpath("//i[@class='icon-chevron-down pull-right']")).click();
			//			driver.findElement(By.xpath("//a[@href='pending-orders.php']")).click();
			//			WebElement select1 = driver.findElement(By.xpath("//select[@name='DataTables_Table_0_length']"));
			commonpage.entriesDropDown("100");
			//dropdown.Select(EntriesDropdown, "100");
			commonpage.EditAction();

			//			driver.findElement(By.xpath("//table[@id='DataTables_Table_0']/tbody/tr[last()]/td[last()]/a")).click();
			window.SwichWindow(driver);

			//dropdown.Select(StatusDropdown, "Delivered");
			//			WebElement Select1 = driver.findElement(By.xpath("//select[@name='status']"));
			commonpage.statusDropdown("Delivered");
			//			dropdown.Select(Select1, "Delivered");
			commonpage.addDiscription("Product is delivered");
			//			driver.findElement(By.xpath("//textarea[@name='remark']")).sendKeys("Product is delivered");
			//driver.findElement(By.xpath("//input[@value='update']")).click();
			commonpage.updateButton();
			//Thread.sleep(3000);
			popup.AlartPopup(driver);
			//			driver.switchTo().alert().accept();
			webdriverutility.closeTheWindow(driver);
			window.ParentWnidow(driver, ParentId);
			//			driver.switchTo().window(ParentId);
			logout.AdminLogout();
			//			driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
			//			driver.findElement(By.xpath("//a[.='Logout']")).click();
			webdriverutility.getUrl(driver, ConstantPath.Url);	
			//Track Order
			trackorder.tracTheOrder(orderid, Userid);
			//			driver.findElement(By.xpath("//span[.='Track Order']")).click();
			//			driver.findElement(By.xpath("//input[@name='orderid']")).sendKeys(orderid);
			//			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Userid);
			//			driver.findElement(By.xpath("//button[@name='submit']")).click();
			//			driver.findElement(By.xpath("//a[@title='Track order']")).click();
			window.SwichWindow(driver);
			String status1 = commonpage.DeliverStatusorderStatus();
			webdriverutility.closeTheWindow(driver);
			window.ParentWnidow(driver, ParentId);


			//			String Status1 = driver.findElement(By.xpath("//tbody//tr[last()-3]/td[2]")).getText();
			if(status1.equals("Delivered"));
			{
				System.out.println("Testcase is pass");
			}
		}
		webdriverutility.closeTheBrowser(driver);
	}
}



