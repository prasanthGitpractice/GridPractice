package java_practice;

import java.util.ArrayList;
import java.util.Collections;

public class TestArraryList
{
	public static void main(String[] args) 
	{
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("amma");
		al.add("Nanna");
		al.add(10);
		al.add("Nanna");
		al.add(10);
		al.add(null);
		al.add(null);
		al.add(true);
		al.add('c');
		//Collections.sort(al);
		System.out.println(al);
		System.out.println(al.contains(10));
		for(Object value:al)
		{
			System.out.println(value);
		}
		
		ArrayList<Integer> intAL=new ArrayList<Integer>();
		
		intAL.add(10);
		intAL.add(12);
		//intAL.add("Prasanth");
		intAL.add(58);
		intAL.add(22);
		intAL.add(01);
		System.out.println(intAL);
		Collections.sort(intAL);
		System.out.println(intAL);
		for(Integer intValue:intAL)
		{
			System.out.println(intValue);
		}
		
		//intAL.addAll(al);
		al.addAll(intAL);
		System.out.println(al);
		
	}
}
