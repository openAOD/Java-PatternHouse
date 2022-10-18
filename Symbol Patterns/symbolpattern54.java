/**
 * pattern to be printed 
 * 

          1
        * 1
      3 * 1
    * 3 * 1
  5 * 3 * 1


 * symbolpattern54
 */
class symbolpattern54 {
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
                if ((j+i)%2!=0 )  System.out.print(i-j+" ");
                else  System.out.print("* ");
            }
            
            System.out.println();
            }
        }
    }
        







