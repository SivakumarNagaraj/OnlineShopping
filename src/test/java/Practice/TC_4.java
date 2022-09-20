package Practice;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import Org.Onlineshopping.GenricUtility.ConstantPath;
import Org.Onlineshopping.GenricUtility.ExcelUtility;
import Org.Onlineshopping.GenricUtility.WebDriverUtility;
import Org.Wayfair.POM.CommonPage;
import Org.Wayfair.POM.CreateCategory;
import Org.Wayfair.POM.CreateSubCateogry;
import Org.Wayfair.POM.EnterAddress;
import Org.Wayfair.POM.InsertProduct;
import Org.Wayfair.POM.Login;
import Org.Wayfair.POM.Logout;

public class TC_4
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		WebDriver driver;
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
		CreateCategory createCategory=new CreateCategory(driver);
		createCategory.CreateCatogry();
		String CategoryName = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "CategoryName");
		String CategoryDescription = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "CategoryDescription");
		createCategory.CateogryTextfield(CategoryName);
		createCategory.CateogryDescription(CategoryDescription);
		createCategory.CateogrySubmitButton();
		//		driver.findElement(By.xpath("//a[text()=' Create Category ']")).click();
		//		driver.findElement(By.name("category")).sendKeys("Toys");
		//		driver.findElement(By.name("description")).sendKeys("All Brands of cloths are availaible");
		//		driver.findElement(By.name("submit")).click();
		CommonPage commonPage=new CommonPage(driver);
		commonPage.entriesDropDown("100");
		//		WebElement select = driver.findElement(By.xpath("//select[@name='DataTables_Table_0_length']"));
		//		DropdownUtility dropdown = new DropdownUtility();
		//		dropdown.Select(select, "100");

		//SubCategory
		String subcategoryname = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "SubCategoryName");
		CreateSubCateogry createsubcateogry=new CreateSubCateogry(driver);
		createsubcateogry.SubCateogry();
		createsubcateogry.CateogryDropdown(CategoryName);
		createsubcateogry.SubCateogryTextfield(subcategoryname);
		createsubcateogry.SubmitButton();
		//		driver.findElement(By.xpath("//a[text()='Sub Category ']")).click();
		//		WebElement select1 = driver.findElement(By.xpath("//select[@name='category']"));
		//		dropdown.Select(select1, "Toys");
		//		driver.findElement(By.xpath("//input[@name='subcategory']")).sendKeys("Plastic");
		//		driver.findElement(By.name("submit")).click();
		//InsertProduct
		String productName = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "productName");
		String productCompany = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "productCompany");
		String productprice = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "productprice");
		String Actualproductprice = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "Actualproductprice");
		String productDescription = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "productDescription");
		String productShippingcharge = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "productShippingcharge");
		String Imagepath1 = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "Imagepath1");
		String Imagepath2 = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "Imagepath2");
		String Imagepath3 = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "Imagepath3");

		InsertProduct inserproduct=new InsertProduct(driver);
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
		inserproduct.ProductImage1(productShippingcharge);
		inserproduct.ProductImage1(Imagepath1);
		inserproduct.ProductImage1(Imagepath2);
		inserproduct.ProductImage1(Imagepath3);
		inserproduct.InsertSubmitButton();
		Logout logout=new Logout(driver);
		logout.AdminLogout();
		//		driver.findElement(By.xpath("//a[text()='Insert Product ']")).click();
		//		WebElement select2 = driver.findElement(By.xpath("//select[@name='category']"));
		//		dropdown.Select(select2, "Toys");
		//		WebElement select3 = driver.findElement(By.id("subcategory"));
		//		dropdown.Select(select3, "Plastic");
		//		driver.findElement(By.name("submit")).click();
		//
		//		driver.findElement(By.xpath("//input[@name='productName']")).sendKeys("New Model Cars");
		//
		//		driver.findElement(By.xpath("//input[@name='productCompany']")).sendKeys("BMW");
		//
		//		driver.findElement(By.xpath("//input[@name='productpricebd']")).sendKeys("1000");
		//
		//		driver.findElement(By.xpath("//input[@name='productprice']")).sendKeys("900");
		//
		//		driver.findElement(By.xpath("//textarea[@name='productDescription']")).sendKeys("Wired less Remote control cars");
		//
		//		driver.findElement(By.xpath("//input[@name='productShippingcharge']")).sendKeys("0");
		//
		//		WebElement select4 = driver.findElement(By.xpath("//select[@name='productAvailability']"));
		//		dropdown.Select(select4, "In Stock");

		//		driver.findElement(By.xpath("//input[@id='productimage1']")).sendKeys("D:\\Siva\\TY\\Img1.jpg");
		//		driver.findElement(By.xpath("//input[@name='productimage2']")).sendKeys("D:\\\\Siva\\\\TY\\\\Img2.jpg");
		//		driver.findElement(By.xpath("//input[@name='productimage3']")).sendKeys("D:\\\\Siva\\\\TY\\\\Img3.jpg");
		//		driver.findElement(By.xpath("//button[@name='submit']")).click();
		//		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		//User
		webdriverutility.getUrl(driver, ConstantPath.Url);
		String Userid = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials","Userid");
		String UserPassword = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "UserPassword");
		login.userLoginPage(Userid, UserPassword);
		//		driver.findElement(By.xpath("//a[text()='Login']")).click();
		//		driver.findElement(By.id("exampleInputEmail1")).sendKeys(Userid);
		//		driver.findElement(By.id("exampleInputPassword1")).sendKeys(UserPassword);
		//		driver.findElement(By.xpath("//button[text()='Login']")).click();
		commonPage.searchTextfield(productName);
		commonPage.wishList();
		commonPage.addtoCart();
		//		driver.findElement(By.name("product")).sendKeys("New Model Cars");
		//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		//		Thread.sleep(3000);
		//		Alert a = driver.switchTo().alert();
		//		a.accept();
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
		//		driver.findElement(By.xpath("//a[.='Logout']")).click();
		webdriverutility.closeTheBrowser(driver);
	}

}

