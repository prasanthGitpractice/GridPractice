package programsOnArrays;

import org.testng.annotations.Test;

public class FirstMinNumOfArray 
{
	@Test
	public void firstMinNumOfArray() 
	{
		int a[]= {4,2,8,5,67,46,38};

		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] > a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		System.out.println(a[0]+" is the First minimum number");
	}

}
