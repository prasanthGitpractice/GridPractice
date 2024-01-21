package programsOnString;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PrintDifferentCharactersInSeperateLine
{
	@Test
	public void method()
	{
		String s= "aaabbaccddeeffa";
		for(int i=0; i<s.length()-1; i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				System.out.print(s.charAt(i));
			}
			else
			{
				System.out.print(s.charAt(i));
				System.out.println();
				System.out.println();
			}
		}
		System.out.print(s.charAt(s.length()-1));
		System.out.println();
		
	}
}
