package Practice;


import Org.Onlineshopping.GenricUtility.ConstantPath;
import Org.Onlineshopping.GenricUtility.ExcelUtility;

public class Sample 
{
public static void main(String[] args) {
	//String data = new ExcelUtility().getDataFromExcel(ConstantPath.Excel_Path, "Credentials", 1, 1);
//	System.out.println(data);
	
//String data1 = new FileUtility().getDataFromFile(ConstantPath.Propertyfile_Path, "username");
//	System.out.println(data1);
//	
//	System.out.println(new JavaUtility().getRandumNumber(100));
	
//	new WebDriverUtility().openTheBrowserWithApplications("chrome", 10, "flipkart");
	//new WebDriverUtility().closeTheBrowser("driver");
//	new WebDriverUtility().maximizeTheBrowser("WebDriver");
	
//	WebElement driver;
	//new DropdownUtility().select(driver);
	ExcelUtility excel=new ExcelUtility();
	String url = excel.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "userUrl");
System.out.println(url);
}
}
