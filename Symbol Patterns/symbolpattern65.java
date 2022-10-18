/**
 * pattern to be printed 
 * 
     # * # * #
      * # * #
       # * #
        * #
         #
 * symbolpattern65
 */
class symbolpattern65 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern(rows);
    }
    private static void symbolPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <i; j++) {
             System.out.print("  ");
            }
            for (int j = 0; j <=n-i; j++) {
                if ((i+j)%2!=0)  System.out.print("#  ");
                else  System.out.print("*  ");
            }
            
            System.out.println();
            }
        }
    }
        
