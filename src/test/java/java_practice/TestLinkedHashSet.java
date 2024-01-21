package java_practice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Object> lhs=new LinkedHashSet<Object>();
		lhs.add("amma");
		lhs.add("Nanna");
		lhs.add("Nanna");
		lhs.add(10);
		lhs.add(10);
		lhs.add(null);
		lhs.add(null);
		lhs.add(true);
		lhs.add('c');
		System.out.println(lhs);
		
		Iterator<Object> it = lhs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
