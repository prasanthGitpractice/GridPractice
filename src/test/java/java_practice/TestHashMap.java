package java_practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class TestHashMap 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hMap=new HashMap<Integer, String>();
		hMap.put(10, "Prasanth");
		hMap.put(5, "santh");
		hMap.put(7, "Hency");
		
		hMap.put(5, "viswa");
		hMap.put(5, "Amma");
		hMap.put(5, null);	
		hMap.put(null, null);
		hMap.put(null, null);

		System.out.println(hMap);
		
		for(Entry<Integer, String> m:hMap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		for(Integer i:hMap.keySet())
		{
			System.out.println(i);
		}
	
	}

}
