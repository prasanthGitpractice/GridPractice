package programs_Maths;

import org.testng.annotations.Test;

public class Palindrome_Number 
{
	@Test
	public void palindrome_Number()
	{
		int org_num=1991;
		int num=org_num;
		int rev_Num=0;
		
		while(num>0)
		{
			int reminder=num%10;
			rev_Num=rev_Num*10+reminder;
			num=num/10;
		}
		if(rev_Num==org_num)
		{
			System.out.println(org_num+" is palindrome number");
		}
		else
			System.out.println(org_num+" is not palindrome number");
	}
}
