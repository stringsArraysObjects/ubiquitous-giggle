//PARAMETER: all inputs will be strings,
//           and every string is a perfectly 
//           valid representation of an integral number
//RESULT:   We need a function that can transform a string into a number
//EXAMPLE:  "1405" --> 1405
//PSEUDOCODE: change the data type from a string input to an integer output

import java.lang.*;
public class StringToNumber {
  public static int stringToNumber(String str) {
    return Integer.valueOf(str).intValue();
  }
}
