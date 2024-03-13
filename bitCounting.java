//PARAMETER: guarantee that input is non-negative.
//RESULT: Write a function that takes an integer as input,
//        and returns the number of bits that are equal to 
//        one in the binary representation of that number. 
//EXAMPLE: The binary representation of 1234 is 10011010010,
//         so the function should return 5 in this case
//PSEUDOCODE: return the number of one-bits in the two's complement
//            binary representation of the specified int value.
 
public class BitCounting {

	public static int countBits(int n){
		
    return Integer.bitCount(n);
	}
	
}
