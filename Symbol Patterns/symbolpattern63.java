/**
 * pattern to be printed 
 * 
             1
            * *
           3 3 3
          * * * *
         5 5 5 5 5
 * symbolpattern63
 */
class symbolpattern63 {
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
                if (i%2!=0)  System.out.print(i+"  ");
                else  System.out.print("*  ");
            }
            
            System.out.println();
            }
        }
    }
        