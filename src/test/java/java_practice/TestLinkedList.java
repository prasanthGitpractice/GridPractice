package java_practice;

import java.util.Collections;
import java.util.LinkedList;

public class TestLinkedList 
{

	public static void main(String[] args) 
	{
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add("amma");
		ll.add("Nanna");
		ll.add(10);
		ll.add("Nanna");
		ll.add(10);
		ll.add(null);
		ll.add(null);
		ll.add(true);
		ll.add('c');
		ll.addFirst("FirstElement");
		ll.addLast("LastElement");
		System.out.println(ll);
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

		//Collections.sort(ll);
		for(Object value:ll)
		{
			System.out.println(value);
		}
		
		LinkedList<Integer> intLL=new LinkedList<Integer>();
		
		intLL.add(10);
		intLL.add(12);
		//intLL.add("Prasanth");
		intLL.add(58);
		intLL.add(22);
		intLL.add(01);
		System.out.println(intLL);
		Collections.sort(intLL);
		System.out.println(intLL);
		for(Integer intValue:intLL)
		{
			System.out.println(intValue);
		}
		
		//intLL.addAll(ll);
		ll.addAll(intLL);
		System.out.println(ll);
		

	}

}
