/*PARAMETERS: Strings passed in will consist
              of only letters and spaces. 
             Spaces will be included only when
              more than one word is present.
*RESULT:    Write a function that takes in a string
            of one or more words, and returns the same
            string, but with all words that have five 
            or more letters reversed
*EXAMPLE:   "Hey fellow warriors"  --> "Hey wollef sroirraw" 
*/

import java.util.Arrays;

public class SpinWords {

  public String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    for (int i=0; i<words.length; i++) {
      if (words[i].length() >= 5) {
        words[i] = new StringBuilder(words[i]).reverse().toString();
      }
    }
    return String.join(" ",words);
  }
}

import java.util.stream.*;
import java.util.Arrays;

public class SpinWords {

  public String spinWords(String sentence) {
    return Arrays.stream(sentence.split(" "))
                 .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                 .collect(Collectors.joining(" "));
  }
}

public class SpinWords {

  public String spinWords(String sentence) {
     String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            if (word.length() >= 5) {
                reversedSentence.append(new StringBuilder(word).reverse());
            } else {
                reversedSentence.append(word);
            }
            reversedSentence.append(" ");
        }
        return reversedSentence.toString().trim();
    }
  
}