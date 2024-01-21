package java_practice;

import java.util.TreeMap;
import java.util.Map.Entry;

public class TestTreeMap 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer, String> tmMap=new TreeMap<Integer, String>();
		tmMap.put(10, "Prasanth");
		tmMap.put(5, "santh");
		tmMap.put(7, "Hency");
		
		tmMap.put(5, "viswa");
		tmMap.put(5, "Amma");
		tmMap.put(5, null);	
		//tmMap.put(null, null);
		//tmMap.put(null, "viswa");
		System.out.println(tmMap);
		
		for(Entry<Integer, String> m:tmMap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		for(Integer i:tmMap.keySet())
		{
			System.out.println(i);
		}
		
	}

}
