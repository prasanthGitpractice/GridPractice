package programsOnString;

import org.testng.annotations.Test;

public class UniqueCharactersInString 
{
	@Test
	public void uniqueCharactersInString()
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
				else if(s.charAt(i)==s.charAt(j))
					count++;
			}
			
			if(count==1)
			{
				System.out.println(s.charAt(i)+" is Unique Character in String");
			}
		
		}
	}
}
