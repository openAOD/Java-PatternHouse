/**
 * pattern to be printed 
 * 
 *   1
 *   4 9
 *   16 25 36
 *   49 64 81 100
 * numericpattern45
 * 
 */
class numericpattern45{
    public static void main(String[] args) {
        int rows = 4;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        int c=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
              System.out.print(c*c+"  ");
            c++;  
            }
            System.out.println();
        }
    }  
}

