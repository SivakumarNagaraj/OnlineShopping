package Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import Org.Onlineshopping.GenricUtility.ConstantPath;
import Org.Onlineshopping.GenricUtility.ExcelUtility;
import Org.Onlineshopping.GenricUtility.WebDriverUtility;
import Org.Wayfair.POM.CommonPage;
import Org.Wayfair.POM.EnterAddress;
import Org.Wayfair.POM.Login;
import Org.Wayfair.POM.Logout;

public class TC_1
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		WebDriver driver;
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
		String searchproduct = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "SearchProduct");
		commonpage.searchTextfield(searchproduct);
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
		commonpage.ProductNameText();
		Logout logout = new Logout(driver);
		logout.userlogoutButton();
		webdriverutility.closeTheBrowser(driver);
	}
}
