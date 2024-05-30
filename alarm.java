/*PARAMETER: 
*RESULT:   return true if you are employed and not on vacation  
*EXAMPLE:   employed | vacation 
*           true     | true     => false
*           true     | false    => true
*           false    | true     => false
*           false    | false    => false  
*/

public class Alarm {
  
  public static boolean setAlarm(boolean employed, boolean vacation) {
    return employed && !vacation;
  }

}