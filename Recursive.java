package cs146F20.Ha.project2;

public class Recursive {
    private static int sum=0;
  
    // Find the maximum possible sum in a[] such that a[middle] is part of it
    static int maxSum(int a[], int start, int middle, int end)
    {
        // finding sum of elements on left of middle
        int sum = 0;
        int leftSum= 0;
        for (int i = middle; i >= start; i--)
        {
        	
            sum = sum + a[i];
            if (sum > leftSum)
            	
                leftSum = sum;
        }

        // finding sum of elements on the right of middle
        sum = 0;
        int rightSum = 0;
        
        for (int i = middle + 1; i <= end; i++)
        {
            sum = sum + a[i];
            if (sum > rightSum)
            	
                rightSum = sum;
        }

        // returns sum of the left sum and right sum
        return leftSum + rightSum;
    }
    //finds the largest continuous sum in a[]
    static int maxContinuousSum(int a[], int start, int end)
    {
        // if there is only 1 element - the base case
        if (start == end)
            return a[start];

        // the middle index of the array
        int middle = (start + end)/2;

   /*
        Return the maximum of the following three
		a) Maximum subarray sum in left half (Make a recursive call)
		b) Maximum subarray sum in right half (Make a recursive call)
		c) Maximum subarray sum such that the subarray crosses the midpoint
	*/
        //finds largest continuous sum in left and right arrays then compares them at the end
        return Math.max(Math.max(maxContinuousSum(a, start, middle),
                maxContinuousSum(a, middle+1, end)),
                maxSum(a, start, middle, end));
    }
}
