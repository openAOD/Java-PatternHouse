/**
 * pattern to be printed 
 * 
      1
      * *
      3 3 3
      * * * *
      5 5 5 5 5

 * symbolpattern39
 */
public class symbolpattern39 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern(rows);
    }
    private static void symbolPattern(int n) {
        int c=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                if ( i%2!=0 )  System.out.print(c+" ");
                else  System.out.print("* ");
            }
            c++;
            System.out.println();
            }
        }
    }
        



