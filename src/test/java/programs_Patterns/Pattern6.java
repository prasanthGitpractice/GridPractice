package programs_Patterns;

import org.testng.annotations.Test;

public class Pattern6 
{
//	A 
//	B C 
//	D E F 
//	G H I J 
//	K L M N O
	@Test
	public void pattern6()
	{
		char c='A';
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(c+++" ");
				//c++;
			}
			System.out.println();
		}
	}
}
