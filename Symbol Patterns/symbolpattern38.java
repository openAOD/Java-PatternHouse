/**
 * pattern to be printed 
 * 
      #
      # *
      # * #
      # * # *
      # * # * #
 * symbolpattern38
 */
public class symbolpattern38 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern(rows);
    }
    private static void symbolPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                if ( j%2!=0 )  System.out.print("# ");
                else  System.out.print("* ");
            }
            System.out.println();
            }
        }
    }
        



