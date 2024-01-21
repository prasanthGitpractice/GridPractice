package programsOnString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class ProgramToCheckPresenceOfWordInSentence 
{
	@Test
	public void programToCheckPresenceOfWordInSentence()
	{
		String sentence = "This is a sample sentence with some occurrences of the word example.";

        // Word to search for
        String wordToFind = "example";

        // Create a regex pattern for the word (surrounded by word boundaries)
        String regex = "\\b" + Pattern.quote(wordToFind) + "\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        // Create a Matcher
        Matcher matcher = pattern.matcher(sentence);

        // Count occurrences
        int count = 0;
        while (matcher.find()) {
            count++;
        }

        // Display the result
        System.out.println("The word \"" + wordToFind + "\" occurs " + count + " times in the sentence.");
	}
	
	
	@Test
	public void programToFindUpperAndLowerCaseLettersInStringUsingPatternAndMatcher()
	{
		String inputString = "Hello World! This is a Sample String.";

        // Define patterns for uppercase and lowercase characters
        Pattern uppercasePattern = Pattern.compile("[A-Z]");
        Pattern lowercasePattern = Pattern.compile("[a-z]");

        // Create Matchers
        Matcher uppercaseMatcher = uppercasePattern.matcher(inputString);
        Matcher lowercaseMatcher = lowercasePattern.matcher(inputString);

        // Count occurrences of uppercase and lowercase characters
        int uppercaseCount = 0;
        int lowercaseCount = 0;

        while (uppercaseMatcher.find()) {
            uppercaseCount++;
        }

        while (lowercaseMatcher.find()) {
            lowercaseCount++;
        }

        // Display the result
        System.out.println("Uppercase characters count: " + uppercaseCount);
        System.out.println("Lowercase characters count: " + lowercaseCount);
	}
}
