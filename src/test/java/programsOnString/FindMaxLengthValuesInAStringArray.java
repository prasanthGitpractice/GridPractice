package programsOnString;

import org.testng.annotations.Test;

public class FindMaxLengthValuesInAStringArray 
{
	@Test
	public void findMaxLengthValuesInAStringArray()
	{
		String[] s= {"ab", "abc", "abcd", "ef", "edcf"};
		int maxLength=s[0].length();

		for(int i=1; i<s.length;i++)
		{
			if(s[i].length()>maxLength)
			{
				maxLength=s[i].length();
			}
		}
		for(int i=0; i<s.length;i++)
		{
			if(s[i].length()==maxLength)
				System.out.print(s[i]+" ");
		}
		System.out.println();
	}
	
	
	@Test
	public void findMaxLengthValuesInAStringArray1()
	{
		String[] s= {"12", "123", "1234", "45", "6789"};
		int maxLength=s[0].length();

		for(int i=1; i<s.length;i++)
		{
			if(s[i].length()>maxLength)
			{
				maxLength=s[i].length();
			}
		}
		for(int i=0; i<s.length;i++)
		{
			if(s[i].length()==maxLength)
				System.out.print(s[i]+" ");
		}
		System.out.println();
	}
}
