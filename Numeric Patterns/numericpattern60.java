/**
 * pattern to be printed 
 * 
 *   5  6  7  8  9
 *   4  5  6  7
 *   3  4  5
 *   2  3
 *   1
 * 
 * numericpattern60
 * 
 */
public class numericpattern60{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
              System.out.print(n+j-i+"  ");
            }
            System.out.println();
        }
    }   
}