package programsOnArrays;

import org.testng.annotations.Test;

public class FindMissingNumbersInArray 
{
	@Test
	public void findMissingNumbersInArray()
	{
		int[] a= {1,3,6,7,9};
		//sorting array inorder to find min and max values using index
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
		}
		
		int min=a[0];//0 th index min value after sorting
		int max=a[a.length-1];//  length-1 index max value after sorting
		for(int i=min+1;i<max;i++) // making loop BETWEEN min and max values
		{
			boolean flag=true;
			for(int j=0;j<a.length;j++)
			{
				if(i==a[j])
				{
					flag=false;
				}
			}
			if(flag)
				System.out.println(i);
		}
	}
}
