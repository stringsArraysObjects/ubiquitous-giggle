// Everyday you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. 
//Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
// Write a code that gives out the total amount for different days(d).






public class Kata {
  public static int rentalCarCost(int d) {
    return d < 7 ? d < 3 ? 40 * d : 40 * d - 20 : 40 * d - 50;
  }
}


public class Kata {
  private static final int COST_PER_DAY = 40;
  
  public static int rentalCarCost(int d) {
    if (d < 3)       return d * COST_PER_DAY;
    else if (d >= 7) return d * COST_PER_DAY - 50;
    else             return d * COST_PER_DAY - 20;
  }
}