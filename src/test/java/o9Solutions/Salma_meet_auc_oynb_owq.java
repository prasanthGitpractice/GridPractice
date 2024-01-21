package o9Solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Salma_meet_auc_oynb_owq 
{
	@Test
	public void ActionsOnHashMap()
	{
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("k1", 20);
		hm.put("k2", 30);
		hm.put("k5", 40);
		hm.put("k4", 50);
		hm.put("k3", 27);
		System.out.println(hm);
		for(String key:hm.keySet())
		{
			System.out.println(key+" Having value as : " +hm.get(key));
		}

		for(Entry<String, Integer> es:hm.entrySet())
		{
			System.out.println(es);

		}
		//Use of contains key method
		System.out.println(hm.containsKey("k6"));//false
		System.out.println(hm.containsKey("k1"));//true

		//Use of Contains value method
		System.out.println(hm.containsValue(10));//false
		System.out.println(hm.containsValue(50));//true

		//Use of remove method
		hm.remove("k3");//{k1=20, k2=30, k4=50, k5=40}
		System.out.println(hm);

		//Use of Size method
		System.out.println("size of hasmap is " +hm.size()); //size of hasmap is 4

		//Use of value method
		System.out.println(hm.values());//[20, 30, 50, 40]
	}

	@Test
	public void SalmaCountOfCharStringUsingHashmap()
	{
		String s="google";
		int count=0;
		HashMap hm=new HashMap();
		for(int i=0;i<=s.length();i++)
		{
			hm.put("key", count++);
		}
		System.out.println(hm.get("key"));

	}

	@Test
	public void Salma_ArrayList()
	{
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(12);
		al.add(18);
		al.add(50);

		System.out.println(al);

		//Inserting element in the first position
		al.add(1, 10);
		System.out.println(al);

		//Remove elemt in 3rd position
		al.remove(3);
		System.out.println(al);

		//Replace element in 4th position
		al.set(3, 100);
		System.out.println(al);

		//To fetch the element at 2nd index
		System.out.println(al.get(2));

		//To get the size of the list
		System.out.println(al.size());


		//To remove all the element
		al.removeAll(al);
		System.out.println(al);

		ArrayList al1=new ArrayList();
		al1.addAll(al);
		System.out.println("getting all elemnts in al1 collection "+ al1);
	}


	@Test
	public void Salma_Collection() 
	{

		ArrayList al=new ArrayList();
		al.add(10);
		al.add(60);
		al.add(30);
		al.add(20);
		al.add(100);

		//Use of sort method
		Collections.sort(al);
		System.out.println(al);

		//Use of Shuffle
		Collections.shuffle(al);
		System.out.println(al);



	}

}

