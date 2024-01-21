package programsOnArrays;

import org.testng.annotations.Test;

public class TransferAllZerosToEndOfArray 
{
	@Test
	public void transferAllZerosToEndOfArray()
	{
		int[] a= {5,0,4,0,0,9};
		int[] b=new int[a.length];
		
		int count=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=0)
			{
				b[count++]=a[i];
			}
		}
		for(int j=0; j<b.length; j++)
		{
			System.out.print(b[j]+" ");// here we are not adding any zeros to the vacant indexes of newly created array...since the default values will be zero and it is provided by compiler
		}
		System.out.println();
	}
}
