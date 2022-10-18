/**
 * pattern to be printed 
 * 
 *   1
 *   1 2
 *   1 2 3
 *   1 2 3 4
 *   1 2 3 4 5
 * numericpattern26
 * 
 */
class numericpattern26 {
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
              System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }   
}