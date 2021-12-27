/**
 * pattern to be printed 
 * 

          1
        * 2
      3 * 3
    * 4 * 4
  5 * 5 * 5


 * symbolpattern55
 */
public class symbolpattern55 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern(rows);
    }
    private static void symbolPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <n-i; j++) {
             System.out.print("  ");
            }
            for (int j = 0; j <i; j++) {
                if ((j+i)%2!=0 )  System.out.print(i+" ");
                else  System.out.print("* ");
            }
            
            System.out.println();
            }
        }
    }
        








