package programsOnArrays;

import org.testng.annotations.Test;

public class SumOfFirstThreeMaxNumOfArray 
{
	@Test
	public void sumOfFirstThreeMaxNumInArray()
	{
		int a[]= {4,2,8,5,67,46,38};

		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] < a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}

		int sum=0;
		for(int i=0; i<3; i++)
		{
			sum=sum+a[i];
		}

		System.out.println(sum);

	}
}
