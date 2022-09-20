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
import Org.Wayfair.POM.ManageProduts;

public class TC_3
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		WebDriver driver=null;
		//Launch the browser
		WebDriverUtility webdriverutility = new WebDriverUtility();
		driver = webdriverutility.openTheBrowserWithApplications("chrome", 10, ConstantPath.AdminUrl);
		//Fetch the data from Excel
		ExcelUtility excelutility=new ExcelUtility();
		String Adminid = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "Adminid");
		String Adminpassword = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "AdminPassword");
		Login login = new Login(driver);
		login.adminLogin(Adminid, Adminpassword);
		//		driver.findElement(By.id("inputEmail")).sendKeys(Adminid);
		//		driver.findElement(By.id("inputPassword")).sendKeys(Adminpassword);
		//		driver.findElement(By.name("submit")).click();
		String productName = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "productName");
		String UpdatedproductShippingcharge = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "UpdatedproductShippingcharge");
		ManageProduts manageProduts=new ManageProduts(driver);
		manageProduts.ManageProductButton();
		manageProduts.SearchTextfield(productName);
		manageProduts.ProductEditButton();		
		manageProduts.productShippingchargeTextField(UpdatedproductShippingcharge);
		manageProduts.SubmitButton();
		//		driver.findElement(By.xpath("//a[.='Manage Products ']")).click();
		//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("New Model Cars");
		//		driver.findElement(By.xpath("//table//tbody/tr/td[last()]//i[@class='icon-edit']")).click();
		//		driver.findElement(By.xpath("//input[@name='productShippingcharge']")).clear();
		//		driver.findElement(By.xpath("//input[@name='productShippingcharge']")).sendKeys("50");
		//		driver.findElement(By.xpath("//button[@name='submit']")).click();
		//user
		webdriverutility.getUrl(driver, ConstantPath.Url);
		String Userid = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials","Userid");
		String UserPassword = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "UserPassword");
		login.userLoginPage(Userid, UserPassword);
		//		driver.findElement(By.xpath("//a[text()='Login']")).click();
		//		driver.findElement(By.id("exampleInputEmail1")).sendKeys(Userid);
		//		driver.findElement(By.id("exampleInputPassword1")).sendKeys(UserPassword);
		//		driver.findElement(By.xpath("//button[text()='Login']")).click();
		//		driver.findElement(By.xpath(" //a[.=' Toys']")).click();
		//driver.findElement(By.name("product")).sendKeys("New Model Cars");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		manageProduts.CategotyTab();
		manageProduts.ClickTheProduct();
		//		driver.findElement(By.xpath("//a[.='New Model Cars']")).click();
		//		String value = driver.findElement(By.xpath("//div[@class='product-info']/div[@class='stock-container info-container m-t-10'][last()]//div[@class='col-sm-9']//span")).getText();
		String value = manageProduts.GetTheText();
		System.out.println(value);
		if (value.equals("50"))
		{	
			CommonPage commonPage=new CommonPage(driver);
			commonPage.ProductDeatialsWislist();
			commonPage.addtoCart();
			//enterAddress.enterBillingAddress(Adminpassword, Userid, UserPassword, value)
			//			driver.findElement(By.xpath("//a[.=' ADD TO CART']")).click();
			//			Alert a = driver.switchTo().alert();
			//			a.accept();
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
			//			driver.findElement(By.xpath("//textarea[@name='billingaddress']")).sendKeys("28/10,Manjanayakanpatti,Dindigul");
			//			driver.findElement(By.xpath("//input[@name='bilingstate']")).sendKeys("Tamilnadu");
			//			driver.findElement(By.xpath("//input[@name='billingcity']")).sendKeys("Oddanchatram");
			//			driver.findElement(By.xpath("//input[@id='billingpincode']")).sendKeys("624614");
			//			driver.findElement(By.xpath("//textarea[@name='shippingaddress']")).sendKeys("28/10,Manjanayakanpatti,Dindigul");
			//			driver.findElement(By.xpath("//input[@name='shippingstate']")).sendKeys("Tamilnadu");
			//			driver.findElement(By.xpath("//input[@name='shippingcity']")).sendKeys("Oddanchatram");
			//			driver.findElement(By.xpath("//input[@id='shippingpincode']")).sendKeys("624614");
			commonPage.checkOut();
			commonPage.payment();
			//			driver.findElement(By.xpath("//button[@name='ordersubmit']")).click();
			//			driver.findElement(By.xpath("//input[@name='submit']")).click();
			Logout logout=new Logout(driver);
			logout.userlogoutButton();
			//			driver.findElement(By.xpath("//a[.='Logout']")).click();
		}
		else
		{
			System.out.println("Fail");
		}
		webdriverutility.closeTheBrowser(driver);
	}
}
