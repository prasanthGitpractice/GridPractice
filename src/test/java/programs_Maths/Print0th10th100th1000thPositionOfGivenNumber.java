package programs_Maths;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Print0th10th100th1000thPositionOfGivenNumber 
{
	@Test
	public void printUnitAnd10th100th1000thPositionOfGivenNumber()
	{
		int num=1234567887;
		int count=1;
		while(num>0)
		{
			int rem = num%10;
			if(count==3)
			{
				System.out.println(rem);
				break;
			}
			num=num/10;
			count++;
			
		}
		
		//OR
		
//		String String_Number = Integer.toString(num);
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number which is equals to no Of Zeros in which the required Position Contains :eg: 1 for 10thOrDecimal Position");//Enter Required Position as digit which is equal to its no of Zeros
//		int i = sc.nextInt();
//		int position=String_Number.length()-1-i;
//		char zeroth = getDigitOfParticularPosition(String_Number, position);
//		System.out.println(zeroth);
//		sc.close();
	}

	public char getDigitOfParticularPosition(String numString, int digitPosition)
	{
		if(digitPosition>=0 && digitPosition<=numString.length()-1)
		{
			return numString.charAt(digitPosition);
		}
		else
		{
			System.out.println("Entered Position not exist in Given Number");
			return 'x';
		}
	}

	// Wrong Program
	public static void main(String[] args) 
	{
		int number = 1234567890; // Replace this with your desired number

		// Convert the number to a string
		String numberStr = Long.toString(number);

		// Extract digits at positions 0, 10, 100, and 1000
		char digitAt0 = getDigitAtPosition(numberStr, 0);
		char digitAt10 = getDigitAtPosition(numberStr, 10);
		char digitAt100 = getDigitAtPosition(numberStr, 100);
		char digitAt1000 = getDigitAtPosition(numberStr, 1000);

		// Display the results
		System.out.println("Digit at position 0: " + digitAt0);
		System.out.println("Digit at position 10: " + digitAt10);
		System.out.println("Digit at position 100: " + digitAt100);
		System.out.println("Digit at position 1000: " + digitAt1000);
	}

	// Method to get the digit at a specific position in a string
	private static char getDigitAtPosition(String numberStr, int position) {
		if (position >= 0 && position < numberStr.length()) {
			return numberStr.charAt(position);
		} else {
			// Return a placeholder if the position is out of range
			return 'X';
		}
	}

}
