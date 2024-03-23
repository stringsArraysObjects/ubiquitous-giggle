/*PARAMETERS: The input will be a non-negative integer.
*RESULT:      Given n, take the sum of the digits of n. 
*             If that value has more than one digit, continue
*             reducing in this way until a single-digit number is produced.
*EXAMPLE:      16  -->  1 + 6 = 7
*              942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
*/

public class DRoot {
  public static int digital_root(int n) {
    return (1 + (n - 1) % 9);
  }
}

