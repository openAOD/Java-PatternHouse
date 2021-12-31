/**
 * pattern to be printed 
 * 
      #
      * *
      # # #
      * * * *
      # # # # #
 * symbolpattern37
 */
public class symbolpattern37 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern(rows);
    }
    private static void symbolPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                if ( i%2!=0 )  System.out.print("# ");
                else  System.out.print("* ");
            }
            System.out.println();
            }
        }
    }
        


