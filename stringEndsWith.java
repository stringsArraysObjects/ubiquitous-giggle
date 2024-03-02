/*PARAMETER: given a string
*RESULT: returns true if the first argument(string)
*        passed in ends with the 2nd argument (also a string).
*EXAMPLE: solution('abc', 'bc') // returns true
          solution('abc', 'd') // returns false
*PSEUDOCODE: check string 1 to determine if it 
*            ends with string 2.
*/
public class Kata {
  public static boolean solution(String str, String ending) {
    return str.endsWith(ending);
  }
}