package programs_Maths;

import org.testng.annotations.Test;

public class FactorialOfNumber 
{
	@Test
	public void factorialOfNumber()
	{
		int num=5;
		int fact=1;
		
		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}
	
}
