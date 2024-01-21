package o9Solutions;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pooja_BrokenAndCollectionAnd110609 
{
	@Test
	public void loginusingsndkeys() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		// driver.findElement(By.name("email")).sendKeys("poojitaguram16@gmail.com");==>1
		// WebElement email = driver.findElement(By.name("email"));==>2
		// email.sendKeys("poojitaguram16@gmail.com");
		driver.findElement(By.name("email")).sendKeys("poojitaguram16@gmail.com" ,Keys.TAB,"poojita15",Keys.ENTER);

	}
	@Test
	public void pallindromeusinglinkedlist() {
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("dog");
		ls.add("cat");
		ls.add("dog");
		LinkedList<String> ls1 = new LinkedList<String>();
		for(int i=ls.size()-1;i>=0;i--)
		{
			String e = ls.get(i);
			ls1.add(e);
		}
		System.out.println(ls.equals(ls1));
	}
	@Test
	public void numberoflinktextboxdropdown() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.facebook.com/");
		List<WebElement> wbe = driver.findElements(By.xpath("//*"));
		int link=0;
		int textbox=0;
		int dropdown=0;
		for (WebElement ele : wbe) {
			if(ele.getTagName().equals("a"))
			{
				link++;
			}
			if(ele.getTagName().equals("input"))
			{
				textbox++;
			}
			if(ele.getTagName().equals("select"))
			{
				dropdown++;
			}
		}
		System.out.println(link);
		System.out.println(textbox);
		System.out.println(dropdown);

	}
	@Test
	public void submit()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.xpath("//textarea[@aria-label='Search']"));
		search.sendKeys("virat");
		search.submit();
	}

	///broken link

	public void brokenLinks() throws Throwable
	{
		//launch browser
		WebDriver driver=new ChromeDriver();

		//maximize browser
		driver.manage().window().maximize();

		//enter url
		driver.get("https://www.ksrtc.in/oprs-web/");

		// wait for page to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

		//find all the links
		List<WebElement> Alllinks = driver.findElements(By.xpath("//a"));
		ArrayList<String> Arraylinks = new ArrayList<String>();
		System.out.println(Alllinks.size());
		// for each loop
		for (WebElement webElement : Alllinks) {
			String eachlink = webElement.getAttribute("href");
			URL url=null;
			int statuscode=0;
			try {
				url = new URL(eachlink);
				HttpURLConnection httpurlconn = (HttpURLConnection) url.openConnection();
				statuscode = httpurlconn.getResponseCode();

				if(statuscode>=400) {
					Arraylinks.add(eachlink);
					System.out.println(eachlink +"----->"+ statuscode);
					System.out.println("it is broken link");
				}

			}

			catch (MalformedURLException exp) {

			}


		}

	}

}

