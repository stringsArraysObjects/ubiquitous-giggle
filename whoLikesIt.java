/*PARAMETERS: For 4 or more names, the number in "and 2 others" simply increases.
*RESULT: Implement the function that creates the text that should be displayed next 
*        the names of people that like an item.
*EXAMPLE: []-->  "no one likes this"
*         ["Peter"]   -->  "Peter likes this"
*        ["Jacob", "Alex"]  -->  "Jacob and Alex like this"
*        ["Max", "John", "Mark"]  -->  "Max, John and Mark like this"
*        ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
*PSEUDOCODE:   based on the amount of elements(names) in the array
*              a specific text will be concatentated to the 
             names to form a string output(print statement)
*/

class Solution {
    public static String whoLikesIt(String... names) {
        switch (names.length) {
        case 0:return "no one likes this";
        case 1:return names[0] + " likes this";
        case 2:return names[0] + " and " + names[1] + " like this";
        case 3:return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        default:return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
    }
}

class Solution {
    public static String whoLikesIt(String... names) {
        switch (names.length) {
          case 0: return "no one likes this";
          case 1: return String.format("%s likes this", names[0]);
          case 2: return String.format("%s and %s like this", names[0], names[1]);
          case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
          default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }
}