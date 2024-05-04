/*PARAMETERS:   All arrays or lists will always 
*               have at least one element, so you 
                don't need to check the length 
RESULT:         A method that returns both the 
*               minimum and maximum number of the given list/array.
*EXAMPLE:       [1,2,3,4,5] --> [1,5]
*/


import java.util.Arrays;

class MinMax {
    public static int[] minMax(int[] arr) {
        // Your awesome code here
         Arrays.sort(arr);
        return new int[]{arr[0],arr[arr.length-1]};
    }
}