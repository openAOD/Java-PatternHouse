/**
 * pattern to be printed 
 * 
      1
      * *
      1 2 3
      * * * *
      1 2 3 4 5

 * symbolpattern40
 */
class symbolpattern40 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern(rows);
    }
    private static void symbolPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int c=1;
            for (int j = 1; j <=i; j++) {
                if ( i%2!=0 )  System.out.print(c+" ");
                else  System.out.print("* ");
                c++;
            }
            System.out.println();
            }
        }
    }
        



