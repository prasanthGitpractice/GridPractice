package programsOnString;

import org.testng.annotations.Test;

public class ReversWholeString 
{
	@Test
	public void reversWholeString()
	{
		String s="i am software engineer"; //O/p: i ma erawtfos reenigne
		String rev="";
		
		String[] s1 = s.split(" ");
		
		for(int i=0; i<s1.length; i++)
		{
			String s2=s1[i];
			for(int j=s2.length()-1; j>=0; j--)
			{
				rev=rev+s2.charAt(j);
			}
			rev=rev+" ";
		}
		System.out.println(rev);
		
	}
}
