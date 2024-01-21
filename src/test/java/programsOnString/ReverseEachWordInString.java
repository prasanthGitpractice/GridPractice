package programsOnString;

import org.testng.annotations.Test;

public class ReverseEachWordInString 
{
	@Test
	public void reverseEachWordInString()
	{
		String s="my name is kiran";
        String[] a= s.split(" ");
        String req="";
        
        for(int i=0; i<a.length;i++)
        {
            for(int j=a[i].length()-1; j>=0; j--)
            {
                req=req+a[i].charAt(j);
            }
            req=req+" ";
        }
        System.out.println(req);
	}
}
