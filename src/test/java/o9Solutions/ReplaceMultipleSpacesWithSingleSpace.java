package o9Solutions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class ReplaceMultipleSpacesWithSingleSpace 
{
	@Test
	public void approach1()
	{
		String s="   amma nanna   ";//O:P:  amma nanna
//		System.out.println(s.trim());
		String inputString = "This   is    a   string   with   multiple    spaces.";

        // Replace any number of consecutive white spaces with a single white space
        String replacedString = inputString.replaceAll("\\s+", " ");

        // Displaying the result
        System.out.println("Original String: \"" + inputString + "\"");
        System.out.println("String with Single White Space: \"" + replacedString + "\"");
	}
	
	@Test
	public void approach2()
	{
		String inputString = "This   is    a   string   with   multiple    spaces.";
		Pattern pattern = Pattern.compile("\\s+");
		Matcher matcher = pattern.matcher(inputString);
		String str = matcher.replaceAll(" ");
		System.out.println(str);
	}
}
