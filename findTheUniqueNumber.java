/*PARAMETERS: It is guaranteed that array contains at least 3 numbers.
*RESULT: Given an array with some numbers
*        which are all equal except for one. Find
*        the unique one.
*EXAMPLE: Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
*/
import java.util.Arrays;
 public class Kata {
    public static double findUniq(double[] arr) {
      Arrays.sort(arr);
      return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
    }
}

public class Kata {
  public static double findUniq(double arr[]) {
    final double x = arr[arr[0] == arr[1] ? 0 : 2];
    for (double y : arr)
      if (y != x)
        return y;
    throw new RuntimeException("no unique number found");
  }
}