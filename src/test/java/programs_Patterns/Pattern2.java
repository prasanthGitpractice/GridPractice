package programs_Patterns;

import org.testng.annotations.Test;

public class Pattern2 
{
//	   	 * 
//	    * * 
//	   * * * 
//	  * * * * 
//	 * * * * * 
	@Test
	public void pattern()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
//	 * * * * * 
//	  * * * * 
//	   * * * 
//	    * * 
//	     * 
	
	@Test
	public void pattern2()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
