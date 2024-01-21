package programs_Patterns;

import org.testng.annotations.Test;

public class Pattern7 
{ 
	//	        1
	//	      1 2 1
	//	    1 2 3 2 1
	//	  1 2 3 4 3 2 1
	//	1 2 3 4 5 4 3 2 1

	@Test
	public void pattern7()
	{
		int n=5;

		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print(" ");
			}
			if(i>=2)
			{
				for(int j=1; j<i; j++)
				{
					System.out.print(j);
				}
			}
			for(int j=i; j>=1; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	// (OR)
	
	
//   	    1
//	      1 2 1
//	    1 2 3 2 1
	@Test
	public void pattern8()
	{
		int n=3;

		for(int i=1; i<=n; i++)
		{
			int x1=1;
			int x2=i;
			for(int j=1; j<=2*n-1; j++)
			{
				if(j<=n-i) {
					System.out.print(" ");

				}
				else
				{
					if(j<=n) {
						System.out.print(x1++);
					}
					else if(j-i<n){
						System.out.print(--x2);
					}
					
				}
			}
			System.out.println();
			
		}
	}
	
	
//  1
//  1 2 1
//  1 2 3 2 1
	@Test 
	public void pattern9()
	{
		int n=3;
		for(int i=1; i<=n; i++)
		{
			int x=i;
			for(int j=1; j<2*i; j++)
			{
				if(j<=i)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(--x);
				}
			}
			System.out.println();
		}
		System.out.println();
	}


}
