package Practice;

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

public class BookMyShow {
	@Test
	public void book() throws EncryptedDocumentException, FileNotFoundException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[.='Bengaluru']")).click();
		driver.findElement(By.xpath("//span[.='Search for Movies, Events, Plays, Sports and Activities']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")).sendKeys("gold");
		driver.findElement(By.xpath("//ul[@class='sc-sPYgB gVUFKz']/descendant::li[@class='sc-gJqsIT jMjMYb']/descendant::span")).click();
		driver.findElement(By.xpath("//div[@class='styles__EventInformationContainer-sc-qswwm9-5 kqaQef']/descendant::button[@data-phase='postRelease']")).click();
		driver.findElement(By.xpath("//button[.='Not Now']")).click();
		List<WebElement> tnames = driver.findElements(By.xpath("//ul[@id='venuelist']/descendant::div[@class='__title']"));
		List<WebElement> ttimes = driver.findElements(By.xpath("//ul[@id='venuelist']/descendant::div[@class='showtime-pill-wrapper']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Workbook book = WorkbookFactory.create(new FileInputStream("src/test/resources/Testdata.xlsx"));
		Sheet sheet = book.getSheet("BookMyShow");
		for (int i = 1; i <=tnames.size(); i++) {
			Row row = sheet.createRow(i);
				row.createCell(0).setCellValue(tnames.get(i-1).getText());
				row.createCell(1).setCellValue(ttimes.get(i-1).getText());
				book.write(new FileOutputStream("src/test/resources/Testdata.xlsx"));

			}
		book.close();
		driver.quit();
	}

}
