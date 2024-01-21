package programsOnArrays;

import org.testng.annotations.Test;

public class FirstMaxNumOfArray 
{
	@Test
	public void firstMaxNumOfArray()
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
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(a[a.length-1]+" is the First maximum number");
	}
}
