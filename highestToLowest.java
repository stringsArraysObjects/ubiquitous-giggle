/*PARAMETERS:All numbers are valid Int32, no need to validate them.
         There will always be at least one number in the input string.
RESULT:   Output string must be two numbers separated by a single space, 
          and highest number is first.
EXAMPLE: highAndLow("1 9 3 4 -5"); // return "9 -5"
PSEUDOCODE:  Convert to List 
             
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*not my solution */
public class Kata {
    public static String highAndLow(String numbers) {
        List<Integer> nums = Arrays.stream(numbers.split(" ")).map(Integer::parseInt).toList();
        return "%s %s".formatted(Collections.max(nums), Collections.min(nums));
    }
}