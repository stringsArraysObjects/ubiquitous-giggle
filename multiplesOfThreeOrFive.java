/*PARAMETERS: if the number is a multiple of both 3 and 5
              only count it once.
*RESULT: Finish the solution so that it reutrns the sum of 
*        the multiples of 3 or 5 below the number passed in.
*/
public class Solution {

  public int solution(int number) {
     int sum = 0;
     for(int i = 1; i < number; i++) {
       if(i % 3 == 0 || i % 5 == 0)
         sum += i;
     }
     return sum;
  }
}
// other peoples solutions
import java.util.stream.IntStream;

public class Solution {
  public int solution(int number) {
    return IntStream.range(0, number)
                    .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                    .sum();
  }
}

public class Solution {

  public int solution(int number) {
  	int sum=0;
    
    for (int i=0; i < number; i++){
    	if (i%3==0 || i%5==0){sum+=i;}
    }
    return sum;
  }
}
