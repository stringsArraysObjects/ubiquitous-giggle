/*PARAMETERS:
*RESULTS: write a function that takes a string and
*         a letter as input and then returns the index 
*         of the second occurrence of that letter in the string.
*EXAMPLE:   second_symbol('Hello world!!!','l') --> 3
*/

public class SecondOcurrence {
  public static int secondSymbol(String str, char c) {
   return str.indexOf(c,str.indexOf(c)+1);
  }
}
