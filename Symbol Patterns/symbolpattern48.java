/**
 * pattern to be printed 
 * 

      5 * 5 * 5
      4 * 4 *
      3 * 3
      2 *
      1

 * symbolpattern48
 */
public class symbolpattern48 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern(rows);
    }
    private static void symbolPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <=n-i; j++) {
                if ( j%2==0 )  System.out.print(n-i+1+" ");
                else  System.out.print("* ");
            }
            
            System.out.println();
            }
        }
    }
        






