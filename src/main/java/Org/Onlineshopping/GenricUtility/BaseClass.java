package Org.Onlineshopping.GenricUtility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Org.Wayfair.POM.CommonPage;
import Org.Wayfair.POM.CreateCategory;
import Org.Wayfair.POM.CreateSubCateogry;
import Org.Wayfair.POM.EnterAddress;
import Org.Wayfair.POM.InsertProduct;
import Org.Wayfair.POM.Login;
import Org.Wayfair.POM.Logout;
import Org.Wayfair.POM.ManageProduts;
import Org.Wayfair.POM.TrackOrder;

public class BaseClass {
	protected WebDriver driver;
	protected WebDriverUtility webdriverutility;
	protected ExcelUtility excelutility;
	protected PopupUtility popup;
	protected SwitchWindowUtility window;
	protected JavaUtility javautility;
	protected Login login;
	protected CommonPage commonpage;
	protected EnterAddress enterAddress;
	protected CreateCategory createCategory;
	protected Logout logout;
	protected String Userid;
	protected String UserPassword;
	protected String searchproduct;
	protected String billingaddress;
	protected String billingstate;
	protected String billingcity;
	protected String billingpincode;
	protected String shippingaddress;
	protected String shippingstate;
	protected String shippingcity;
	protected String shippingpincode;
	protected String ParentId;
	protected String Adminid;
	protected String Adminpassword;
	protected String orderid;
	protected TrackOrder trackorde;
	protected TrackOrder trackorder;
	protected String status;
	protected String CategoryName;
	protected String CategoryDescription;
	protected String subcategoryname;
	protected CreateSubCateogry createsubcateogry;
	protected String productName;
	protected String productCompany;
	protected String productprice;
	protected String Actualproductprice;
	protected String productDescription;
	protected String productShippingcharge;
	protected String Imagepath1;
	protected String Imagepath2;
	protected String Imagepath3;
	protected InsertProduct inserproduct;
	protected ManageProduts manageProduts;
	protected String UpdatedproductShippingcharge;
	protected String value;
	protected static WebDriver sdriver;
	protected static JavaUtility sjavautility;
	protected ScreenShortUtility screenShortUtility;

	/**
	 * intialize the all utility class Open the Excel or propertyfile Read the
	 * common data create the instance for browser(lanch the browser) maximize and
	 * give implicit wait opent he application initialize
	 * jsexecuter,action,webdriverwait create the instance for common onbject
	 * repository
	 */
	@BeforeClass
	public void beforeClassSetUp() {
		// create instance for the genric utility
		webdriverutility = new WebDriverUtility();
		excelutility = new ExcelUtility();
		window = new SwitchWindowUtility();
		popup = new PopupUtility();
		javautility = new JavaUtility();
		screenShortUtility = new ScreenShortUtility();
		sjavautility = javautility;

		// Fetch the data from excel
		Userid = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "Userid");
		UserPassword = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "UserPassword");
		searchproduct = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "SearchProduct");
		billingaddress = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials",
				"billingaddress");
		billingstate = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "billingstate");
		billingcity = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "billingcity");
		billingpincode = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials",
				"billingpincode");
		shippingaddress = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials",
				"shippingaddress");
		shippingstate = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials",
				"shippingstate");
		shippingcity = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "shippingcity");
		shippingpincode = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials",
				"shippingpincode");
		CategoryName = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "CategoryName");
		CategoryDescription = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData",
				"CategoryDescription");
		subcategoryname = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData",
				"SubCategoryName");
		productName = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "productName");
		productCompany = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "productCompany");
		productprice = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "productprice");
		Actualproductprice = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData",
				"Actualproductprice");
		productDescription = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData",
				"productDescription");
		productShippingcharge = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData",
				"productShippingcharge");
		Imagepath1 = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "Imagepath1");
		Imagepath2 = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "Imagepath2");
		Imagepath3 = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData", "Imagepath3");
		UpdatedproductShippingcharge = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "TestData",
				"UpdatedproductShippingcharge");

		// ParentId = webdriverutility.getWindowAddress(driver);
		Adminid = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "Adminid");
		Adminpassword = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials",
				"AdminPassword");

		// Launch the browser
		driver = webdriverutility.openTheBrowserWithApplications("chrome", 10, ConstantPath.Url);
		sdriver = driver;
		ParentId = webdriverutility.getWindowAddress(driver);

		// Create the object for common pom repositiory
		login = new Login(driver);
		commonpage = new CommonPage(driver);
		enterAddress = new EnterAddress(driver);
		logout = new Logout(driver);
		trackorder = new TrackOrder(driver);
		createCategory = new CreateCategory(driver);
		createsubcateogry = new CreateSubCateogry(driver);
		inserproduct = new InsertProduct(driver);
		manageProduts = new ManageProduts(driver);

	}

	/**
	 * Login to the application
	 * 
	 */
	@BeforeMethod
	public void beforeMethodSetUp() {
		login.userLoginPage(Userid, UserPassword);

	}

	/**
	 * Logout the application
	 * 
	 */
	@AfterMethod
	public void afterMethodSetUp() {
		logout.userlogoutButton();
	}

	/**
	 * Close the browser close the excel
	 */
	@AfterClass
	public void afterClassSetUp() {
		webdriverutility.closeTheWindow(driver);
		excelutility.closeTheExcel();
	}
}
