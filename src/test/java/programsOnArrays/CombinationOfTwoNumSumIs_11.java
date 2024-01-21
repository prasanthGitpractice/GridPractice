package programsOnArrays;

import org.testng.annotations.Test;

public class CombinationOfTwoNumSumIs_11 
{
	@Test
	public void combinationOfTwoNumSumIs_11()
	{
		int[] a= {8,2,3,7,6,4,9,5};
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]+a[j]==11)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
			
		}
	}
}
