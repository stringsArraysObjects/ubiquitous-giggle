/*
*PARAMETERS: Each input string will only ever consist of 
             'G', 'C', 'A' and/or 'T'
             Input string may be empty.
*RESULT:    Translates a given DNA string into RNA 
*EXAMPLE:   "GCAT"  =>  "GCAU"
*PSEUDOCODE: Use the replaceAll method from the String class to
             replace all occurances of T with U.    */






public class Bio {
  public String dnaToRna(String dna) {
    return dna.replaceAll("T", "U");
  } 
}