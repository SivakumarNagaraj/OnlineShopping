package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketLiveScroe {

	@Test
	public void cricket() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=cricketlive&rlz=1C1RXQR_enIN1020IN1020&oq=cricketlive&aqs=chrome..69i57j0i10i512l3j0i512j0i10i512l4.12490j1j9&sourceid=chrome&ie=UTF-8");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[.='ODI 106 of 114']/..//div[@class='imso_mh__ls-txt imso-ani']/div")).click();
		WebElement ele = driver.findElement(By.xpath("//div[.='PNG batting']/..//div[2]/span"));
		
			String name = ele.getText();
			System.out.println(name);
		Thread.sleep(5000);
		driver.quit();
	}
}
