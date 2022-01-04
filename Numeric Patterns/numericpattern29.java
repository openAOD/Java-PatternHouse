/**
 * pattern to be printed 
 * 
 *   5
 *   4 5 
 *   3 4 5
 *   2 3 4 5
 *   1 2 3 4 5
 * numericpattern29
 * 
 */
public class numericpattern29{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
              System.out.print(n-i+j+1+" ");
            }
            System.out.println();
        }
    }   
}

