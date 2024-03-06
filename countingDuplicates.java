/*PARAMETERS: The input string contains only alphabets
             (both uppercase and lowercase) and numeric digits.
*RESULT:    Write a function that will return the count of distinct
            case-insensitive alphabetic characters and numeric digits
            that occur more than once in the input string.
*EXAMPLE:   "abcde" -> 0 # no characters repeats more than once
*           "aabbcde" -> 2 # 'a' and 'b'
*           "aabBcde" -> 2
*/
import java.util.*;
public class CountingDuplicates {
  public static int duplicateCount(String text) {
         text = text.toLowerCase();

    
        HashMap<Character, Integer> charCount = new HashMap<>();

     
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (charCount.containsKey(c)) {
                int count = charCount.get(c);
                charCount.put(c, count + 1);
            } else {
                charCount.put(c, 1);
            }
        }

       
        int duplicateCount = 0;


        for (Character c : charCount.keySet()) {
            if (charCount.get(c) > 1) {
                duplicateCount++;
            }
        }

        return duplicateCount;
}
}

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    int ans = 0;
    text = text.toLowerCase();
    while (text.length() > 0) {
      String firstLetter = text.substring(0,1);
      text = text.substring(1);
      if (text.contains(firstLetter)) ans ++;
      text = text.replace(firstLetter, "");
    }
    return ans;
  }
}

import java.util.stream.Collectors;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    return (int)text.toLowerCase().chars().boxed().collect(Collectors.groupingBy(k->k,Collectors.counting())).values().stream().filter(e->e>1).count();
  }
}