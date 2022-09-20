package Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Org.Onlineshopping.GenricUtility.ConstantPath;
import Org.Onlineshopping.GenricUtility.DropdownUtility;
import Org.Onlineshopping.GenricUtility.ExcelUtility;
import Org.Onlineshopping.GenricUtility.SwitchWindowUtility;
import Org.Onlineshopping.GenricUtility.WebDriverUtility;

public class TC_5
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{	
		WebDriver driver=null;
		//Launch the browser
		WebDriverUtility webdriverutility = new WebDriverUtility();
		driver = webdriverutility.openTheBrowserWithApplications("chrome", 10, ConstantPath.Url);
		//Fetch the data from Excel
		ExcelUtility excelutility=new ExcelUtility();
		String Userid = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials","Userid");
		String UserPassword = excelutility.getDatafromExcelBasedOnKey(ConstantPath.Excel_Path, "Credentials", "UserPassword");
		
		//User
		driver.findElement(By.xpath("//a[.='Login']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Userid);
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys(UserPassword);
		driver.findElement(By.xpath("//button[.='Login']")).click();
		driver.findElement(By.xpath("//h2[.='Shopping Portal']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search here...']")).sendKeys("The Wimpy Kid Do -It- Yourself Book");
		driver.findElement(By.xpath("//button[@name='search']")).click();
		driver.findElement(By.xpath("//a[@title='Wishlist']")).click();
		driver.findElement(By.xpath("//a[.='Add to cart']")).click();
		driver.findElement(By.xpath("//i[@class='icon fa fa-shopping-cart']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//textarea[@name='billingaddress']")).sendKeys("28/10,Manjanayakanpatti,Dindigul");
		driver.findElement(By.xpath("//input[@name='bilingstate']")).sendKeys("Tamilnadu");
		driver.findElement(By.xpath("//input[@name='billingcity']")).sendKeys("Oddanchatram");
		driver.findElement(By.xpath("//input[@id='billingpincode']")).sendKeys("624614");
		driver.findElement(By.xpath("//textarea[@name='shippingaddress']")).sendKeys("28/10,Manjanayakanpatti,Dindigul");
		driver.findElement(By.xpath("//input[@name='shippingstate']")).sendKeys("Tamilnadu");
		driver.findElement(By.xpath("//input[@name='shippingcity']")).sendKeys("Oddanchatram");
		driver.findElement(By.xpath("//input[@id='shippingpincode']")).sendKeys("624614");
		driver.findElement(By.xpath("//button[@name='ordersubmit']")).click();
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		//Admin
				String ParentId = driver.getWindowHandle();
				webdriverutility.getUrl(driver, ConstantPath.AdminUrl);
				String Adminid = excelutility.getDataFromExcel(ConstantPath.Excel_Path, "Credentials", 2, 2);
				String Adminpassword = excelutility.getDataFromExcel(ConstantPath.Excel_Path, "Credentials", 3, 2);	
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Adminid);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Adminpassword);
		driver.findElement(By.xpath("//button[.='Login']")).click();
		driver.findElement(By.xpath("//i[@class='icon-chevron-down pull-right']")).click();
		driver.findElement(By.xpath("//a[@href='pending-orders.php']")).click();
		WebElement select = driver.findElement(By.xpath("//select[@name='DataTables_Table_0_length']"));
		DropdownUtility dropdown = new DropdownUtility();
		dropdown.Select(select, "100");
		driver.findElement(By.xpath("//table[@id='DataTables_Table_0']/tbody/tr[last()]/td[last()]/a")).click();
		new SwitchWindowUtility().SwichWindow(driver);
		String Orderid = driver.findElement(By.xpath("//table//tr[2]/td[2]")).getText();
		WebElement Select = driver.findElement(By.xpath("//select[@name='status']"));
		Select selectoptions = new Select(Select);
		selectoptions.selectByVisibleText("Delivered");
		driver.findElement(By.xpath("//textarea[@name='remark']")).sendKeys("Product is delivered");
		driver.findElement(By.xpath("//input[@value='update']")).click();
		driver.switchTo().alert().accept();
		driver.close();
		driver.switchTo().window(ParentId);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		//Track Order
		//driver.get(Url);
		driver.findElement(By.xpath("//span[.='Track Order']")).click();
		driver.findElement(By.xpath("//input[@name='orderid']")).sendKeys(Orderid);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Userid);
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		driver.findElement(By.xpath("//a[@title='Track order']")).click();
		String Status = driver.findElement(By.xpath("//tbody//tr[last()-2]/td[2]")).getText();
		if(Status.equals("Delivered"));
		{
			System.out.println("Testcase is pass");
		}
		webdriverutility.closeTheBrowser(driver);
	}
}
