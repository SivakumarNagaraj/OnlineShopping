package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Makemytrip 
{


public static void main(String[] args) throws InterruptedException, AWTException
{
  WebDriverManager.chromedriver().setup();
  String Fromcity = "Mumbai";
  String Tocity = "Bengaluru";
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.makemytrip.com/");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.findElement(By.xpath("//span[.='From']")).click();
  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Fromcity);
  driver.findElement(By.xpath("//p[.='Mumbai, India']")).click();
  driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Tocity);
  Robot rot = new Robot();
  rot.keyPress(KeyEvent.VK_TAB);
  driver.findElement(By.xpath("//a[.='Search']")).click();
  }
}
