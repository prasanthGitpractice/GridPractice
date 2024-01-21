package programsOnString;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class NoOfVowelsWithoutDuplicates 
{
	@Test
	public void noOfVowelsWithoutDuplicates()
	{
		String s1="india";
		String s = s1.toLowerCase();
		String vowel="";
		int noOFUniqueVowel=0;
		
		for(int i=0; i<s.length(); i++)
		{
			int count=0;
			for(int j=0; j<s.length(); j++)
			{
				if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u')
				{
					if(s.charAt(i)==s.charAt(j))
					{
						if(i>j)
							break;
						else
							count++;
					}
				}
			}
			if(count!=0)
			{
				vowel=vowel+s.charAt(i)+" ";
				noOFUniqueVowel++;
			}
		}
		System.out.println(vowel);
		System.out.println("No of vowels with out Duplicates is "+noOFUniqueVowel);
		
		
		//OR
		
//		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
//		
//		for(int i=0; i<s.length(); i++)
//		{
//			lhs.add(s.charAt(i));
//		}
//		
//		int count=0;
//		for(Character c:lhs)
//		{
//			if(c=='a' || c=='e'|| c=='i' || c=='o' ||  c=='u')
//			{
//				System.out.println(c);
//				count++;
//			}
//		}
//		System.out.println(count+" unique vowels are present in given String ");
	}
}
