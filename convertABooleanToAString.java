/*PARAMETER: Only valid inputs will be given
* RESULT:    A function which converts a given 
             boolean value inot its string representation.
*/

public class BooleanToString {
  public static String convert(boolean b){
    return Boolean.toString(b);
  }
}

public class BooleanToString {
  public static String convert(boolean b){
    return b ? "true" : "false";
  }
}