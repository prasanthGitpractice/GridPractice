package programsOnArrays;

import org.testng.annotations.Test;

public class PrintTheDuplicateNumbersOfArrayWithThePosition 
{
	@Test
	public void method()
	{
		int[] a={10,20,30,10,20,50,10};
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				boolean flag=false;
				if(a[i]==a[j])
				{
					if(i>j)
						break;
					else
					{
						flag=true;
					}
				}
				if(flag)
				{
					System.out.println(a[j]+" is repeated at postion "+j+" index");
				}
			}
		}
	}
	
	@Test
	public void method2()
	{
		int[] a={10,20,30,10,20,50,10};
		for(int i=0; i<a.length; i++)
		{
			int count=0;
			for(int j=0; j<a.length; j++)
			{
				boolean flag=false;
				if(a[i]==a[j])
				{
					if(i>j)
						break;
					else
					{
						flag=true;
						count++;
					}
				}
				if(flag && count>1)
				{
					System.out.println(a[j]+" is repeated at postion "+j+" index");
				}
			}
		}
	}
}
