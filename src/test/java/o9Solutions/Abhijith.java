package o9Solutions;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Abhijith 
{
	@Test
	public void BrowserVersion()
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

		Capabilities c = ((RemoteWebDriver)driver).getCapabilities();
		String browsername = c.getBrowserName();
		String browserversion = c.getBrowserVersion();

		System.out.println(browsername);
		System.out.println(browserversion);
		driver.navigate().to("https://www.facebook.com");

	}

	//String contains vowels or not
	@Test
	public void ContainsVowelOrNot()
	{
		String s="aeiou";
		String f="education is my right aeiou";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<f.length();j++)
			{
				if(s.charAt(i)==f.charAt(j))
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}

	//print first 40 even numbers
	@Test
	public void PrintFirst40EvenNumbers()
	{
		int n=2;
		boolean flag=true;
		int count=0;

		for(int i=n;flag;i++)
		{
			if(i%2==0)
			{
				count++;
				System.out.println("even nos--->"+i);
			}
			if(count==40)
			{
				break;
			}
		}
	}
	//print prime numbers in range
	@Test
	public void RangingprimeNumbers()
	{
		int n=100;


		for(int i=1;i<n;i++)
		{
			boolean flag=false;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
			if(!flag && i!=1)
			{

				System.out.println(i);
			}

		}


	}

}
