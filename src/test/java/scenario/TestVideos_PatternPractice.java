package scenario;

import org.testng.annotations.Test;

public class TestVideos_PatternPractice 
{
	//    1
	//   1A
	//  1A2
	// 1A2B
	//1A2B3

	@Test
	public void m1()
	{
		int n=5;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=n;j++)
			{
				if(j<=n-i)
				{
					System.out.print(" ");
				}
				else
				{
					
				}
			}
		}
	}
		


		/*
		 * 
1.

a
bc
def
ghij
klmno

public void m1()
	{
		char c='a';
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}
	}

2.

1
ab
123
abcd
12345

public void m1()
	{
		for(int i=1; i<=5; i++)
		{
			char c='a';
			for(int j=1; j<=i; j++)
			{
				if(i%2==0)
					System.out.print(c++);
				else
					System.out.print(j);
			}
			System.out.println();
		}
	}

3.

1
ab
234
cdef
56789


public void m1()
	{
		int x=1;
		char c='a';
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i%2==0)
					System.out.print(c++);
				else
					System.out.print(x++);
			}
			System.out.println();
		}
	}

4.

		 *
		 **
		 * *
		 *  *
		 *****


public void m1()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i==n)
				{
					System.out.print("*");
				}
				else
				{
					if(j==1 || j==i)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

5.

1
22
333
4444
55555

6.

    a
   bc
  cde
 fghi
jklmn

public void m1()
	{
		int n=5;
		char c='a';
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j<=n-i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(c++);
				}
			}
			System.out.println();
		}
	}

7.

		 *
		 **
		 * *
		 *  *
		 *****


	 public void m1()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j<=n-i)
				{
					System.out.print(" ");
				}
				else
				{
					if(i==n)
					{
						System.out.print("*");
					}
					else
					{
						if(j==n || j==n-i+1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}

				}
			}
			System.out.println();
		}
	}

8.

    a
   bc
  dAe 
 fBCg  
hIJKl

9.

    a
   BC
  def
 GHIJ
klmno

10.

    a
   bc
  dEf
 gHIj
bKLMc

11.

    1
   1A
  1A2
 1A2B
1A2B3

12.

    a
   BC
  dEf
 GhIj
KlMnO

13.

		 *
		 * *
		 *   *
		 *     *
		 *********

14.

		 *
		 ***
		 * * *
		 *  *  *
		 *********

15.

    a
   bcD
  efgHI
 jklmNOP
qrstuVWXY

		 */
	
}
