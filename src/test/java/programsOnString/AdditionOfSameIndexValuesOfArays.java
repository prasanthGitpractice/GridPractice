package programsOnString;

import org.testng.annotations.Test;

public class AdditionOfSameIndexValuesOfArays 
{
	@Test
	public void additionOfSameIndexValuesOfArays()
	{
		int a[]={1,2,3};
        int b[]={2,4,6,8};
        int maxlength= Math.max(a.length, b.length);
        int c[]=new int[maxlength];
        for(int i=0; i<a.length; i++)
        {
            c[i]=a[i];
        }
        
        for(int i=0; i<b.length; i++)
        {
            int sum=b[i]+c[i];
            System.out.println(sum+" ");
        }
	}
}
