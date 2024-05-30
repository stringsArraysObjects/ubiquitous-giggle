/*PARAMETERS: There are no fractional people
*RESULT:      Write a method that determines
*             how many years it will take for the town
*             to see its population greater than or equal
*             p = 1200 inhabitants
*EXAMPLE:     At the end of the first year there will be: 
              1000 + 1000 * 0.02 + 50 => 1070 inhabitants 
*             */

class Arge {
    
    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
      
          while (p0 < p) {
            p0 = (int) (p0 + (p0 * percent / 100) + aug);
            years++;
          }
  return years;
  }
}

class Arge {
    
    public static int nbYear(int p0, double percent, int aug, int p) {
        if (p0>=p) return 0;
        else return nbYear((int) (p0+aug+p0*(percent/100)), percent, aug, p) + 1;
    }
}