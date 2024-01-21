package programsOnString;

import org.testng.annotations.Test;

public class String_Palindrome 
{
	
	@Test
	public void string_Palindrome()
	{
		String s="amma";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(s.equals(rev))
		{
			System.out.println(s+" is palindrome string");
		}
		else
			System.out.println(s+" is not a palindrome String");
	}	
}
