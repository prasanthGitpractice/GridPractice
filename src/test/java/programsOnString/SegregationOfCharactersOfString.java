package programsOnString;

import org.testng.annotations.Test;

public class SegregationOfCharactersOfString 
{
	@Test
	public void segregationOfCharactersOfString()
	{
		String s="a1c$d3R%";
		String alp="";
		String num="";
		String spchar="";
		
		for(int i=0; i<s.length(); i++)
		{
			if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z'))
				alp=alp+s.charAt(i);
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
				num=num+s.charAt(i);
			else
				spchar=spchar+s.charAt(i);
		}
		
		System.out.println(alp+" "+num+" "+spchar);
	}
}
