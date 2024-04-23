//RESULT: write a method to calculate the total 
//        time required for all the customers to check out!
//EXAMPLE: QueueTime([5,3,4], 1) 
//         should return 12 
//         because when there is 1 till, the total time is just the sum of the times          

import java.util.Arrays;
public class Solution {

    public static int solveSuperMarketQueue(int[] customers, int n) {
      int[] result = new int[n];
		  for(int i = 0; i < customers.length; i++){
	    	result[0] += customers[i];
	    	Arrays.sort(result);
	    }
		  return result[n-1];
    }
    
}

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

  public static int solveSuperMarketQueue(int[] customers, int n) {
    PriorityQueue<Integer> q = new PriorityQueue<>();
    for (int i = 0; i < n; i++)
      q.add(0);
    for (int t : customers)
      q.add(q.remove() + t);
    return Collections.max(q);
  }
    
}