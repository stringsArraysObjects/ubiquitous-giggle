/*PARAMETER: passed a string and return a string
*RESULT:  a function that changes all but the last 
*           for characters of the string into #
*EXAMPLE: "4556364607935616" --> "############5616"
          "64607935616" -->      "#######5616"
*PSEUDOCODE: replace all the characters in the string
*            except for the last four with "#"
*/

public class Maskify {
    public static String maskify(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }
}