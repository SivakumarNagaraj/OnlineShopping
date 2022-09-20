package Testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{	//Launch the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Fetch the data from Excel
		FileInputStream fis=new FileInputStream("src/test/resources/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Credentials");
		String Url = sheet.getRow(1).getCell(1).getStringCellValue();
		String Userid = sheet.getRow(2).getCell(1).getStringCellValue();
		String Password = sheet.getRow(3).getCell(1).getStringCellValue();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//User
		driver.get(Url);
		driver.findElement(By.xpath("//a[.='Login']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Userid);
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys(Password);
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
		String AdminUrl = sheet.getRow(1).getCell(2).getStringCellValue();
		String Adminid = sheet.getRow(2).getCell(2).getStringCellValue();
		String Adminpassword = sheet.getRow(3).getCell(2).getStringCellValue();
		driver.get(AdminUrl);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Adminid);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Adminpassword);
		driver.findElement(By.xpath("//button[.='Login']")).click();
		driver.findElement(By.xpath("//i[@class='icon-chevron-down pull-right']")).click();
		driver.findElement(By.xpath("//a[@href='todays-orders.php']")).click();
		WebElement select = driver.findElement(By.xpath("//select[@name='DataTables_Table_0_length']"));
		Select Selectentries = new Select(select);
		Selectentries.selectByVisibleText("100");
		driver.findElement(By.xpath("//table[@id='DataTables_Table_0']/tbody/tr[last()]/td[last()]/a")).click();
		Set<String> child = driver.getWindowHandles();
		for (String Brow : child)
		{
			driver.switchTo().window(Brow);
		}
		String Orderid = driver.findElement(By.xpath("//table//tr[2]/td[2]")).getText();
		//System.out.println(Orderid);
		//sheet.getRow(1).createCell(3).setCellValue(Orderid);
		//wb.write(FileOutputStream("src/test/resources/Testdata.xlsx"));
		WebElement Select = driver.findElement(By.xpath("//select[@name='status']"));
		Select selectoptions = new Select(Select);
		selectoptions.selectByVisibleText("In Process");
		driver.findElement(By.xpath("//textarea[@name='remark']")).sendKeys("Product is ready to deliver");
		driver.findElement(By.xpath("//input[@value='update']")).click();
		driver.switchTo().alert().accept();
		driver.close();
		driver.switchTo().window(ParentId);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		//Track Order
		driver.get(Url);
		driver.findElement(By.xpath("//span[.='Track Order']")).click();
		driver.findElement(By.xpath("//input[@name='orderid']")).sendKeys(Orderid);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Userid);
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		driver.findElement(By.xpath("//a[@title='Track order']")).click();
		String Status = driver.findElement(By.xpath("//tbody//tr[last()-2]/td[2]")).getText();
		if(Status.equals("in Process"));
		{
			System.out.println("Testcase is pass");
		}

	}
}



