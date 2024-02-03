/*PARAMETERS:   int n: the initial game counter value
*               passed a long data type
*RESULT: Given an initial value, determine who wins the game.
*
*
*EXAMPLE:  n = 132
*           132 is not a power of 2, next lowest
*           power of 2 is 128, subtract that from 132
*            which is 4, next player goes, repeat process.
*
*
*PSEUDOCODE:    Given a value determine if that value 
*               is a power of 2  if so subtract from
*               that value from initial value, next players turn
*               Repeat process.
*               The player who's turn it is when the
*               value is reduced to 1 wins
*               Print out the name of the winner.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'counterGame' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static String counterGame(long n) {
      
    double num = n;
           return Math.floor(Math.log(num)/Math.log(2)) % 2 == 1 ? "Louise" : "Richard";
}
}
