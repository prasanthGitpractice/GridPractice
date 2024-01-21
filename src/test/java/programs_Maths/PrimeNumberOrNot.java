package programs_Maths;

import org.testng.annotations.Test;

public class PrimeNumberOrNot 
{
	@Test
	public void primeNumberOrNot()
	{
		int num=7;
		int count=0;
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
			System.out.println(num+" is Prime Number");
		else
			System.out.println(num+" is not Prime Number");
	}
}
