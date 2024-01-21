package programsOnString;

import org.testng.annotations.Test;

public class ReverseStringPrintNumbersWithSpace 
{	
	@Test
	public void reverseStringPrintNumbersWithSpace()
	{
		String s="Aabb1235dd45ee1ff44"; //o/p: 44 1 45 1235
		String s_num = s.replaceAll("[a-zA-Z]", " ");
		String[] a_s = s_num.split(" ");
		System.out.println(s_num);
		
		for(int i=a_s.length-1; i>=0; i--)
		{
			System.out.print(a_s[i]+" ");
		}
		System.out.println();
	}
}
