package programsOnString;

import org.testng.annotations.Test;

public class StringManipulation 
{
	@Test
	public void method()
	{
		String s="o9#sol^ut#io$n&s";
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");
		int count = s1.length()-1;
		System.out.println(count);
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a'&& s.charAt(i)<='z')
			{
				System.out.print(s1.charAt(count--));
			}
			else
			{
				System.out.print(s.charAt(i));
			}
			
		}
		System.out.println();
	}
}
