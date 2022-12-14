package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
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

public class Makemytrip {
	List<WebElement> fname;
	List<WebElement> fcode;
	List<WebElement> fdistime;
	List<WebElement> fdisplace;
	List<WebElement> flantime;
	List<WebElement> flanplace;

	@Test
	public void mytrip() throws AWTException, InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException
	{
		
		WebDriverManager.chromedriver().setup();
		String Fromcity = "Bengaluru";
		String Tocity = "Chennai";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[.='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Fromcity);
		driver.findElement(By.xpath("//div[.='BLR']")).click();
		driver.findElement(By.xpath("//span[.='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Tocity);
		driver.findElement(By.xpath("//div[.='MAA']")).click();
		//driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();
		//driver.findElement(By.xpath(""))
		//driver.findElement(By.xpath("//div[@class='DayPicker']/descendant::div[@class='DayPicker-Day DayPicker-Day--selected DayPicker-Day--today']")).click();
		driver.findElement(By.xpath("//a[.='Search']")).click();
		driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
		driver.findElement(By.xpath("//span[@class='linkText pointer']")).click();
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
				 //System.out.println(element);
			}
		}
		Thread.sleep(5000);
		Workbook book = WorkbookFactory.create(new FileInputStream("src/test/resources/Testdata.xlsx"));
		Sheet sheet = book.getSheet("MakemyTrip");
		for (int i = 0; i < 3; i++) {
			 fname = driver.findElements(By.xpath("//div[@class='makeFlex simpleow']/descendant::p[@class='boldFont blackText airlineName']"));
			 fcode = driver.findElements(By.xpath("//div[@class='makeFlex simpleow']/descendant::p[@class='fliCode']"));
			 fdistime = driver.findElements(By.xpath("//div[@class='makeFlex simpleow']/descendant::div[@class='flexOne timeInfoLeft']/p[@class='appendBottom2 flightTimeInfo']"));
			 fdisplace = driver.findElements(By.xpath("//div[@class='makeFlex simpleow']/descendant::div[@class='flexOne timeInfoLeft']/p[@class='blackText']"));
			 flantime = driver.findElements(By.xpath("//div[@class='makeFlex simpleow']/descendant::div[@class='flexOne timeInfoRight']/p[@class='appendBottom2 flightTimeInfo']"));
			 flanplace = driver.findElements(By.xpath("//div[@class='makeFlex simpleow']/descendant::div[@class='flexOne timeInfoRight']/p[@class='blackText']"));
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(3000);
		}
		System.out.println(count);
		for (int i = 1; i <=fname.size(); i++) {
			Row row = sheet.createRow(i);
				row.createCell(0).setCellValue(fname.get(i-1).getText());
				row.createCell(1).setCellValue(fcode.get(i-1).getText());
				row.createCell(2).setCellValue(fdistime.get(i-1).getText());
				row.createCell(3).setCellValue(fdisplace.get(i-1).getText());
				row.createCell(4).setCellValue(flantime.get(i-1).getText());
				row.createCell(5).setCellValue(flanplace.get(i-1).getText());
				book.write(new FileOutputStream("src/test/resources/Testdata.xlsx"));

			}
		book.close();
		driver.quit();

	}
}
