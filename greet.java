/*
*PARAMETER: Use conditionals to return the proper message
*RESULTS:   Method returns personalized greeting.
*EXAMPLE:   case	             return
*           name equals owner	'Hello boss'
*           otherwise	        'Hello guest'
*PSEUDOCODE: Use the ternary conditional operator 
*            to evaluate the statement: 
*            If name equals owner is true, 
*            assign the value "Hello boss" to result. 
*            Otherwise, assign the value "Hello guest" to result
*            Use the equalsIgnoreCase method to compare strings
*            and determine if they are equal ignoring case.*/ 

class Kata {
    static String greet(String name, String owner) {
       
       return (name.equalsIgnoreCase(owner))? "Hello boss" : "Hello guest";
    }
}