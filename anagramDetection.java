/*PARAMETER:    anagrams are case insensitive
*RESULT:        write a method that returns true if the
*               two arguments given are anagrams of each 
*               other; return false otherwise. 
*EXAMPLE:       "foefet" is an anagram of "toffee"
 */

import java.util.*;
public class Kata {
  public static boolean isAnagram(String test, String original) {
    if( test == null || original == null || test.length() != original.length())
      return false;
      
    char ch1 [] = test.toLowerCase().toCharArray(); 
    char ch2 [] = original.toLowerCase().toCharArray(); 
    
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    
    return Arrays.equals(ch1, ch2);
    
  }
}