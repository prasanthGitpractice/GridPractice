package programs_Patterns;

import org.testng.annotations.Test;

public class Pattern1 
{
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
	@Test
	public void pattern1()
	{
		for(int i=0; i<5;i++)
		{
			for(int j=0; j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 
	@Test
	public void pattern2()
	{
		int n=5;
		
		
		for(int i=0; i<n;i++)
		{
			//for(int j=i; j<n;j++)
			for(int j=0; j<n-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
				//(OR)
		
//		for(int i=n; i>0;i--)
//		{
//			for(int j=i; j>0;j--)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
	}
	
}
