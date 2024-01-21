package programsOnArrays;

import org.testng.annotations.Test;

public class FirstAndSecondMinNumbersWithoutBubblesort 
{
	@Test
	public void firstAndSecondMinNumbersWithoutBubblesort()
	{
		int[] a= {4,5,6,2,3,1};
		
		int fmin=0;
		int secmin=0;
		
		if(a[0]<a[1])
		{
			fmin=a[0];
			secmin=a[1];
		}
		else
		{
			fmin=a[1];
			secmin=a[0];
		}
		
		for(int i=2; i<a.length; i++)
		{
			if(a[i]<secmin)
			{
				if(a[i]<fmin)
				{
					secmin=fmin;
					fmin=a[i];
				}
				else
				{
					secmin=a[i];
				}
			}
		}
		
		System.out.println(fmin);
		System.out.println(secmin);
		
	}
}
