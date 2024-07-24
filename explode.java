// Given a string made of digits [0-9], return a string where each 
// digit is repeated a number of times equals to its value.

// Examples
// "312" should return "333122"
// "102269" should return "12222666666999999999"


import java.util.stream.Collectors;

public class Solution {
  public static String explode(String digits) {
      return digits.chars()
            .mapToObj(Character::toString)
            .map(e -> e.repeat(Integer.parseInt(e)))
            .collect(Collectors.joining());
  }
}