package programsOnArrays;

public class SwapTwoNumbersWithOut3rdVariable
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;// (OR)
		
		//a=(a+b)-(b=a); (OR)
		
		a=a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		System.out.println(a);
		System.out.println(b);
	}

}
