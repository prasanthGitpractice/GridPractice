package o9Solutions;

import java.util.HashMap;
import java.util.LinkedList;

import org.testng.annotations.Test;

public class Aug11andAug16th2022 
{
	// Using Method Recursion
	public void withOutLoop(int startingRange, int maxRange)
	{
		if(startingRange>maxRange)
		{
			return; // we can use only return when it is not returning anything
		}
		else
		{
			System.out.println(startingRange);
			startingRange++;
			withOutLoop(startingRange, maxRange);
			return;
		}
	}
	
	@Test
	public void programToPrintNumbersBetweenGivenRangeWithOutLoop() 
	{
        Aug11andAug16th2022 p=new Aug11andAug16th2022();
		p.withOutLoop(1,15);
	}
	
	@Test
	public void programToCountNoOfCharactersInGivenStringUsingHashMap()
	{
		String s = "Automation";
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		int count=1;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)!=' ')
			{
				map.put('k', count++);
			}
		}
		
		//System.out.println("No Of Characters Present in a given String is "+count);// if we print count we will get wrong answer by difference as 1 since we are using count++
		System.out.println(map.get('k'));
	}
	
	@Test
	public void palindromeStringOrNot()
	{
		String s="moma";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println(s+" is palindrome String");
		}
		else
		{
			System.out.println(s+" is not a palindrome String");
		}
	}
	
	@Test
	public void getKeyAndValuesFromHashMap()
	{
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("dfghjh", 67567);
		map.put("sjuaikcnm", 65987);
		map.put("jash", 23432);
		map.put("askjhc", 987890);
		map.put("gyuakc", 102938);
		
		for(String key : map.keySet())
		{
			System.out.println(key+"------>"+map.get(key));
		}	
	}
	
	@Test
	public void allPossibleSubStringsOfGivenString()
	{
		String s="welcome";
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i; j<s.length(); j++)
			{
				//String subStr=s.substring(j, j+1); //WRONG

				String subStr=s.substring(i, j+1);
				System.out.println(subStr);
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	@Test
	public void maxNoFromGivenArray()
	{
		int[] a= {9,1,26,56,23,34};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				// sort array in descending order
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Max Number in array is "+a[0]);
	}
	
	@Test
	public void checkGivenLinkedListIsPalindromeOrNot()
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("amma");
		ll.add("me");
		ll.add("amma");
		
		LinkedList<String> ll2=new LinkedList<String>();
		
		for(int i=ll.size()-1; i>=0; i--)
		{
			ll2.add(ll.get(i));
		}
		
		System.out.println(ll);
		System.out.println(ll2);
		if(ll2.equals(ll))
			System.out.println("ll is palindrome");
		else
			System.out.println("ll is not palindrome");

	}
}
