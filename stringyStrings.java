/*PARAMETER: Given an int size
*            return a string
*RESULT:   Write a function that takes a
*          integer size and returns a sequence
*          of 1s and 0s equal to the length of int size.
*EXAMPLE:   A string with the size 6 would return: '101010'
*/

public class Kata {
  public static String stringy(int size) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < size; i++){
    if (i % 2 ==0) { 
      builder.append(1); 
    } else {
      builder.append(0); 
    }
    }
    return builder.toString();
  }
}
