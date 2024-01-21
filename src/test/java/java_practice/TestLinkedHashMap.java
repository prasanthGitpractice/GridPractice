package java_practice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class TestLinkedHashMap 
{

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, String> lhMap=new LinkedHashMap<Integer, String>();
		lhMap.put(10, "Prasanth");
		lhMap.put(5, "santh");
		lhMap.put(7, "Hency");
		
		lhMap.put(5, "viswa");
		lhMap.put(5, "Amma");
		lhMap.put(5, null);	
		lhMap.put(null, null);
		lhMap.put(null, null);

		System.out.println(lhMap);
		
		for(Entry<Integer, String> m:lhMap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		for(Integer i:lhMap.keySet())
		{
			System.out.println(i);
		}
	}

}
