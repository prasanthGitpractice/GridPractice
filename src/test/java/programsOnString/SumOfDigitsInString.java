package programsOnString;

import org.testng.annotations.Test;

public class SumOfDigitsInString 
{
	@Test
	public void sumOfDigitsInString()
	{
		String s="a2b4c6";
		int sum=0;
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				//since characters can not be added directly...so going for ascii values..48 is ascii value of "0"
				int n=s.charAt(i)-48;//ascii value of 2 is 50---->50-48=2 which is actual value...like this values will be added in each iteration for numeric values
				sum=sum+n; // 2-0=2----> (Ascii value of 'number' - Ascii value of 0)= number
			}
		}
		System.out.println(sum);
	}

	
}
