package programsOnArrays;

import org.testng.annotations.Test;

public class FirstMinNumOfArrayWithOutBubbleSort 
{
	@Test
	public void firstMinNumOfArrayWithOutBubbleSort()
	{
		int a[]= {4,2,8,5,67,46,38};
		
		int fmin=a[0];

		for(int i=0; i<a.length; i++)
		{
			if(fmin>a[i])
			{
				fmin=a[i];
			}
		}
		System.out.println(fmin+" is the first minimum value in array");
	}
}
