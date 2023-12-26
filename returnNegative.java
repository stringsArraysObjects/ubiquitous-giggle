/*PARAMETER: The numberber can be negative already
 *           in which case no chane is required.
 *           Zero is not checked for any specific sign.
 *           Negative zeros make no mathematical sense.
 * RESULT: Given a number you have to make it negative.
 * EXAMPLE: Kata.makeNegative(1);  // return -1
 * PSEUDOCODE: Basic control flow statement.
 */
public class Kata {

  public static int makeNegative(final int x) {
    if (x < 0){
        
        return x;
    
    }else{
        
        return x * -1;
        
    }
  }
  
}
/*Ternary equivalent */
public class Kata {

  public static int makeNegative(final int x) {
      return (x < 0) ? x : -x; 
  }
  
}