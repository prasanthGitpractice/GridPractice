package programsOnArrays;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class ActionsOnArrayWithHashMap 
{
	@Test
	public void uniqueNumbersOfArray()
	{
		int a[] = {5,4,4,2,5,4,2,1};
		HashMap<Integer, Integer> hp=new HashMap<Integer, Integer>();
		for(int i=0; i<a.length;i++)
		{
			if(hp.containsKey(a[i]))
			{
				hp.put(a[i], hp.get(a[i])+1);
			}
			else
				hp.put(a[i], 1);
		}	
		
		for(Entry<Integer, Integer> m : hp.entrySet())
		{
			if(m.getValue()==1)
				System.out.println(m.getKey()+" repeated "+m.getValue()+"times");
		}
		System.out.println();
	}
	
	
	@Test
	public void duplicateNumbersOfArray()
	{
		int a[] = {5,4,4,2,5,4,2,1};
		HashMap<Integer, Integer> hp=new HashMap<Integer, Integer>();
		for(int i=0; i<a.length;i++)
		{
			if(hp.containsKey(a[i]))
			{
				hp.put(a[i], hp.get(a[i])+1);
			}
			else
				hp.put(a[i], 1);
		}	
		
		for(Entry<Integer, Integer> m : hp.entrySet())
		{
			if(m.getValue()>1)
				System.out.println(m.getKey()+" repeated "+m.getValue()+"times");
		}
		System.out.println();
	}
	
	
	@Test
	public void occuranceOfNumbers()
	{
		int a[] = {5,4,4,2,5,4,2,1};
		HashMap<Integer, Integer> hp=new HashMap<Integer, Integer>();
		for(int i=0; i<a.length;i++)
		{
			if(hp.containsKey(a[i]))
			{
				hp.put(a[i], hp.get(a[i])+1);
			}
			else
				hp.put(a[i], 1);
		}	
		
		for(Entry<Integer, Integer> m : hp.entrySet())
		{
			if(m.getValue()>=1)
				System.out.println(m.getKey()+" repeated "+m.getValue()+"times");
		}
		System.out.println();
	}
	
	@Test
	public void removeDuplicateNumbers()
	{
		int a[] = {5,44,4,2,5,4,32,17};
		HashMap<Integer, Integer> hp=new HashMap<Integer, Integer>();
		for(int i=0; i<a.length;i++)
		{
			hp.put(a[i], 1);
		}	
		
		for(Entry<Integer, Integer> m : hp.entrySet())
		{
			System.out.print(m.getKey()+" ");
		}
		System.out.println();
	}
	
	@Test
	public void m1()
	{
		int a[] = {5,44,4,2,5,4,32,17};

		int pos=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					
						pos=+j;
						
					
				}

			}
		}
		
		System.out.println(pos);
		
	}
}
