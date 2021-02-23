package cs146F20.Ha.project2;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlgorithmTests {
	
	ReadFile readData = new ReadFile();
	int[] data = readData.read();
	BruteForce brute = new BruteForce();
	Recursive recurse = new Recursive();
	KadaneMaxSum kadane = new KadaneMaxSum();
	
	@Test
	public void test0()
	{
		long a,b,c,d,e,f;
		int [] inputTenThousand = new int[1000];               // Random 10000
	    for (int i = 0; i < inputTenThousand.length; i++) {
	       inputTenThousand [i] = (int) (Math.random () * 1000);
	    }
	    a = System.nanoTime();
	    kadane.kadaneMaxSum(inputTenThousand);
	    b = System.nanoTime();
	    recurse.maxContinuousSum(inputTenThousand, 0, 999);
	    c = System.nanoTime();
	    brute.maxSubArraySum(inputTenThousand);
	    d = System.nanoTime();
	    long ba = b-a;
	    long bc = c-b;
	    long dc = d-c;
	    System.out.println(ba);
	    System.out.println(bc);
	    System.out.println(dc);
	}

	@Test
	public void test1()
	{
		long a,b,c,d,e,f;
		//creates an array with values from x to x+100 in order to separate test cases
		int[] testData = Arrays.copyOfRange(data, 0,100);
		//this is the array with the answers
		int[] testResult= Arrays.copyOfRange(data,100 ,103);
		//finds the answer using the brute force method
		a = System.nanoTime();
		int[] bruteData = brute.maxSubArraySum(testData);
		b = System.nanoTime();
		//compares the elements of the brute force method array and the answers
		assertEquals(bruteData[0],testResult[0]);
		assertEquals(bruteData[1],testResult[1]);
		assertEquals(bruteData[2],testResult[2]);
		//does the same as the above but isntead with the kadane method
		c = System.nanoTime();
		int[] kadaneData = kadane.kadaneMaxSum(testData);
		d = System.nanoTime();
		assertEquals(kadaneData[0],testResult[0]);
		assertEquals(kadaneData[1],testResult[1]);
		assertEquals(kadaneData[2],testResult[2]);
		//compares answer from the divide and conquer method with inputs from answers
		e = System.nanoTime();
		assertEquals(recurse.maxContinuousSum(testData, testResult[1],testResult[2]), testResult[0]);
		f = System.nanoTime();
		//printing out runtimes
		long ba = b-a;
		long dc = d-c;
		long fe =  f-e;
		
	}
	//same as test 1 but values changed based on which "array" is used
	@Test
	public void test2()
	{
		int[] testData = Arrays.copyOfRange(data, 103,203);
		int[] testResult= Arrays.copyOfRange(data,203 ,206);
		int[] bruteData = brute.maxSubArraySum(testData);
		assertEquals(bruteData[0],testResult[0]);
		assertEquals(bruteData[1],testResult[1]);
		assertEquals(bruteData[2],testResult[2]);
		
		int[] kadaneData = kadane.kadaneMaxSum(testData);		
		assertEquals(kadaneData[0],testResult[0]);
		assertEquals(kadaneData[1],testResult[1]);
		assertEquals(kadaneData[2],testResult[2]);
		
		assertEquals(recurse.maxContinuousSum(testData, testResult[1],99), testResult[0]);
		
		
		
	}
	@Test
	public void test3()
	{
		int[] testData = Arrays.copyOfRange(data, 206,306);
		int[] testResult= Arrays.copyOfRange(data,306 ,309);
		int[] bruteData = brute.maxSubArraySum(testData);
		assertEquals(bruteData[0],testResult[0]);
		assertEquals(bruteData[1],testResult[1]);
		assertEquals(bruteData[2],testResult[2]);
		
		int[] kadaneData = kadane.kadaneMaxSum(testData);		
		assertEquals(kadaneData[0],testResult[0]);
		assertEquals(kadaneData[1],testResult[1]);
		assertEquals(kadaneData[2],testResult[2]);
		
		assertEquals(recurse.maxContinuousSum(testData, testResult[1],testResult[2]), testResult[0]);
	}
	
	@Test
	public void test4()
	{
		int[] testData = Arrays.copyOfRange(data, 309,409);
		int[] testResult= Arrays.copyOfRange(data,409 ,412);
		int[] bruteData = brute.maxSubArraySum(testData);
		assertEquals(bruteData[0],testResult[0]);
		assertEquals(bruteData[1],testResult[1]);
		assertEquals(bruteData[2],testResult[2]);
		
		int[] kadaneData = kadane.kadaneMaxSum(testData);		
		assertEquals(kadaneData[0],testResult[0]);
		assertEquals(kadaneData[1],testResult[1]);
		assertEquals(kadaneData[2],testResult[2]);
		
		assertEquals(recurse.maxContinuousSum(testData, testResult[1],testResult[2]), testResult[0]);
		
		
	}
	@Test
	public void test5()
	{
		int[] testData = Arrays.copyOfRange(data, 412,512);
		int[] testResult= Arrays.copyOfRange(data,512 ,515);
		int[] bruteData = brute.maxSubArraySum(testData);
		assertEquals(bruteData[0],testResult[0]);
		assertEquals(bruteData[1],testResult[1]);
		assertEquals(bruteData[2],testResult[2]);
		
		int[] kadaneData = kadane.kadaneMaxSum(testData);		
		assertEquals(kadaneData[0],testResult[0]);
		assertEquals(kadaneData[1],testResult[1]);
		assertEquals(kadaneData[2],testResult[2]);
		
		assertEquals(recurse.maxContinuousSum(testData, testResult[1],testResult[2]), testResult[0]);
	}
	
	@Test
	public void test6()
	{
		int[] testData = Arrays.copyOfRange(data, 515,615);
		int[] testResult= Arrays.copyOfRange(data,615 ,618);
		int[] bruteData = brute.maxSubArraySum(testData);
		assertEquals(bruteData[0],testResult[0]);
		assertEquals(bruteData[1],testResult[1]);
		assertEquals(bruteData[2],testResult[2]);
		
		int[] kadaneData = kadane.kadaneMaxSum(testData);		
		assertEquals(kadaneData[0],testResult[0]);
		assertEquals(kadaneData[1],testResult[1]);
		assertEquals(kadaneData[2],testResult[2]);
		
		assertEquals(recurse.maxContinuousSum(testData, testResult[1],testResult[2]), testResult[0]);
		
		
	}
	@Test
	public void test7()
	{
		int[] testData = Arrays.copyOfRange(data, 618,718);
		int[] testResult= Arrays.copyOfRange(data,718 ,721);
		int[] bruteData = brute.maxSubArraySum(testData);
		assertEquals(bruteData[0],testResult[0]);
		assertEquals(bruteData[1],testResult[1]);
		assertEquals(bruteData[2],testResult[2]);
		
		int[] kadaneData = kadane.kadaneMaxSum(testData);		
		assertEquals(kadaneData[0],testResult[0]);
		assertEquals(kadaneData[1],testResult[1]);
		assertEquals(kadaneData[2],testResult[2]);
		
		assertEquals(recurse.maxContinuousSum(testData, testResult[1],testResult[2]), testResult[0]);
	}
	
	@Test
	public void test8()
	{
		int[] testData = Arrays.copyOfRange(data, 721,821);
		int[] testResult= Arrays.copyOfRange(data,821 ,824);
		int[] bruteData = brute.maxSubArraySum(testData);
		assertEquals(bruteData[0],testResult[0]);
		assertEquals(bruteData[1],testResult[1]);
		assertEquals(bruteData[2],testResult[2]);
		
		int[] kadaneData = kadane.kadaneMaxSum(testData);		
		assertEquals(kadaneData[0],testResult[0]);
		assertEquals(kadaneData[1],testResult[1]);
		assertEquals(kadaneData[2],testResult[2]);
		
		assertEquals(recurse.maxContinuousSum(testData, testResult[1],testResult[2]), testResult[0]);
		
		
	}
	@Test
	public void test9()
	{
		int[] testData = Arrays.copyOfRange(data, 824,924);
		int[] testResult= Arrays.copyOfRange(data,924 ,927);
		int[] bruteData = brute.maxSubArraySum(testData);
		assertEquals(bruteData[0],testResult[0]);
		assertEquals(bruteData[1],testResult[1]);
		assertEquals(bruteData[2],testResult[2]);
		
		int[] kadaneData = kadane.kadaneMaxSum(testData);		
		assertEquals(kadaneData[0],testResult[0]);
		assertEquals(kadaneData[1],testResult[1]);
		assertEquals(kadaneData[2],testResult[2]);
		
		assertEquals(recurse.maxContinuousSum(testData, testResult[1],testResult[2]), testResult[0]);
	}
	
	@Test
	public void test10()
	{
		int[] testData = Arrays.copyOfRange(data, 927,1027);
		int[] testResult= Arrays.copyOfRange(data,1027 ,1030);
		int[] bruteData = brute.maxSubArraySum(testData);
		assertEquals(bruteData[0],testResult[0]);
		assertEquals(bruteData[1],testResult[1]);
		assertEquals(bruteData[2],testResult[2]);
		
		int[] kadaneData = kadane.kadaneMaxSum(testData);		
		assertEquals(kadaneData[0],testResult[0]);
		assertEquals(kadaneData[1],testResult[1]);
		assertEquals(kadaneData[2],testResult[2]);
		
		assertEquals(recurse.maxContinuousSum(testData, testResult[1],testResult[2]), testResult[0]);
		
		
	}
	

}