package scenario;

import org.testng.annotations.Test;

public class TestVideos_Loops 
{
	@Test
	public void m1()
	{
		for(;;)
		{
			for(;;)
			{
				while(true)
				{
					System.out.println("Hello");
					break;
				}
				break;
			}
			for(;;)
			{
				while(true)
				{
					System.out.println("Bye");
				}
				//break;
			}
		}
		//System.out.println();

	}

/*Code Snippets for break and continue
------------------------------------

1.
for(;;)
{
	SOP("Hello");
	break;
} O/p: Hello

2.
for(int i = 1; i <= 10; i++)
{
	
	for(;;)
	{
		SOP("Bye");
	}
	break;
}

o/p: ureachable code error at break line bcoz of inner infinite loop.

3.
for(int i = 1; i <= 10; i++)
{
	
	for(;;)
	{
		SOP("Hello");
	}
}

o/p: Infinite loop.

4.
for(int i = 1; i <= 10; i++)
{
	for(;;)
	{
		SOP("Hello");
		break;
	}
	for(;;)
	{
		SOP("Bye");
		break;
	}
}

O/p: Hello
	 Bye

5.
for(int i = 1; i <= 10; i++)
{
	SOP("Hello");
	
	if(i<=5)
	{
		continue;
	}
	else
	{
		break;
	}
	SOP("Bye");
}
O/p: unreachable code at bye statement. if bye statement is not there hello will get printed 6 times.

6.
for(int i = 1; i <= 10; i++)
{
	SOP("Hello");
	
	break;
	
	SOP("Bye");
}
O/p: Unreachable code at bye

7.
for(int i = 1; i <= 10; i++)
{
	SOP("Hello");
	
	if(i<=5)
	{
		continue;
	}
	else
	{
		break;
	}
	SOP("Bye");
}
O/p: unreacheble code at bye.

8.
for(int i = 1; i <= 10; i++)
{
	for(;;)
	{
		SOP("Hello");
		break;
	}
	for(;;)
	{
		SOP("Bye");
		break;
	}
	break;
}
o:p: Hello
	 Bye

9.
for(;;)
{
	for(;;)
	{
		SOP("Hello");
		break;
	}
	for(;;)
	{
		SOP("Bye");
		continue;
	}
	break;
}
O/p: unreachable code at 2nd break statement.

10.

for(;;)
{
	for(;;)
	{
		while(true)
		{
			SOP("Hello");
			break;
		}
		break;
	}
	for(;;)
	{
		while(true)
		{
			SOP("Bye");
		}
		break;
	}
}
O/p: unreachable code at last break statement.

*
*/
	
	
}
