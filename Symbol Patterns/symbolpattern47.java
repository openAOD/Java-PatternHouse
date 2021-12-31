/**
 * pattern to be printed 
 * 

      1 * 3 * 5
      1 * 3 *
      1 * 3
      1 *
      1

 * symbolpattern47
 */
public class symbolpattern47 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern(rows);
    }
    private static void symbolPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <=n-i; j++) {
                if ( j%2==0 )  System.out.print(j+1+" ");
                else  System.out.print("* ");
            }
            
            System.out.println();
            }
        }
    }
        





