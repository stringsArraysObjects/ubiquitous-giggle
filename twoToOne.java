/*PARAMETER:    2 strings s1 and s2 including only letters from a to z
*RESULT:        Return a new sorted string, the longest possible, containing 
*               distinct letters - each taken only once - coming from s1 or s2.
*EXAMPLE:       a = "xyaabbbccccdefww"
                b = "xxxxyyyyabklmopq"
                longest(a, b) -> "abcdefklmopqwxy"
*/

public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        String s = s1 + s2;
        return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}

public class TwoToOne {
    
     public static String longest (String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        (s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));
        return sb.toString();
    }
}