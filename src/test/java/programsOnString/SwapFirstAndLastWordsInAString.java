package programsOnString;

import org.testng.annotations.Test;

public class SwapFirstAndLastWordsInAString
{
	@Test
	public void swapFirstAndLastWordsInAString()
	{
		String s="i am software engineer";		
		String[] s1 = s.split(" ");
		String temp=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		for(int i=0; i<=s1.length-1; i++)
		{
			System.out.print(s1[i]+" ");
		}
		System.out.println();
	}
	
				//(OR)
	
	@Test
	public void swapFirstAndLastWordsInAString1()
	{
		String s="i am software engineer";
		String rev="";
		String[] s1 = s.split(" ");
		
		for(int i=0; i<=s1.length-1; i++)
		{
			if(i==0)
			{
				rev=rev+s1[s1.length-1]+" ";
			}
			else if(i==s1.length-1)
			{
				rev=rev+s1[0]+" ";
			}
			else
			{
				rev=rev+s1[i]+" ";
			}
		}
		System.out.println(rev);
		System.out.println();
	}
}
