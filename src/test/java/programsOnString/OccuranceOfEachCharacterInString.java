package programsOnString;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class OccuranceOfEachCharacterInString 
{
	@Test
	public void occuranceOfEachCharacterInString()
	{
		String s1="tester";
		String s = s1.toLowerCase();
		for(int i=0; i<s.length(); i++)
		{
			int count=0;
			for(int j=0; j<s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					if(i>j)
						break;//breaks whole inner for loop and will move to next iteration of outer forloop
					else
						count++;
				}
			}
			if(count>=1)
			{
				System.out.println(s.charAt(i)+" is present "+count+" times");
			}
		}
		
	}
	
				//(OR)
	
	@Test
	public void occuranceOfEachCharacterInString2()
	{
		String s1="tester";
		String s = s1.toLowerCase();
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
			lhs.add(s.charAt(i));// duplicates are removed
		}
		
		for(Character c:lhs)
		{
			int count=0;
			for(int i=0; i<s.length();i++)
			{
				if(c==s.charAt(i))
				{
					count++;
				}
			}
			if(count>=1)
			{
				System.out.println(c+" is repeated "+count+" times");
			}
		}
	}
	
	@Test
	public void occuranceOfEachCharacterInString3()
	{
		String s1="tester";
		String s = s1.toLowerCase();
		HashMap<Character, Integer> hmap=new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++)
		{
			if(hmap.containsKey(s.charAt(i)))
			{
				hmap.put(s.charAt(i), hmap.get(s.charAt(i))+1); // here fetching that particular charcter count and increasing count by 1
			}
			else
			{
				hmap.put(s.charAt(i), 1); //here at very first time the particular character is present 1 time only thats why above condition is failing
			}
		}
		
		for(Entry<Character, Integer> m: hmap.entrySet())
		{
			System.out.println(m.getKey()+" is present "+m.getValue()+" times"); // prints each character occurance
			
			// prints duplicate characters
			if(m.getValue()>1)
			{
				System.out.println(m.getKey()+" is present "+m.getValue()+" times");
			}
		}
		
		
	}
	
	
}
