package programs_Maths;

import org.testng.annotations.Test;

public class FibonacciSeries 
{
	@Test
	public void fibonacciSeries()
	{
		// 0 1 1 2 3 5 8 13 ......
		int num1=0;
		int num2=1;
		int num_series=0;
		
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		while(num_series<30)
		{
			num_series=num1+num2;
			num1=num2;
			num2=num_series;
			System.out.print(num_series+" ");
		}
		System.out.println();
	}
}
