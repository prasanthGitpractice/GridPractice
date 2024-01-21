package programsOnString;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class ActionsOnStringWithHashMap 
{
	@Test
	public void uniqueWordsOfString()
	{
		String s1="hi hello hi hello welcome";
		String[] a = s1.split(" ");
		HashMap<String, Integer> hp=new HashMap<String, Integer>();
		for(int i=0; i<a.length;i++)
		{
			if(hp.containsKey(a[i]))
				hp.put(a[i], hp.get(a[i])+1);
			else
				hp.put(a[i], 1);
		}	
		
		for(Entry<String, Integer> m : hp.entrySet())
		{
			if(m.getValue()==1)
				System.out.println(m.getKey()+" repeated "+m.getValue()+"times");
		}
		System.out.println();
	}
	
	
	//@Test
	public void duplicateWordsOfString()
	{
		String s1="hi hello hi hello welcome";
		String[] a = s1.split(" ");
		HashMap<String, Integer> hp=new HashMap<String, Integer>();
		for(int i=0; i<a.length;i++)
		{
			if(hp.containsKey(a[i]))
				hp.put(a[i], hp.get(a[i])+1);
			else
				hp.put(a[i], 1);
		}	
		
		for(Entry<String, Integer> m : hp.entrySet())
		{
			if(m.getValue()>1)
				System.out.println(m.getKey()+" repeated "+m.getValue()+"times");
		}
		System.out.println();
	}
	
	
	//@Test
	public void occuranceOfWordsOfString()
	{
		String s1="hi hello hi hello welcome";
		String[] a = s1.split(" ");
		HashMap<String, Integer> hp=new HashMap<String, Integer>();
		for(int i=0; i<a.length;i++)
		{
			if(hp.containsKey(a[i]))
				hp.put(a[i], hp.get(a[i])+1);
			else
				hp.put(a[i], 1);
		}	
		
		for(Entry<String, Integer> m : hp.entrySet())
		{
			if(m.getValue()>=1)
				System.out.println(m.getKey()+" repeated "+m.getValue()+"times");
		}
		System.out.println();
	}
	
	@Test
	public void removeDuplicateWordsOfString()
	{
		String s1="hi hello hi hello welcome";
		String[] a = s1.split(" ");
		HashMap<String, Integer> hp=new HashMap<String, Integer>();// use linked hashmap ...we can maintain insertion order ..so we will get unique words without duplicates in order
		for(int i=0; i<a.length;i++)
		{
			if(hp.containsKey(a[i]))
				hp.put(a[i], hp.get(a[i])+1);
			else
				hp.put(a[i], 1);
		}	
		
		for(Entry<String, Integer> m : hp.entrySet())
		{
			System.out.print(m.getKey()+" ");
		}
		System.out.println();
	}
}
