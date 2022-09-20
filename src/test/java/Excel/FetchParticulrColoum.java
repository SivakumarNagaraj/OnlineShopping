package Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchParticulrColoum
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 FileInputStream fis=new FileInputStream("src/test/resources/Testdata.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sheet = wb.getSheet("Credentials");
	 String Url = sheet.getRow(1).getCell(2).getStringCellValue();
	 String Userid = sheet.getRow(2).getCell(2).getStringCellValue();
	 String Password = sheet.getRow(3).getCell(2).getStringCellValue();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get(Url);
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Userid);
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
	 driver.findElement(By.xpath("//button[.='Login']")).click();
	 driver.findElement(By.xpath("//a[.=' Create Category ']")).click();
	 List<WebElement> ele = driver.findElements(By.xpath("//table[@id='DataTables_Table_0']/thead/tr/th"));
for (WebElement webElement : ele) 
{
	String Text = webElement.getText();
	if (Text.equals("Category")) 
		{
			List<WebElement> items = driver.findElements(By.xpath("//table//tbody/tr/td[2]"));
				for (WebElement webElement2 : items) 
				{
					String Test1 = webElement2.getText();
					System.out.println(Test1);
				}			
		}
	}
	 
	 
	 

	 
}
}
//	System.out.println(sheet.getRow(1).getCell(2));
//String s = webElement.getText();
//System.out.println(s);