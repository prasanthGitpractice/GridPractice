package java_practice;

public class Practice 
{
	public static void main(String[] args) {
		String s="This  is  tv";//checking for splitting of a string when multiple spaces present in between the words 
		
		String[] s1 = s.split(" ");
		
		for(int i=0; i<s1.length; i++)
		{
			System.out.println(s1[i].length());
		}
	}
}
