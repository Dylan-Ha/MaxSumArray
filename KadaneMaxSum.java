package cs146F20.Ha.project2;

public class KadaneMaxSum 
{
    private static int arrive= -1;
    private static int depart= -1;
    private static int sum= 0;

    //Function that finds the largest continuous sum and indexes at the start and end of this streak
    //takes an array of integers as variable
    public static int[] kadaneMaxSum(int[] a)
    {
    	//temporary values that are replaced if conditions are met
        int sumUntilNow = 0;
        int tempIndex = 0;
        int tempSum = 0;
        
        //for every element it will iterate through the whole array, finding the sum of all the previous numbers.
        //The sum/arrive/depart variables are updated every time the overall sum is increased
        for (int i = 0; i < a.length; i++) {
            tempSum = tempSum + a[i];

            if(tempSum > sumUntilNow){
                sumUntilNow = tempSum;
                arrive = tempIndex;
                depart = i;
                sum = sumUntilNow;
            }
            //if the sum is negative at the end, it just goes to the next index
            if(tempSum<0){
                tempSum = 0;
                tempIndex = i + 1;
            }
        }
        //creates an array with the 3 variables
        int[] result = new int[3];
        result[0]=sum;
        result[1]= arrive;
        result[2] = depart;
        return result;
    }
    
    
}
  
