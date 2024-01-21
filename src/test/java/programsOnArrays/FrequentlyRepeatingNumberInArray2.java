package programsOnArrays;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class FrequentlyRepeatingNumberInArray2 
{
	// This program is to print all the most repeating numbers.
	@Test
	public void frequentlyRepeatingNumberInArray2()
	{
		int a[]= {4,2,8,2,2,4,8,4,5,4,8,4,2,8,2,8};
		int count=0;
		int maxOccurance=0;

		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0; i<a.length;i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i])+1);
				count=map.get(a[i]);
				if(count>maxOccurance)
					maxOccurance=count;
			}
			else
			{
				map.put(a[i], 1);
				count=map.get(a[i]);
				if(count>maxOccurance)
					maxOccurance=count;
			}
		}
		for(Entry<Integer, Integer> i:map.entrySet())
		{
			if(i.getValue()==maxOccurance)
				System.out.println(i.getKey()+" is repeated "+i.getValue()+" times");//printing the value which is repeated mostly
		}

	}

}
