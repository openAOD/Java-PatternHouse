/**
 * pattern to be printed 
 * 
      1
      2 *
      3 * 3
      4 * 4 *
      5 * 5 * 5



 * symbolpattern42
 */
class symbolpattern42 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern(rows);
    }
    private static void symbolPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                if ( j%2!=0 )  System.out.print(i+" ");
                else  System.out.print("* ");
            }
            
            System.out.println();
            }
        }
    }
        

