/*PARAMETER: accum is a string which 
             includes only letters from a..z and A..Z.
*RESULT:  a string that the characters repeat based on 
          their index.  And the first letter of each
          character is uppercase.
*EXAMPLE: accum("abcd") -> "A-Bb-Ccc-Dddd"
          accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
*PSUEDOCODE: repeats a character the same number of times as its index 
             and the first letter is uppercase.
*/

public class Accumul {
  public static String accum(String s) {
    StringBuilder bldr = new StringBuilder();
    int i = 0;
    for(char c : s.toCharArray()) {
      if(i > 0) bldr.append('-');
      bldr.append(Character.toUpperCase(c));
      for(int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
      i++;
    }
    return bldr.toString();
  }
}
