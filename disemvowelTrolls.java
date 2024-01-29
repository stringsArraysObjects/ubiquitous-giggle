/*PARAMETER: y in not considered a vowel
* RESULT:   Your task is to write a function that takes a string and return a new string 
            with all vowels removed.
*EXAMPLE:   the string "This website is for losers LOL!" would become 
            "Ths wbst s fr lsrs LL!".
*PSEUDOCODE: remove all vowels from wach word
             leave orginal space around earch word.
             join the word where the letter was 
             removed.
*/
public class Troll {
  public static String disemvowel(String str) {
      return str.replaceAll("[aAeEiIoOuU]", "");
  } 
}
