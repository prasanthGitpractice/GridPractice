package programs_Patterns;

import org.testng.annotations.Test;

public class Pattern4 
{
//	1 
//	1 2 
//	1 2 3 
//	1 2 3 4 
//	1 2 3 4 5
	@Test
	public void pattern()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	
//	1 2 3 4 5 
//	2 3 4 5 
//	3 4 5 
//	4 5 
//	5 
	@Test
	public void pattern2()
	{
		int n=5;
		for(int i=1; i<=n;i++)
		{
			for(int j=i; j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
