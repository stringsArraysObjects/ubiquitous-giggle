/*PARAMETERS: DNA strans are never empty or there is no 
*             DNA at all.
*RESULT:      the function receives one side of the DNA.
*             you need to return the other complementary side.             
*EXAMPLE:     (input --> output) 
*             "ATTGC" --> "TAACG"
*             "GTAT" --> "CATA"
*PSEUDOCODE:   iterate over each char of dna stran
*              create a new string stran
*              with the complementary character.
*/



//First go at it
public class DnaStrand {
//Tightened up
public class DnaStrand {
  public static String makeComplement(String dna) {
    
    String comp = "";
     for(String letter: dna.split("")){
        switch(letter) {
          case "A": comp += "T";break;
          case "T": comp += "A";break;
          case "C": comp += "G";break;
          case "G": comp += "C";break;
        }
     }
    return comp;
 }
}
  public static String makeComplement(String dna) {
     String comp = "";
    
     for(String letter: dna.split("")){
        switch(letter){
          case "A":
            comp += letter.replace( "A","T");
            break;
          case "T":
            comp += letter.replace("T", "A");
            break;
          case "C":
            comp += letter.replace("C","G");
            break;
          case "G":
            comp += letter.replace("G","C");
            break;
          default:
            break;
         }
     }
      return comp;
  }
}