/*PARAMETER: ignore capitalization when 
*            determining if a character is a duplicate.
*RESULT:     convert a string to a new string where each
*            character in the new string is "(" if that character 
*            appears only once in the original string, or ")" if 
*            that character appears more than once in the original string.
*EXAMPLE:    "din"      =>  "((("
*            "recede"   =>  "()()()"
*PSEUDOCODE: determine if a character is eqaul to another
*            character in the string
*            create a new string that encodes the dup. char
*            with ( and nondups as ).
*/

public class DuplicateEncoder {
	static String encode(String word){
    word = word.toLowerCase();
    String result = "";
    for (int i = 0; i < word.length(); ++i) {
      char c = word.charAt(i);
      result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
    }
    return result;
  }
}

import java.util.stream.Collectors;

public class DuplicateEncoder {
	static String encode(String word){    
        return word.toLowerCase()
                   .chars()
                   .mapToObj(i -> String.valueOf((char)i))
                   .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
                   .collect(Collectors.joining());
  }
}