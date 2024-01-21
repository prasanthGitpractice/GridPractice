package programsOnArrays;

import org.testng.annotations.Test;

public class SmallestEvenNumberOfArray 
{
	@Test
	public void smallestEvenNumberOfArray()
	{
		
		int[] a= {5,3,2,1,7,8,4};
		int smallesteven=0;
		for(int i=0; i<a.length; i++)
		{			
			if(a[i]%2==0)
			{
				if(smallesteven==0)
				{
					smallesteven=a[i];
				}
				else if(a[i]<smallesteven)
				{
					smallesteven=a[i];
				}
			}
		}
		System.out.println(smallesteven);
	}
}
