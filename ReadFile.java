package cs146F20.Ha.project2;

import java.io.*;
import java.util.*;
public class ReadFile {
	//reads files
	public int[] read() 
	{
		//creates new file with data that needs to be read
		File data = new File("data/maxSumtest.txt");
		
		int[] num = new int[1030];
		Scanner scan;
		int i = 0;
		//try-catch block for scanner to test if file actually exists
		try
		{
			//adds data to array as long as there is data to read
			scan = new Scanner(data);
			while(scan.hasNextInt())
			{
				
				num[i++] = scan.nextInt();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//returns array with int values
		return num;
	}
	
}

