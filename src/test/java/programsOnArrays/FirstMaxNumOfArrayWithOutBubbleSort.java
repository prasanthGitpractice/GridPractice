package programsOnArrays;

import org.testng.annotations.Test;

public class FirstMaxNumOfArrayWithOutBubbleSort 
{
	@Test
	public void firstMaxNumOfArrayWithOutBubbleSort()
	{
		int a[]= {4,2,8,5,67,46,38};
		
		int fmax=a[0];

		for(int i=0; i<a.length; i++)
		{
			if(fmax<a[i])
			{
				fmax=a[i];
			}
		}
		System.out.println(fmax+" is the first maximum value in array");
	}
}
