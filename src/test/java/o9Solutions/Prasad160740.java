package o9Solutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Prasad160740 
{
	//prgrm to reverse the String
	@Test
	public void reverseString()
	{
		String s="testyantra";
		String rev="";
		for (int i = 0; i < s.length(); i++) {
			rev=rev+s.charAt(s.length()-1-i);
		}
		System.out.print(rev);
	}


	//prgrm for Ocuurance
	@Test
	public void OccuranceOfWord()
	{
		String s="javaseleniumeclipsejavatestjava";
		int count=0;
		for (int i = 0; i < s.length()-3; i++) {
			if (s.substring(i, i+4).equals("java")) {
				count++;
			}
		}
		System.out.println(count);
	}

	//prgrm
	@Test
	public void pairIsgreaterthan11()
	{
		int [] a= {2,3,4,5,6,7,8};

		int count=0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]+a[j]>=11)
				{
					count++;
					System.out.println("Pair is Greater than 11 are-->"+a[i]+", "+a[j]);
				}
			}
		}
		System.out.println("the total no is--> "+count);
	}

	//script
	@Test
	public void incognitoChrome()
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://amazon.in");
	}
}
