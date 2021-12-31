/**
 * pattern to be printed 
 * 
      * 0 0 * 0 0 *
      0 * 0 * 0 * 0
      0 0 * * * 0 0
      0 0 0 * 0 0 0

 * symbolpattern32
 */
public class symbolpattern32 {
    public static void main(String[] args) {
        int rows = 4;
        symbolPattern(rows);
    }
    
    private static void symbolPattern(int n) {
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n/2+1; j++) {
                if (i==j) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");   
                }
            }
            System.out.print("* ");
            for (int j = 1; j <=n/2+1; j++) {
                if (n-i==j) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");   
                }
            }
            System.out.println();
            }
        }

    }









