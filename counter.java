/*We need a function that counts the number of sheep present in the array (true means present).

For example,

[true,  true,  true,  false,
true,  true,  true,  true ,
true,  false, true,  false,
true,  false, false, true ,
true,  true,  true,  true ,
false, false, true,  true]
The correct answer would be 17.
Hint: Don't forget to check for bad values like null/undefined

PSEUDOCODE:use the frequency method od the collection class to return 
an integer representing the number of times the specified object appears in the collection.
*/



import java.util.Arrays;
import java.util.Collections;

public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
  }
}