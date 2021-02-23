package cs146F20.Ha.project2;

import java.io.*;

class BruteForce {
	public static int[]  maxSubArraySum(int a[]) 
	{
		int maxSum = a[0], maxTemp = 0;
		int arrive = 0, depart = 0;
		//double for-loop to iterate through every possibility
		for (int i = 0; i < a.length; i++) 
		{
			maxTemp = 0;
			for(int j = i; j<a.length;j++)
			{
				//adds values as j iterates through the loop
				maxTemp = maxTemp + a[j];
				//replaces the max if the temporary max is bigger
				if (maxTemp > maxSum) 
				{
					maxSum = maxTemp;
					depart = j;	
					arrive = i;
				}
			}
		}
		//creates an array with the results
		int[] result = new int[3];
		result[0]=maxSum; result[1]=arrive; result[2]=depart;
		return result;
	}
	
	
}
