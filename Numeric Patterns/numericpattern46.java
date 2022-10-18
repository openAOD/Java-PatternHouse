/**
 * pattern to be printed 
 * 
 *   1
 *   2 6
 *   3 7 10
 *   4 8 11 13
 *   5 9 12 14 15
 * numericpattern46
 * 
 */
class numericpattern46{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {

        for (int i = 1; i <= n; i++) {
            int c=0;
            for (int j = 1; j <= i; j++) {
              System.out.print(i+c+"  "); 
              c+=n-j;
            }
            System.out.println();
        }
    }  
}
