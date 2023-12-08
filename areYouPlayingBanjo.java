//PARAMETERS: passed a string name as an argument, 
//              names given are always valid string
//RESULT:  If the name passed starts with the 
//          letter "R" or lower case "r", you are playing banjo!
//EXAMPLE:
//          name + " plays banjo" 
//          name + " does not play banjo"
//PSEUDOCODE: check the first char of the string to 
//            find out if it is the letter r upper or lower.
//            return the correct reply based on results.
public class Banjo {
    public static String areYouPlayingBanjo(String name) {
      return (name.toLowerCase().charAt(0) == 'r') ? (name + " plays banjo") : (name + " does not play banjo");
    }
  }