/**
 * pattern to be printed 
 * 
 *   5
 *   4 4 
 *   3 3 3
 *   2 2 2 2
 *   1 1 1 1 1
 * numericpattern27
 * 
 */
class numericpattern27{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
              System.out.print(n-i+1+" ");
            }
            System.out.println();
        }
    }   
}
