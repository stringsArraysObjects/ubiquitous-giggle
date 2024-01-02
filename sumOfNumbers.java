/*PARAMETER: given two integers a and b
//           which can be positive or negative
//           a and b are not ordered
//           if the two numbers are equal
//           return a or b.
//RESULT:    return the sum of all the integers
//           between and including a and b.
//EXAMPLE:   (1, 0) --> 1 (1 + 0 = 1)
//           (1, 2) --> 3 (1 + 2 = 3)
//PSEUDOCODE: use Math methods to find the 
//            range of numbers between the 
//            given values
//            interate over the numbers to
//            find the sum and store in variable
//            return variable.
*/

 public class Sum
  {
     public int GetSum(int a, int b)
     {
       int max = Math.max(a, b);
       int min = Math.min(a, b);
       int result = 0; 
       for(int  i = min; min<=max; min++){
         result += min;
       }      
      return result;
     }
  }

public class Sum
{
  public int GetSum(int a, int b)
  {
    return (a + b) * (Math.abs(a - b) + 1) / 2;
  }
}
