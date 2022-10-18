/**
 * pattern to be printed 
 * 
 *   1
 *   2 3
 *   3 4 5
 *   4 5 6 7
 *   5 6 7 8 9
 * numericpattern32
 * 
 */
class numericpattern32{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
              System.out.print(i+j+" ");
            }
            System.out.println();
        }
    }   
}