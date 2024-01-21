package com.GenericUtils;

import java.net.URL;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass_HRM_EPS 
{
	public ThreadLocal<WebDriver> tl=new ThreadLocal<WebDriver>();
	public WebDriver driver;
	
	public ThreadLocal<DesiredCapabilities> dc=new ThreadLocal<DesiredCapabilities>();
	public DesiredCapabilities cap;
	
	public WebDriverWait wait=null;
	//String browser ="firefox";
	
	public WebDriver getWebDriver()
	{
		return tl.get();
	}
	public void setWebDriver(WebDriver driver)
	{
		tl.set(driver);
	}
	
	public DesiredCapabilities getDesiredCapabilities()
	{
		return dc.get();
	}
	public void setDesiredCapabilities(DesiredCapabilities cap)
	{
		dc.set(cap);
	}
	
	
	
	
	@BeforeSuite
	public void bsConfig()
	{
		System.out.println("Before Suit");
	}
	
	@Parameters("browser")
	@BeforeClass
	//public void bcConfig() throws Throwable
	public void bcConfig(String browser) throws Throwable
	{
		Date d=new Date();
		System.out.println(browser+" "+d.toString());
		
		
		URL url=new URL("http://192.168.60.66:4444/wd/hub");
		
		if(browser.equals("chrome"))//webdriver.chrome.driver
		{
			cap=new DesiredCapabilities();
			setDesiredCapabilities(cap);
			getDesiredCapabilities().setPlatform(Platform.ANY);
			getDesiredCapabilities().setBrowserName("chrome");
			
			ChromeOptions options=new ChromeOptions();
			options.merge(getDesiredCapabilities());
		}
		else if(browser.equals("firefox"))//webdriver.gecko.driver
		{
			cap=new DesiredCapabilities();
			setDesiredCapabilities(cap);
			getDesiredCapabilities().setPlatform(Platform.ANY);
			getDesiredCapabilities().setBrowserName("firefox");
			
			FirefoxOptions options = new FirefoxOptions();
			options.merge(getDesiredCapabilities());
		}
		else if(browser.equals("MicrosoftEdge"))
		{
			cap=new DesiredCapabilities();
			setDesiredCapabilities(cap);
			getDesiredCapabilities().setPlatform(Platform.WINDOWS);
			getDesiredCapabilities().setBrowserName("MicrosoftEdge");
			
			EdgeOptions options=new EdgeOptions();
			options.merge(getDesiredCapabilities());
		}
		else
		{
			System.out.println("Enter Valid Browser Name");
		}
		
		
		driver=new RemoteWebDriver(url, cap);
		setWebDriver(driver);
		
		getWebDriver().get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Before class");
		
		getWebDriver().manage().window().maximize();
		getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait=new WebDriverWait(getWebDriver(), Duration.ofSeconds(30));
	}
	
	/*@Parameters("browser")
	@BeforeClass
	//public void bcConfig() throws Throwable
	public void bcConfig(String browser) throws Throwable
	{
		URL url=new URL("http://192.168.0.17:4444/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
		
		if(browser.equalsIgnoreCase("chrome"))//webdriver.chrome.driver
		{
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(browser.equalsIgnoreCase("firefox"))//webdriver.gecko.driver
		{
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(browser.equalsIgnoreCase("MicrosoftEdge"))
		{
			cap.setBrowserName("MicrosoftEdge");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
		{
			System.out.println("Enter Valid Browser Name");
		}
		
		driver=new RemoteWebDriver(url, cap);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Before class");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	*/
	
	@BeforeMethod
	public void bmConfig()
	{
		//login
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("username")))).sendKeys("Admin");;
		getWebDriver().findElement(By.name("password")).sendKeys("admin123");
		getWebDriver().findElement(By.xpath("//button[@type='submit']")).submit();
		
		System.out.println("Before method");
	}
	@AfterMethod
	public void amConfig()
	{
		//logout
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")))).click();
		getWebDriver().findElement(By.xpath("//a[text()='Logout']")).click();
		
		System.out.println("after method");
	}
	@AfterClass
	public void acConfig()
	{
		getWebDriver().quit();
		System.out.println("after class");
	}
	@AfterSuite
	public void asConfig()
	{
		System.out.println("after Suit");
	}
	
	@DataProvider(parallel = true)
	public Object[][] getData()
	{
		Object[][] data=new  Object[2][1];
		
		data[0][0]="chrome";
		data[1][0]="firefox";
		
		return data;
	}
}