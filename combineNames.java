/*
*PARAMETERS: none
*RESULT:    combine two strings with a space between them.
*EXAMPLE:   combineNames('James', 'Stevens')
*           returns: 'James Stevens'
*PSEUDOCODE:concatenate the two strings using the + operator
            or by using the String's static format method to
            create a formatted string that you can reuse.
 */ 


public class StringCombiner {
    
    public static String combineNames(String first,String last) {

        return first + " " + last;
    }
}

public class StringCombiner {
    
    public static String combineNames(String first,String last) {

       return String.format("%s %s", first, last);
    }
}