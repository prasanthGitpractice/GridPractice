package java_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet 
{

	public static void main(String[] args) 
	{
		HashSet<Object> hs=new HashSet<Object>();
		hs.add("amma");
		hs.add("Nanna");
		hs.add(10);
		hs.add("Nanna");
		hs.add(10);
		hs.add(null);
		hs.add(null);// eventhough we use multiple nulls it consider only one null
		hs.add(true);
		hs.add('c');
		//Collections.sort(hs);
		System.out.println(hs);
		
		
		
		
		ArrayList<Object> al=new ArrayList<Object>(hs);
		System.out.println(al);
		
		al.add("amma");
		al.add("Nanna");
		al.add(10);
		al.add("Nanna");
		al.add(10);
		al.add(null);
		al.add(null);
		al.add(true);
		al.add('c');
		
		System.out.println(al);
		
		Iterator<Object> it= al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
