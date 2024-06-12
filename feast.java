/*Write a method feast that takes the animal's name and dish as arguments and returns true or false 
* to indicate whether the beast is allowed to bring the dish to the feast.
* There is just one rule: the dish must start and end with the same letters as the animal's name
* assertTrue(Kata.feast("chickadee","chocolate cake"));
  assertTrue(Kata.feast("marmot","mulberry tart"));*/


public class Kata {

  public static boolean feast(String beast, String dish) {
    
    return beast.charAt(0)==dish.charAt(0) && beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1);
    
  }
  
}