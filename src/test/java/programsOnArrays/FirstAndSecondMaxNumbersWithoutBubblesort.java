package programsOnArrays;

import org.testng.annotations.Test;

public class FirstAndSecondMaxNumbersWithoutBubblesort 
{
	@Test
	public void firstAndSecondMaxNumbersWithoutBubblesort()
	{
		
		int[] a= {7,5,2,3,6};

		int fmax=0;
		int secmax=0;

//		if(a[0]>a[1])
//		{
//			fmax=a[0];
//			secmax=a[1];
//		}
//		else
//		{
//			fmax=a[1];
//			secmax=a[0];
//		}
//
//		for(int i=2; i<a.length; i++)
//		{
//			if(a[i]>secmax)
//			{
//				if(a[i]>fmax)
//				{
//					secmax=fmax;
//					fmax=a[i];
//					
//				}
//				else
//				{
//					secmax=a[i];
//				}
//			}
//		}
		
		// OR
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>fmax)
			{
				secmax=fmax;
				fmax=a[i];
			}
			else if(a[i]>secmax)
			{
				secmax=a[i];
			}
		}
		
		System.out.println(fmax);
		System.out.println(secmax);
		
		
	}
	
	@Test
	public void firstAndSecondMaxAnd3rdNumbersWithoutBubblesort()
	{
		int[] a= {7,5,2,3,6};

		int fmax=0;
		int secmax=0;
		int thirdMax=0;
		
		for(int i=0; i<a.length ; i++)
		{
			if(a[i]>fmax)
			{
				fmax=a[i];
			}
			else if(a[i]>secmax)
			{
				thirdMax=secmax;
				secmax=a[i];
			}
			else if(a[i]>thirdMax)
			{
				thirdMax=a[i];
			}
		}
		System.out.println(thirdMax);
	}
}
