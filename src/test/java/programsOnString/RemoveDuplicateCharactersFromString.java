package programsOnString;

import org.testng.annotations.Test;

public class RemoveDuplicateCharactersFromString
{
	@Test
	public void removeDuplicateCharactersFromString()
	{
		String s="selenium";
        String req="";
        for(int i=0;i<s.length(); i++)
        {
            int count=0;
            for(int j=0; j<s.length(); j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    if(i>j)
                        break;
                    else
                        count++;
                }
            }
            if(count>=1)
                req=req+s.charAt(i);
        }
        System.out.println(req);
	}
}
