package programsOnArrays;

import org.testng.annotations.Test;

public class PrintAllTheNumbersContaining1FromGivenIntArray 
{
	@Test
	public void method()
	{
		 int[] a={11,22,33,41,55,61,77,81};
		 
		 for(int i=0; i<a.length; i++)
		 {
			 int num=a[i];
			 while(num>0)
			 {
				 int digit=num%10;
				 if(digit==1)
				 {
					 System.out.print(a[i]+" ");
				 }
				 num=num/10;
			 }
		 }
	}
}
