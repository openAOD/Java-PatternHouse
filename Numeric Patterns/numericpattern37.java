/**
 * pattern to be printed 
 * 
 *   1
 *   2 4
 *   3 6 9
 *   4 8 12 16
 *   5 10 15 20 35
 * numericpattern37
 * 
 */
class numericpattern37{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
              System.out.print(i*(j+1)+" ");
            }
            System.out.println();
        }
    }   
}
