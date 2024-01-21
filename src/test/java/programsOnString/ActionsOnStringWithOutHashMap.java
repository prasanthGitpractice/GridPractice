package programsOnString;

import org.testng.annotations.Test;

public class ActionsOnStringWithOutHashMap 
{
	@Test
	public void uniqueWordsOfString()
	{
		String s1="hi hello hi hello welcome";
		String[] a = s1.split(" ");
		for(int i=0; i<a.length;i++)
		{
			int count=0;
			for(int j=0; j<a.length; j++)
			{
				if(a[i].equals(a[j]))
				{
					if(i>j)
						break;
					else
						count++;
				}
			}
			if(count==1)
				System.out.println(a[i]+" repeated "+count+"times");
		}	
		System.out.println();
	}
	
	
	@Test
	public void duplicateWordsOfString()
	{
		String s1="hi hello hi hello welcome";
		String[] a = s1.split(" ");
		for(int i=0; i<a.length;i++)
		{
			int count=0;
			for(int j=0; j<a.length; j++)
			{
				if(a[i].equals(a[j]))
				{
					if(i>j)
						break;
					else
						count++;
				}
			}
			if(count>1)
				System.out.println(a[i]+" repeated "+count+"times");
		}	
		System.out.println();
	}
	
	
	@Test
	public void occuranceOfWordsOfString()
	{
		String s1="hi hello hi hello welcome";
		String[] a = s1.split(" ");
		for(int i=0; i<a.length;i++)
		{
			int count=0;
			for(int j=0; j<a.length; j++)
			{
				if(a[i].equals(a[j]))
				{
					if(i>j)
						break;
					else
						count++;
				}
			}
			if(count>=1)
				System.out.println(a[i]+" repeated "+count+"times");
		}	
		System.out.println();
	}
	
	@Test
	public void removeDuplicateWordsOfString()
	{
		String s1="hi hello hi hello welcome";
		String[] a = s1.split(" ");
		String temp="";
		for(int i=0; i<a.length;i++)
		{
			int count=0;
			for(int j=0; j<a.length; j++)
			{
				if(a[i].equals(a[j]))
				{
					if(i>j)
						break;
					else
						count++;
				}
			}	
			if(count>=1)
				temp=temp+a[i]+" ";
		}	
		System.out.println(temp);
		System.out.println();
	}
}
