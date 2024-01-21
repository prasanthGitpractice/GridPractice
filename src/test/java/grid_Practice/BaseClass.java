package grid_Practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	RemoteWebDriver driver;
	
	@Parameters("BROWSER")
	@BeforeClass
	public void config_BC(String BROWSER) throws MalformedURLException
	{
		URL url=new URL("http://192.168.117.66:4444/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		driver=new RemoteWebDriver(url, cap);
	}
}
