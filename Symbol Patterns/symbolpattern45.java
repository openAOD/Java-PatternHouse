/**
 * pattern to be printed 
 * 

      5 5 5 5 5
      * * * *
      3 3 3
      * *
      1 

 * symbolpattern45
 */
class symbolpattern45 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern(rows);
    }
    private static void symbolPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <=n-i; j++) {
                if ( i%2!=0 )  System.out.print(n-i+1+" ");
                else  System.out.print("* ");
            }
            
            System.out.println();
            }
        }
    }
        



