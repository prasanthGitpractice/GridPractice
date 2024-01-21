package programs_Maths;

import org.testng.annotations.Test;

public class PrimeNumbersBetweenARange 
{
	@Test
	public void primeNumbersBetweenARange()
	{
		int minRange=1;
		int maxRange=30;
		
		for(int i=minRange; i<=maxRange; i++)
		{
			int count=0;
			for(int j=minRange; j<=maxRange; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
				System.out.print(i+" ");
		}
		System.out.println();
	}
}
