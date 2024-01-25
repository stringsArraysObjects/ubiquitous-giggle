/*PARAMETERS: words and sentences
*             no sorting needed
*RESULT:    Write a function to split a string and
*           convert it into an array of words.
*EXAMPLE:  "I love arrays they are my favorite" 
            ==> 
            ["I", "love", "arrays", "they", "are", "my", "favorite"]
*PSEUDOCODE:
*/

public class Solution {

    public static String[] stringToArray(String s) {
      return s.split(" ");
    }
}
public class Solution {

    public static String[] stringToArray(String s) {
      String[] words = s.split("\\s+"); 
      for (int i = 0; i < words.length; i++) {
           words[i] = words[i].replaceAll("[^\\w]", "");
      }
      return words;
      }
}
