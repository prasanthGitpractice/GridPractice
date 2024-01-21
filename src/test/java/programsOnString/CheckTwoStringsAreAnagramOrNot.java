package programsOnString;

import java.util.Arrays;

import org.testng.annotations.Test;

public class CheckTwoStringsAreAnagramOrNot 
{
	@Test
	public void checkTwoStringsAreAnagramOrNot()
	{
		String s1="Race";
		String s2="Care";
		
		String str1 = s1.toLowerCase();
		String str2 = s2.toLowerCase();
		
		if(s1.length()==s2.length())
		{
			
			char[] str1Arr = str1.toCharArray();
			char[] str2Arr = str2.toCharArray();
			
			Arrays.sort(str1Arr);
			Arrays.sort(str2Arr);
			
			boolean result = Arrays.equals(str1Arr, str2Arr);
			
			if(result)
			{
				System.out.println(str1+" and "+str2+" are anagram");
			}
			else
			{
				System.out.println(str1+" and "+str2+" are not anagram");
			}

		}
		else
		{
			System.out.println(str1+" and "+str2+" are not anagram");
		}
		
	}
}
