package Testcases;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_4
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		//Launch the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Fetch the data from Excel
		FileInputStream fis=new FileInputStream("src/test/resources/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Credentials");
		String AdminUrl = sheet.getRow(1).getCell(2).getStringCellValue();
		String Adminid = sheet.getRow(2).getCell(2).getStringCellValue();
		String Adminpassword = sheet.getRow(3).getCell(2).getStringCellValue();
		driver.get(AdminUrl);
		driver.findElement(By.id("inputEmail")).sendKeys(Adminid);
		driver.findElement(By.id("inputPassword")).sendKeys(Adminpassword);
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//a[text()=' Create Category ']")).click();
		driver.findElement(By.name("category")).sendKeys("Toys");
		driver.findElement(By.name("description")).sendKeys("All Brands of cloths are availaible");
		driver.findElement(By.name("submit")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='DataTables_Table_0_length']"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("100");

		//		WebElement text = driver.findElement(By.xpath("//td[text()='Clothing']"));
		//		if (text.equals("Toys")) {
		//			System.out.println("Category is created");
		//		} else {
		//			System.out.println("Category is not created");
		//		}
		//SubCategory
		driver.findElement(By.xpath("//a[text()='Sub Category ']")).click();
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='category']"));
		Select s1 = new Select(dropdown2);
		s1.selectByVisibleText("Toys");
		driver.findElement(By.xpath("//input[@name='subcategory']")).sendKeys("Plastic");
		driver.findElement(By.name("submit")).click();
		//InsertProduct
		driver.findElement(By.xpath("//a[text()='Insert Product ']")).click();
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@name='category']"));
		Select s2 = new Select(dropdown3);
		s2.selectByVisibleText("Toys");
		WebElement dropdown4 = driver.findElement(By.id("subcategory"));
		Select s3 = new Select(dropdown4);
		s3.selectByVisibleText("Plastic");
		driver.findElement(By.name("submit")).click();

		driver.findElement(By.xpath("//input[@name='productName']")).sendKeys("New Model Cars");

		driver.findElement(By.xpath("//input[@name='productCompany']")).sendKeys("BMW");

		driver.findElement(By.xpath("//input[@name='productpricebd']")).sendKeys("1000");

		driver.findElement(By.xpath("//input[@name='productprice']")).sendKeys("900");

		driver.findElement(By.xpath("//textarea[@name='productDescription']")).sendKeys("Wired less Remote control cars");

		driver.findElement(By.xpath("//input[@name='productShippingcharge']")).sendKeys("0");

		WebElement dropdown5 = driver.findElement(By.xpath("//select[@name='productAvailability']"));
		Select s4 = new Select(dropdown5);
		s4.selectByVisibleText("In Stock");

		driver.findElement(By.xpath("//input[@id='productimage1']")).sendKeys("D:\\Siva\\TY\\Img1.jpg");
		driver.findElement(By.xpath("//input[@name='productimage2']")).sendKeys("D:\\\\Siva\\\\TY\\\\Img2.jpg");
		driver.findElement(By.xpath("//input[@name='productimage3']")).sendKeys("D:\\\\Siva\\\\TY\\\\Img3.jpg");
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		//User
		String Url = sheet.getRow(1).getCell(1).getStringCellValue();
		String Userid = sheet.getRow(2).getCell(1).getStringCellValue();
		String Password = sheet.getRow(3).getCell(1).getStringCellValue();
		driver.get(Url);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("exampleInputEmail1")).sendKeys(Userid);
		driver.findElement(By.id("exampleInputPassword1")).sendKeys(Password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.name("product")).sendKeys("New Model Cars");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		//		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		a.accept();
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
		//		driver.get("http://rmgtestingserver/domain/Online_Shopping_Application/admin/");
		//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//		driver.findElement(By.id("inputEmail")).sendKeys("admin");
		//		driver.findElement(By.id("inputPassword")).sendKeys("Test@123");
		//		driver.findElement(By.name("submit")).click();
		//		
		//		driver.findElement(By.xpath("(//a[normalize-space(text()='Order Management')])[7]")).click();
		//		driver.findElement(By.xpath("//a[contains(.,'Today')]")).click();
		//		driver.findElement(By.xpath("(//i[contains(@class,'icon-edit')])[1]")).click();
		//		Set<String> child = driver.getWindowHandles();
		//		for(String b:child) {
		//			driver.switchTo().window(b);
		//		}
		//	    WebElement drp = driver.findElement(By.name("status"));
		//		Select sx= new Select(drp);
		//		sx.selectByVisibleText("Delivered");
		//		driver.findElement(By.name("remark")).sendKeys("happily deleverd");
		//		driver.findElement(By.name("submit2")).click();
		//		Alert a1 = driver.switchTo().alert();
		//		a1.accept();
		//		driver.get("http://rmgtestingserver/domain/Online_Shopping_Application");
		//		driver.findElement(By.xpath("//a[text()='Login']")).click();
		//		driver.findElement(By.id("exampleInputEmail1")).sendKeys("kee@gmail.com");
		//		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123");
		//		driver.findElement(By.xpath("//button[text()='Login']")).click();
		//		driver.findElement(By.xpath("//span[text()='Track Order']")).click();
		//		driver.findElement(By.id("exampleOrderId1")).sendKeys("34");
		//		driver.findElement(By.id("exampleBillingEmail1")).sendKeys("kee@gmail.com");
		//		driver.findElement(By.name("submit")).click();
		//		driver.findElement(By.xpath("//a[contains(text(),'Track')]")).click();
		//		
		//
	}

}

