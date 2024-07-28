/*
*In this kata you will create a function that takes a list of non-negative integers
*and strings and returns a new list with the strings filtered out.
*Example
*Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
*Kata.filterList(List.of(1, "a", "b", 0, 15)) => List.of(1,0,15)
*Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)) => List.of(1, 2, 123)
 */


//modified 
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
  
  public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                   .filter(obj -> obj instanceof Integer)
                   .collect(Collectors.toList());
    }
}
//orig
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
  
  public static List<Object> filterList(final List<Object> list) {
          List<Object> integersOnly = list.stream()
                                      .filter(obj -> obj instanceof Integer)
                                      .map(obj -> (Integer) obj)
                                      .collect(Collectors.toList());
    
        return integersOnly;
    }
}
//other examples
import java.util.*;
import java.util.stream.Collectors;

public class Kata {
  
  public static List filterList(final List<Object> list) {
    return list.stream()
      .filter(e -> e instanceof Integer)
      .collect(Collectors.toList());
  }

}

import java.util.List;

interface Kata {
  static List<Object> filterList(List<Object> list) {
    return list.stream().filter(Integer.class::isInstance).toList();
  }
}