/**
 * pattern to be printed 
 * 
 *   2
 *   2 4
 *   2 4 6
 *   2 4 6 8
 *   2 4 6 8 10
 * numericpattern30
 * 
 */
public class numericpattern30{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
              System.out.print((j+1)*2+" ");
            }
            System.out.println();
        }
    }   
}
