package programsOnString;

import org.testng.annotations.Test;

public class MultipleStringOutPut 
{
	//O/P
//	am from banglore I
//	from banglore I am
//	banglore I am from
//	I am from banglore
	@Test
	public void method()
	{
		String s="I am from banglore";
		String[] sa = s.split(" ");
		for(int i=0; i<sa.length ; i++)
		{
			String temp=sa[0];
			for(int j=1; j<sa.length; j++)
			{
				sa[j-1]=sa[j];
				System.out.print(sa[j-1]+" ");// we can print sa[j] also
			}
			System.out.print(sa[sa.length-1]=temp);
			System.out.println();
		}
	}
	
	
}
