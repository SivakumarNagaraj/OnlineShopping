package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus1 {

	@Test
	
	public void red() throws InterruptedException, AWTException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Robot rb = new Robot();
	driver.get("https://www.redbus.in/bus-tickets");
	driver.findElement(By.xpath("//input[@placeholder='FROM']")).sendKeys("Bengaluru");
	Thread.sleep(2000);
	rb.keyPress(KeyEvent.VK_TAB);
	rb.keyRelease(KeyEvent.VK_TAB);
	driver.findElement(By.xpath("//input[@placeholder='TO']")).sendKeys("Dindigul");
	Thread.sleep(2000);
	rb.keyPress(KeyEvent.VK_TAB);
	rb.keyRelease(KeyEvent.VK_TAB);
	driver.findElement(By.xpath("//input[@placeholder='ONWARD DATE']")).sendKeys("24-Nov-2022");
	Thread.sleep(2000);
	rb.keyPress(KeyEvent.VK_TAB);
	rb.keyRelease(KeyEvent.VK_TAB);
	driver.findElement(By.xpath("//button")).click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Thread.sleep(5000);
	String nobus = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
	for (int i = 0; i < 6; i++) {
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='result-section']/descendant::div[@class='travels lh-24 f-bold d-color'] | //div[@id='result-section']/descendant::div[@class='dp-time f-19 d-color f-bold']"));
		js.executeScript("window.scrollBy(0,800)");	
		Thread.sleep(5000);
		for (WebElement webElement : ele) {
			String name = webElement.getText();
			System.out.print(name);
			System.out.println();
		}
	}
	
		
	driver.quit();
	
	
}

}
