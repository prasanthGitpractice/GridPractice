package scenario;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FullPageScrolling 
{
	public static void main(String[] args) 
	{
		// Create an instance of ChromeDriver
	     WebDriver driver = new ChromeDriver();

	     // Navigate to the desired web page
	     driver.get("https://amazon.in");

	     // Perform full-page scrolling using JavaScript
	     JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	     //Scoll top to Bottom
	     jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	     //Scroll Left to Right
	     //jsExecutor.executeScript("window.scrollTo(document.body.scrollWidth, 0)");

	     // Alternatively, you can scroll by a specific number of pixels
	     // jsExecutor.executeScript("window.scrollBy(0, 500)");

	     // Close the browser
	     //driver.quit();
	}
	
	
	public static void name() {
		
	}

}
