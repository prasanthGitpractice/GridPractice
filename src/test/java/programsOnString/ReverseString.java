package programsOnString;

import org.testng.annotations.Test;

public class ReverseString 
{
	@Test
	public void reverseStringWay1()
	{
		String s="Pavi";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	
	@Test
	public void reverseStringWay2()
	{
		String s="Pavi";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
	
	@Test
	public void reverseStringWay3()
	{
		String s="Pavi";
		
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
	}
	
	@Test
	public void reverseStringWay4()
	{
		String s="Pavi";
		char[] c= s.toCharArray();
		for(int i=c.length-1; i>=0; i--)
		{
			System.out.print(c[i]);
		}
		System.out.println();
	}
	
	@Test
	public void reverseStringWay5()
	{
		String s="Pavi";
		int maxIndex=s.length()-1;
		reverse(s, maxIndex);
		System.out.println();
	}
	
	//Generice method to reverse a String
	public void reverse(String s, int maxIndex)
	{
		if(maxIndex>=0)
		{
			System.out.print(s.charAt(maxIndex));
			maxIndex--;
			reverse(s, maxIndex);
		}
	}
}
