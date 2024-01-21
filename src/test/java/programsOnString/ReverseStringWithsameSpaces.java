package programsOnString;

import org.testng.annotations.Test;

public class ReverseStringWithsameSpaces 
{
	@Test
	public void reverseStringWithsameSpaces()
	{
		String s="I Love India";
        String s1=s.replaceAll(" ","");
        int count=s1.length()-1;
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==' ')
                System.out.print(" ");
            else
                System.out.print(s1.charAt(count--));
        }
        System.out.println();
	}
}
