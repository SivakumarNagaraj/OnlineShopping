package Testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_1
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		//Launch the browser
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
		driver.findElement(By.xpath("//h2[.='Shopping Portal']")).click();
		driver.findElement(By.xpath("//input[@class='search-field']")).click();
		driver.findElement(By.xpath("//input[@class='search-field']")).sendKeys("Apple Iphone 6");
		driver.findElement(By.xpath("//button[@name='search']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[@title='Wishlist']")).click();
		Thread.sleep(7000);
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
		driver.quit();

	}
}
