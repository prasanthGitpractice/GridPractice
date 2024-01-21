package scenario;

import org.testng.annotations.Test;

public class TestVideos_ForWhile 
{
	@Test
	public void m1()
	{

		for(int i = 1;i <=5;i++)
		{
			int j = 1;
			while(j <=i)
			{
				System.out.print("HELLO");
			}
			System.out.println();
		}
		//System.out.println();
	}

	/*
	 * 
Code Snippets on for loop
-------------------------

1. 
for(int i = 1; i<=10;i++)
{
	SOP(i++);
}
O/p: 
1
3
5
7
9

2.
for(int i = 1; i<=10;i++)
{
	SOP(--i);
}
O/p: prints zero for infinite times

3.
int i = 1;

for(; i<=10;)
{
	SOP(i++);
}
O/p:
1
2
3
4
5
6
7
8
9
10

4.
for(int i = 1;;i++)
{
	SOP(i++);
}
O/p: infinite for loop and it will print only odd numbers

5.
for(; false;)
{
	SOP("Hello");
}
O/p: unreachable code at line hello

6.
for(;true;)
{
	SOP("Hello");
}
O/p: infinite for  loop

7.
for(;;)
{
	SOP("Hello");
}
o/p: infinite for loop

8.
for(int i = 1; i<=10;i++);
{
	SOP(i);
	SOP("Hello");
}
o/p: i can not be resolved to a variable.bcoz for loop terminated at declaration it self

9.
int i;
for(i = 1; i<=10;i++);
{
	SOP(i);
	SOP("Hello");
}
O/p: 
11
Hello

10.
for(int i = 1,j = 10;i<=5 && j >= 5;i++,j--)
{
	SOP(i+j);
}
o/p: 
11
11
11
11
11

11.
int i = 1;
for(SOP("Welcome");i<=5;SOP("Bye"))
{
	SOP("Hello");
	i++;
}
Welcome // welcome will be printed for only one time sinvce initialization part of loop will get executed only one time
Hello
Bye
Hello
Bye
Hello
Bye
Hello
Bye
Hello
Bye


12.
for(int i = 10;i>=1;i++)
{
	SOP("Hello");
}
o/p: infinite for loop

13.
for(int i = 1;i<=5;i--)
{
	SOP("Hello");
}
o/p: infinite for loop




Code Snippets on while loop
---------------------------

1.
while(true)
{
	SOP("Hello");
}
o/p: infinite loop

2.
while(false)
{
	SOP("Hello");
}
o/p: unreachable code at hello


3.
while(1)
{
	SOP("Hello");
}
o/p: can not convert from int to boolean



4.
while(0)
{
	SOP("Hello");
}
o/p: can not convert from int to boolean



5.
int num = 1234;

while(num > 0)
{
	SOP(num%10);
	num /= 10;
}
O/p: 
4
3
2
1

Code Snippets on nested Loop
----------------------------

1. 

for(;;)
{
	for(;;)
	{
		SOP("Hello");
	}
}
O/p: Infinite Loop

2.

for(;;)
{
	for(;;)
	{
		SOP("Hello");
	}
	for(;;)
	{
		SOP("Bye");
	}
}

o/p: unreachable second inner for loop

3.

for(;;)
{
	for(int i = 1;i<=1;i++)
	{
		SOP("Hello");
	}
	for(int i = 1;i<=1;i++)
	{
		SOP("Bye");
	}
}
o/p: 
hello
bye  will be printed infinite times

4.

for(;;)
{
	for(int i = 1;i<=1;i++)
	{
		SOP("Hello");
	}
	for(int i = 1;i<=1;i++)
	{
		SOP("Bye");
	}
}
o/p: 
hello
bye  will be printed infinite times

5.

for(int i = 1;i <= 5;i++)
{
	for(int j = 1;j<=5-i;j++)
	{
		System.out.print(" ");
	}
	for(int j = 1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
o/p: 
    *
   **
  ***
 ****
*****

6.

for(int i = 1;i <=5;i++)
{
	int j = 1;
	while(j <=i)
	{
		System.out.print("HELLO")
	}
	System.out.println();
}
o/p: synyax error...insert ; after hello sysout statement


7.
		for(int i = 1;i <=5;i++)
		{
			int j = 1;
			while(j <=i)
			{
				System.out.print("HELLO");
			}
			System.out.println();
		}
		o/p: hello wil be printed for infinite times...since j value is not getting updated inside while loop..so condition j<=i is becoming always true..thats whyinner while loop is becoming infinite.
	 */

}
