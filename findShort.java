/*PARAMETERS: strings will never be empty 
*             you do not need to account for
*             different data types.
*RESULT:    return the length of the shortest word(s)
*EXAMPLE:   assertEquals(3, Kata.findShort("bitcoin 
*           take over the world maybe who knows perhaps"));
*PSEUDOCODE: interate over the string of words.
             count the chars in each word.
             return the length of the shortest word.
*/

import java.util.*;
public class Kata {
    public static int findShort(String s) {
       List<String> words = Arrays.asList(s.split(" "));
       String len = words.stream().min(
                                     Comparator.comparing(
                                     word -> word.length()))
                                    .get();
      return len.length();
   }
}

//voted most clever solution 
import java.util.stream.*;
public class Kata {
    public static int findShort(String s) {
        return Stream.of(s.split(" "))
          .mapToInt(String::length)
          .min()
          .getAsInt();
    }
}
