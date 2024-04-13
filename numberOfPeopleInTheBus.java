/*PARAMETER: the number of people in the bus 
             is always >= 0. So the returned integer can't be negative.
*RESULT: Return the number of people who are still on the bus after the
*        last bus stop (after the last array).
*/

import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    return stops.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
  }
}

import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    return stops.stream().mapToInt(a -> a[0] - a[1]).sum();
  }
}

import java.util.ArrayList;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        int result = 0;
        for(int[] i : stops) result += i[0] - i[1];           
        return result;
    }
}

import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
  int peopleOnBus = 0;
        for (int[] busStop : stops) {
            peopleOnBus += busStop[0];
            peopleOnBus -= busStop[1];
        }
        return peopleOnBus;
    }
  
}