package programsOnString;

import org.testng.annotations.Test;

public class DuplicateCharactersInString 
{
	@Test
	public void duplicateCharactersInString()
	{
		String s1="tester";
		String s = s1.toLowerCase();
		for(int i=0; i<s.length(); i++)
		{
			int count=0;
			for(int j=0; j<s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j) && i>j)
					break;
				if(s.charAt(i)==s.charAt(j))
					count++;
			}
			
			if(count>1)
			{
				System.out.println(s.charAt(i)+" is having Duplicate Character in String");
			}
		
		}
	}
}
