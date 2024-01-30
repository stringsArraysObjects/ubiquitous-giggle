/*PARAMETERS: input sequence contains minimum
*               two elements and every element
*               is an integer.
*RESULT:      given a sequence of numbers, find 
*             the largest pair sum in the sequence.
*EXAMPLE:     [10, 14, 2, 23, 19] -->  42 (= 23 + 19)
*/
import java.util.Arrays;
public class Solution{
    public static int largestPairSum(int[] numbers){
       Arrays.sort(numbers);
        return numbers[numbers.length-1]+numbers[numbers.length-2];
    }
}