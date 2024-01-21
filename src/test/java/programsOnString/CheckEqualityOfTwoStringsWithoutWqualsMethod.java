package programsOnString;

import java.awt.AWTException;

import org.testng.annotations.Test;

public class CheckEqualityOfTwoStringsWithoutWqualsMethod 
{
	@Test
	public void checkEqualityOfTwoStringsWithoutWqualsMethod() throws AWTException
	{
		
		String str1 = "Hello";
        String str2 = "Hello";

        // Check if the lengths are the same
        boolean areEqual = (str1.length() == str2.length());

        // If lengths are the same, compare each character
        if (areEqual) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    areEqual = false;
                    break; // Break out of the loop if a mismatch is found
                }
            }
        }

        // Display the result
        if (areEqual) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
	}
}
