package grid_Practice;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid_SingleNodeTest 
{
RemoteWebDriver driver;
	
	@Test
	public void m1Test() throws Throwable
	{
		URL url=new URL("http://192.168.117.66:4444/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		driver=new RemoteWebDriver(url, cap);
		
		driver.get("https://www.amazon.in");
	}
}
