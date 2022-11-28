package Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
@Test
public void broken() throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	List<WebElement> elements = driver.findElements(By.xpath("//a"));
	for(WebElement element:elements)
	{
		String link = element.getAttribute("href");
		URL url=new URL(link);
		URLConnection urlConnection = url.openConnection();
		HttpURLConnection httpurlconnection = (HttpURLConnection)urlConnection;
		int code = httpurlconnection.getResponseCode();
		if(code!=200)
		{
			System.out.println(code+"====>"+link);
		}	
	}		
}
}
