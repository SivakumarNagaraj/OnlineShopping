package TestNG;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteExecution {
	@Test
	public void remotedrievr() throws MalformedURLException, InterruptedException {
		URL url = new URL("http://192.168.43.69:4444/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("chrome");
		
		WebDriver driver=new RemoteWebDriver(url, cap);

		driver.get("https://facebook.com");
		Thread.sleep(5000);
		driver.quit();
	}

}
