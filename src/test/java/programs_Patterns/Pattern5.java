package programs_Patterns;

import org.testng.annotations.Test;

public class Pattern5 
{
	
//	1 
//	2 2 
//	1 1 1 
//	2 2 2 2 
//	1 1 1 1 1
	@Test
	public void pattern5()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i%2!=0)
				{
					System.out.print(1+" ");
				}
				else
				{
					System.out.print(2+" ");
				}
			}
			System.out.println();
		}
	}
}
