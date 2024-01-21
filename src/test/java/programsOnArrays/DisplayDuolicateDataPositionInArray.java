package programsOnArrays;

import org.testng.annotations.Test;

public class DisplayDuolicateDataPositionInArray 
{
	@Test
	public void m1()
	{
		int[] a = { 4,6,7,8,10,8,8,8}; // o/p: 6, 7
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					if (i < j) {
						System.out.println(j + 1);
						break;
					}
				}
			}
		}
	}
}
