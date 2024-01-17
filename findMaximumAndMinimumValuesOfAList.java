/*PARAMETER: whole numbers
*RESULT: return the largest and lowest number in the array.
*EXAMPLE: [4,6,2,1,9,63,-134,566] -> max = 566, min = -134
*PSUEDOCODE: sort the array in ascending order
*            return the element at index 0 as min
             return the element at  index length - 1 as max
 */


import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Kata {

  public int min(int[] list) {
    Arrays.sort(list);
   return list[0];
    
  }
  
  public int max(int[] list) {
    Arrays.sort(list);
    int n = list.length;
    return list[n - 1];
  }
}