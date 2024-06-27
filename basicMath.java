/*
*PARAMETER:
*RESULT:  return result of numbers after applying
          the chosen operation.
*EXAMPLE: ('+', 4, 7) --> 11
          ('-', 15, 18) --> -3
          ('*', 5, 5) --> 25
          ('/', 49, 7) --> 7  
*PSUEDOCODE: use the switch statement that provides a 
             number of possible execution paths */


public class BasicOperations
{
  public static Integer basicMath(String op, int v1, int v2)
  {
    int result = 0;
    switch( op ) {
      case "+" :  result = v1 + v2;
                  break;
      case "-" :  result = v1 - v2;
                  break;
      case "*" :  result = v1 * v2;
                  break;
      case "/" :  result = v1 / v2;
                  break;
    }
    return result;
  }
}