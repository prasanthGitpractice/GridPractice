package programsOnArrays;

import org.testng.annotations.Test;

public class PrimeNumberInAnArray 
{
	@Test
	public void primeNumberInAnArray()
	{
		int[] a= {7,4,2,1,5,9,8,3};
		
		for(int i=0; i<a.length; i++)
		{
			int count=0;
			for(int j=1; j<=a[i]; j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
				System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
