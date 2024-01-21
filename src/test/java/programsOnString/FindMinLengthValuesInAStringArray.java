package programsOnString;

import org.testng.annotations.Test;

public class FindMinLengthValuesInAStringArray 
{
	@Test
	public void findMinLengthValuesInAStringArray()
	{
		String[] s= {"ab", "abc", "abcd", "ef", "edcf"};
		int minLength=s[0].length();

		for(int i=1; i<s.length;i++)
		{
			if(s[i].length()<minLength)
			{
				minLength=s[i].length();
			}
		}
		for(int i=0; i<s.length;i++)
		{
			if(s[i].length()==minLength)
				System.out.print(s[i]+" ");
		}
		System.out.println();
	}
	
	
	@Test
	public void findMinLengthValuesInAStringArray1()
	{
		String[] s= {"12", "123", "1234", "45", "6789"};
		int minLength=s[0].length();

		for(int i=1; i<s.length;i++)
		{
			if(s[i].length()<minLength)
			{
				minLength=s[i].length();
			}
		}
		for(int i=0; i<s.length;i++)
		{
			if(s[i].length()==minLength)
				System.out.print(s[i]+" ");
		}
		System.out.println();
	}
	
	
}
