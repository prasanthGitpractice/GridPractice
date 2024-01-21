package programsOnString;

import org.testng.annotations.Test;

public class StringActions
{
	@Test
	public void characterAndItsOccuranceInAString3()
	{
		String s="my$ na%me is$ %prak@sh"; //O/p: ym$ em%an si$ %hska@rp
		String[] s2 = s.split(" ");
		String s_n = s.replaceAll("[^a-zA-Z0-9\\s]", "");
		System.out.println(s.replaceAll("[^a-zA-Z0-9\\s]", ""));
		String s1[] = s_n.split(" ");
		
	
		for(int i=0; i<s1.length; i++)
		{
			int count=s1[i].length()-1;
			for(int j=0; j<s2[i].length(); j++)
			{
				if(!((s2[i].charAt(j)>='a' && s2[i].charAt(j)<='z') || (s2[i].charAt(j)>='A' && s2[i].charAt(j)<='Z')))
				{
					System.out.print(s2[i].charAt(j));
				
				}
				else
				{
					System.out.print(s1[i].charAt(count--));
				}
			
			}
			System.out.print(" ");
		}
		System.out.println();
	}
	
	
	@Test
	public void characterAndItsOccuranceInAString2()
	{
		String s="I Love Tyss"; //O/p: s syTe voLI
		String s1 = s.replaceAll(" ", "");
		int count = s1.length()-1;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)!=' ')
				System.out.print(s1.charAt(count--));
			else
				System.out.print(s.charAt(i));
		}
		System.out.println();
	}
	
	
	@Test
	public void characterAndItsOccuranceInAString1()
	{
		String s="aabbabc"; //O/p: a2b2a1b1c1
		String sreq="";
		int count=1;
		for(int i=0; i<s.length()-1; i++)
		{
			if(s.charAt(i)==s.charAt(i+1))   
			{                               
				count++;                    
			}                               
			else                              
			{                                   
				sreq=sreq+s.charAt(i)+count;
				//System.out.print(s.charAt(i)+count );
				count=1;
			}
		}
		sreq=sreq+s.charAt(s.length()-1)+count;
		System.out.println(sreq);
		//System.out.print(s.charAt(s.length()-1)+count);
		
	}
	
	// length of String without length and length()
	//@Test
	public void lengthOfStringWithoutLength() // without length variable and method
	{										  // length is a final variable 
		String s="tester";
		char[] c= s.toCharArray();
		int length=0;
		for(char c1:c)
		{
			length++;
		}
		System.out.println(length);
	}
}
