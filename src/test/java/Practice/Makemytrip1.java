package Practice;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Makemytrip1 {
	List<WebElement> fname;
	List<WebElement> fcode;
	List<WebElement> fdistime;
	List<WebElement> fdisplace;
	List<WebElement> flantime;
	List<WebElement> flanplace;
	String name;
	String dtime;
	String ltime;

	@Test
	public void mytrip() throws AWTException, InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException
	{
		
		WebDriverManager.chromedriver().setup();
		String Fromcity = "Bengaluru";
		String Tocity = "Mumbai";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[.='Search']")).click();
		driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter City']")).sendKeys(Fromcity);
		driver.findElement(By.xpath("//span[.='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter City']")).sendKeys(Tocity);
		driver.findElement(By.xpath("//span[.='BOM']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='December 2022']/ancestor::div[@class='DayPicker-Month']/descendant::div[@tabindex='0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Select Return']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='December 2022']/ancestor::div[@class='DayPicker-Month']/descendant::div[@tabindex='0']/following-sibling::div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='SEARCH']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[.='Popular Filters']/following-sibling::div/descendant::span[@class='linkText pointer']")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//p[.='Popular Filters']/following-sibling::div/descendant::span[@class='filterName']"));

		int count=0;
		for (WebElement ele : elements) {
			String element = ele.getText();
			int n = 0;
			for (int i = 0; i < element.length(); i++) {
				int num = element.charAt(i)-48;
				if (num>=0 && num<=10) {
					 n = n*10+num;
					}
				}
			 if (n<=10) {
				 count=count+n;
				 ele.click();
				 System.out.println(element);
				 Thread.sleep(3000);
			}
		}
		for (int i = 0; i < 3; i++) {
			 fname = driver.findElements(By.xpath("//span[@class='boldFont blackText']"));
			 fdistime = driver.findElements(By.xpath("//p[@class='appendBottom2 flightTimeInfo']/parent::div[@class='flexOne timeInfoLeft']"));
			 flantime = driver.findElements(By.xpath("//p[@class='appendBottom2 flightTimeInfo']/parent::div[@class='flexOne timeInfoRight']"));
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(3000);
		}
		Workbook book = WorkbookFactory.create(new FileInputStream("src/test/resources/Testdata.xlsx"));
		Sheet sheet = book.getSheet("MakemyTrip");
//		for (int j = 0; j <= fname.size(); j++) {
//				
//			for (WebElement element : fname) {
//				 name = element.getText();
//			}
//			for (WebElement element : fdistime) {
//				 dtime = element.getText();
//		    }
//			for (WebElement element : flantime) {
//				 ltime = element.getText();
//			}
//			System.out.println(name+" "+ dtime+" "+ltime);
//		}
		for (int i = 1; i <=fname.size(); i++) {
			Row row = sheet.createRow(i);
				row.createCell(0).setCellValue(fname.get(i-1).getText());
				//row.createCell(1).setCellValue(fcode.get(i-1).getText());
				row.createCell(2).setCellValue(fdistime.get(i-1).getText());
				//row.createCell(3).setCellValue(fdisplace.get(i-1).getText());
				row.createCell(4).setCellValue(flantime.get(i-1).getText());
				//row.createCell(5).setCellValue(flanplace.get(i-1).getText());
				book.write(new FileOutputStream("src/test/resources/Testdata.xlsx"));

			}
		driver.close();
		driver.quit();

	}
	}
