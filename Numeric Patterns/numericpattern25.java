/**
 * pattern to be printed 
 * 
 *   1
 *   2 2
 *   3 3 3
 *   4 4 4 4
 *   5 5 5 5 5
 * numericpattern25
 * 
 */
public class numericpattern25 {
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
              System.out.print(i+" ");
            }
            System.out.println();
        }
    }   
}
