/*PARAMETERS: none
*RESULT: simple multiplication
*EXAMPLE: none
*PSEUDOCODE: given number by eight if 
*            it is an even number and by nine otherwise.
*/
public class Sid {
    public static int simpleMultiplication (int n) {
        return n % 2 == 0 ? n * 8 : n * 9;
    }
}

public class Sid {
    public static int simpleMultiplication(int n) {
        return n * (n % 2 + 8);
    }
}