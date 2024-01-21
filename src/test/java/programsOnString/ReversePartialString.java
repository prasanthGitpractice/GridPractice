package programsOnString;

import org.testng.annotations.Test;

public class ReversePartialString 
{
	@Test
	public void reversePartialString()
	{
		String s="i am software engineer"; //O/p: engineer erawtfos 
		String rev="";
		
		String[] s1 = s.split(" ");
		int index = s1.length-2;
		for(int i=s1.length-1; i>=0; i--)
		{
			String s2=s1[i];
			if(i>=index)
			{
				if(i==s1.length-1)
				{
					rev=rev+s1[i]+" ";
				}
				else
				{
					for(int j=s2.length()-1; j>=0; j--)
					{
						rev=rev+s2.charAt(j);
					}
					rev=rev+" ";
				}
			}
		}
		System.out.println(rev);	
	}
}
