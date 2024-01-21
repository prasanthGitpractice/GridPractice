package programsOnString;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class OccuranceOfEachDigitInIntegerValue 
{
	@Test
	public void occuranceOfEachDigitInIntegerValue()
	{
		int i=673234554;
		int digit1;
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		while(i>0)
		{
			digit1=i%10;
			if(map.containsKey(digit1))
			{
				map.put(digit1, map.get(digit1)+1);
			}
			else
			{
				map.put(digit1, 1);
			}
			i=i/10;
		}
		for(Entry<Integer, Integer> ent:map.entrySet())
		{
			System.out.println(ent.getKey()+" is repeated "+ent.getValue()+" times");
		}
		
	}
}
