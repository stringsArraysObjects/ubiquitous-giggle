/*Given a string, capitalize the letters that occupy even indexes and odd indexes separately, 
    and return as shown below. Index 0 will be considered even.*/ 
import java.util.stream.IntStream;

class Solution{
    public static String[] capitalize(String s){
        StringBuilder sb1 = new StringBuilder(s),
                      sb2 = new StringBuilder(s.toUpperCase());
        IntStream.range(0, s.length())
                 .filter(  i -> (i&1)==0 )
                 .forEach( i -> { sb1.setCharAt(i, sb2.charAt(i));
                                  sb2.setCharAt(i, s.charAt(i)); });
        return new String[] {sb1.toString(), sb2.toString()};
    }
}