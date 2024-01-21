package programs_Patterns;

import org.testng.annotations.Test;

public class Pattern3 
{
//	1 
//	2 2 
//	3 3 3 
//	4 4 4 4
//	5 5 5 5 5
	
	@Test
	public void pattern()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
//	5 5 5 5 5 
//	4 4 4 4 
//	3 3 3 
//	2 2 
//	1 	
	@Test
	public void pattern3()
	{
		int n=5;
		for(int i=n; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
