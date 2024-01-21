package java_practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ReadDataFromTextFile 
{
	@Test
	public void readTextFileData() throws Throwable
	{
		//Approach-1:
		 File f=new File("C:\\Users\\PRASANTH\\Desktop\\ReadDataFromTextFile.txt");
		 Scanner s=new Scanner(f); 
		 int count=0;
		 while(s.hasNext()) // we can also use hasNextLine() as well
		 { 
			 System.out.println(s.next()); // we can use nextLine() as well
			 count++;
		 }
		 System.out.println(count);
	 
		 //Approach-2:
		 FileReader fr=new FileReader("C:\\Users\\PRASANTH\\Desktop\\ReadDataFromTextFile.txt");
		 BufferedReader br=new BufferedReader(fr);
		 
		 String str;
		 
		 while((str = br.readLine())!=null)			 
		 {
			 System.out.println(str);
		 }
		 
		//Approach-3:
		 File f1=new File("C:\\Users\\PRASANTH\\Desktop\\ReadDataFromTextFile.txt");
		 Scanner s1=new Scanner(f1); 
		 
		 s1.useDelimiter("\\Z"); //Matches each line in File
		 System.out.println(s1.next());
		
	}
}



