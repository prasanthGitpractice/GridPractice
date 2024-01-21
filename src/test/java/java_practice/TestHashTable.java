package java_practice;

import java.util.Hashtable;
import java.util.Map.Entry;

public class TestHashTable 
{

	public static void main(String[] args) 
	{
		Hashtable<Integer, String> htMap=new Hashtable<Integer, String>();
		htMap.put(10, "Prasanth");
		htMap.put(5, "santh");
		htMap.put(7, "Hency");
		
		htMap.put(5, "viswa");
		htMap.put(5, "Amma");
		//htMap.put(5, null);	
		//htMap.put(null, null);
		System.out.println(htMap);
		
		for(Entry<Integer, String> m:htMap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		for(Integer i:htMap.keySet())
		{
			System.out.println(i);
		}
		
		for(Integer i:htMap.keySet())
		{
			System.out.println(htMap.get(i));
		}
	
	}

}
