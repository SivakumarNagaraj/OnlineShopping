package PracticeScripts;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	@Test
	public void Test1() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.xpath("//div[.='Electronics']"));
//			String expelement = driver.findElements(By.xpath("//div[.='Electronics']")).getText();
//		for (WebElement webElement : element) {
//			if (webElement.equals("Electronics")) {
//				act.moveToElement(webElement).perform();
//			break;
//		}
//	}
//		Thread.sleep(8000);
		act.moveToElement(element).perform();
		driver.findElement(By.xpath("//a[.='Gaming']")).click();

		driver.findElement(By.xpath("//a[.='TECHON  TV-out Cable Hdmi To Vga Converter Adapter Cabl...']")).click();
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			driver.switchTo().window(window);
		}
		WebElement pname = driver.findElement(By.xpath("//span[@class='B_NuCI']"));
		String name = pname.getText();
		System.out.println("Product name is "+name);
		String pprice = driver.findElement(By.xpath("//div[@class='aMaAEs']/div[last()]/div/div/div")).getText();
		System.out.println("Product price is "+pprice);
		driver.quit();
	}
}
