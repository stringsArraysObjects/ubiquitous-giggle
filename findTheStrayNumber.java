/*PARAMETER:  input will always be valid 
* RESULT:     complete the method which
*             accepts an array and returns
*             theat single different number.
*RESULT:      [17, 17, 3, 17, 17, 17, 17] ==> 3
 */


import java.util.Arrays;

class Solution {
  static int stray(int[] numbers) {
    return Arrays.stream(numbers).reduce(0, (a, b) -> a ^ b);
  }
}