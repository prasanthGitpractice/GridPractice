package programsOnArrays;

import org.testng.annotations.Test;

public class FrequentlyRepeatingNumberInArray
{
	// This method is to print numbers repeating morethan once
	@Test
	public void frequentlyRepeatingNumberInArray()
	{
		int a[]= {4,2,8,5,2,2,8};
		for(int i=0; i<a.length;i++)
		{
			int count=0;
			for(int j=0; j<a.length;j++)
			{
				if(a[i]==a[j] && i>j)
				{
					break;
				}
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>1)
				System.out.println(a[i]+" is repeated "+count+" times");
		}
	}
	
				//OR
	// This method is to print the first number which is repeated more number of times. here 8 is first most repeated number
	@Test
	public void frequentlyRepeatingNumberInArray1()
	{
		int a[]= {4,2,8,8,5,8,2,2};
		int max=0;
		int value=0;
		for(int i=0; i<a.length;i++)
		{
			int count=0;
			for(int j=0; j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					if(i>j)
						break;
					else
						count++;
				}
			}
			if(count>max)
			{
				max=count;
				value=a[i];
			}
		}
		System.out.println(value+" is repeated "+max+" times");
	}	
}
