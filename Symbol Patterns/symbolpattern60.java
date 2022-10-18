/**
 * pattern to be printed 
 * 
  5 * 3 * 1
    * 3 * 1
      3 * 1
        * 1
          1
 * symbolpattern60
 */
class symbolpattern60 {
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
                if ((i+j)%2!=0 )  System.out.print(n-i-j+1+" ");
                else  System.out.print("* ");
            }
            
            System.out.println();
            }
        }
    }
        

