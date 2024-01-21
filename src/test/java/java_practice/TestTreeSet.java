package java_practice;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet 
{

	public static void main(String[] args) 
	{
		TreeSet<Object> ts=new TreeSet<Object>();
		ts.add(34);
		ts.add(25);
		ts.add(46);
		//ts.add("Prasanth");
		//ts.add(null);
		ts.add(12);
		ts.add(0);
		System.out.println(ts);
		
		Iterator<Object> it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		TreeSet<Object> ts1=new TreeSet<Object>();
		ts1.add(34);
		ts1.add(25);
		ts1.add(46);
		ts1.add(12);
		ts1.add(0);
		System.out.println(ts1);
	}

}
