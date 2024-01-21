package programsOnArrays;

import org.testng.annotations.Test;

public class FetchingMinAndmaxValuesFromArray 
{
	@Test
	public void fetchingMinAndmaxValuesFromArray()
	{
		int[] a={4,5,3,2,7,1};

		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
	}
}
