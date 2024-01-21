package o9Solutions;

import org.testng.annotations.Test;

public class ProgramToIdentifyFrequencyOfOccurenceOfGivenStringInOtherString 
{
	@Test
	public void programToIdentifyFrequencyOfOccurenceOfGivenStringInOtherString()
	{
		String s="javaseleniumeclipsejavatestingjavahdgaychanjclajjavajahsdchlkx";
		String key="java";
		int lastIteration=key.length();
		
		int count=0;
		for(int i=0; i<=s.length()-lastIteration; i++)
		{
			String subStr=s.substring(i, i+lastIteration);
			if(subStr.equals(key))
			{
				System.out.println(subStr);
				count++;
			}
		}
		System.out.println(key+" is repeated "+count+" times in given String");
	}
}
