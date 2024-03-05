/*PARAMETERS:  There will always be only one integer that
*              appears an odd number of times.
*RESULT:       Given an array of integers, find the one that 
*              odd number of times.
*EXAMPLE:      [7] should return 7, because it occurs 1 time (which is odd).
*              [0] should return 0, because it occurs 1 time (which is odd).
*              [1,1,2] should return 2, because it occurs 1 time (which is odd).  
*/

import static java.util.Arrays.stream;

public class FindOdd {
  public static int findIt(int[] arr) {
    return stream(arr).reduce(0, (x, y) -> x ^ y);
  }
}

public class FindOdd {
	public static int findIt(int[] A) {
  	int odd=0;
    for (int item: A)
      {
        odd = odd ^ item;
      }
    
    return odd;
  }
}