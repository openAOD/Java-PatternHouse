/**
 * pattern to be printed 
 * 
  5 4 3 2 1
    * * * *
      3 2 1
        * *
          1
 * symbolpattern59
 */
class symbolpattern59 {
    public static void main(String[] args) {
        int rows = 5;
        symbolPattern(rows);
    }
    private static void symbolPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <i; j++) {
             System.out.print("  ");
            }
            for (int j = 0; j <=n-i; j++) {
                if (i%2!=0 )  System.out.print(n-i+1-j+" ");
                else  System.out.print("* ");
            }
            
            System.out.println();
            }
        }
    }
        
