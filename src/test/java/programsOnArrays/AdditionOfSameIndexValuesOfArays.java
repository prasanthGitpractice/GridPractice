package programsOnArrays;

import org.testng.annotations.Test;

public class AdditionOfSameIndexValuesOfArays 
{
	@Test
	public void additionOfSameIndexValuesOfArays()
	{
		int a[]= {1,2,3};
		int b[]= {2,4,6,8};
		
//		int a1[]=new int[b.length];
//		a1[0]=a[0];
//		a1[1]=a[1];
//		a1[2]=a[2];
//		
//		for(int i=0; i<a1.length; i++)
//		{
//			int sum=a1[i]+b[i];
//			System.out.print(sum+" ");
//		}
//		System.out.println();
		
		//(OR)
		
		int length=a.length;
		if(a.length<b.length)
			length=b.length;
		
		for(int i=0; i<length; i++)
		{
			try
			{
				System.out.print(a[i]+b[i]+" ");
			}
			catch (Exception e)
			{
				if(a.length<b.length)
					System.out.print(b[i]+" ");
				else
					System.out.print(a[i]+" ");
			}
		}
		System.out.println();
	}
}
