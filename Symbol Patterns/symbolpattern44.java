/**
 * pattern to be printed 
 * 

      # * # * #
      # * # * 
      # * # 
      # * 
      # 

 * symbolpattern44
 */
public class symbolpattern44 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern(rows);
    }
    private static void symbolPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <=n-i; j++) {
                if ( j%2==0 )  System.out.print("# ");
                else  System.out.print("* ");
            }
            
            System.out.println();
            }
        }
    }
        


