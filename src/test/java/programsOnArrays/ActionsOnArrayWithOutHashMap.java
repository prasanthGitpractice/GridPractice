package programsOnArrays;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ActionsOnArrayWithOutHashMap
{
	@Test
	public void uniqueNumbersOfArray()
	{
		int a[] = {5,4,4,2,5,4,2,1};
		for(int i=0; i<a.length;i++)
		{
			int count=0;
			for(int j=0; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					if(i>j)
						break;
					else
						count++;
				}
			}
			if(count==1)
				System.out.println(a[i]+" repeated "+count+"times");
		}	
		System.out.println();
	}
	
	
	@Test
	public void duplicateNumbersOfArray()
	{
		int a[] = {5,4,4,2,5,4,2,1};
		for(int i=0; i<a.length;i++)
		{
			int count=0;
			for(int j=0; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					if(i>j)
						break;
					else
						count++;
				}
			}
			if(count>1)
				System.out.println(a[i]+" repeated "+count+"times");
		}	
		System.out.println();
	}
	
	
	@Test
	public void occuranceOfNumbers()
	{
		int a[] = {5,4,4,2,5,4,2,1};
		for(int i=0; i<a.length;i++)
		{
			int count=0;
			for(int j=0; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					if(i>j)
						break;
					else
						count++;
				}
			}
			if(count>=1)
				System.out.println(a[i]+" repeated "+count+"times");
		}	
		System.out.println();
	}
	
	@Test
	// Inorder to remove duplicates from an array we have to sort array.
	public void removeDuplicateNumbers()
	{
		int a[] = {5,4,4,2,3,5,4,2,1};
		int temp[]=new int[a.length];
		
		
//		int length=0;
//		int n=0;
//		for(int i=0; i<a.length;i++)
//		{
//			int count=0;
//			for(int j=0; j<a.length; j++)
//			{
//				if(a[i]==a[j])
//				{
//					if(i>j)
//						break;
//					else
//						count++;
//				}
//			}
//			if(count==1)
//			{
//				temp[n++]=a[i];
//				length++;
//			}
//				
//		}	
//		a=new int[length];
//		for(int i=0; i<length; i++)
//		{
//			a[i]=temp[i] ;
//			System.out.print(temp[i]+" ");
//		}
		
		//    		(OR)
		
		int j=0;
		Arrays.sort(a); // SORTING IS IMPORTANT FOR THIS TECHNIQUE
		for(int i=0; i<a.length-1;i++)//when i is last index...i+1...will become indexoutbounds..thats why taken lastindex-1
		{
			
			if(a[i]!=a[i+1])
			{
				temp[j++]=a[i];
			}
		}
		temp[j++]=a[a.length-1];
		
		for (int n = 0; n < j; n++) 
		{
            System.out.print(temp[n]);
        }
		System.out.println();
	}
}

