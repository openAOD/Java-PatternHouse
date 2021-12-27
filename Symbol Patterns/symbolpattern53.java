/**
 * pattern to be printed 
 * 

          5
        * *
      3 4 5
    * * * *
  1 2 3 4 5


 * symbolpattern53
 */
public class symbolpattern53 {
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
                if (i%2!=0 )  System.out.print(n-i+j+1+" ");
                else  System.out.print("* ");
            }
            
            System.out.println();
            }
        }
    }
        






