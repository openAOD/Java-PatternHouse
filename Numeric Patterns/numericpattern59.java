/**
 * pattern to be printed 
 * 
 *   5 4 3 2 1
 *   6 5 4 3
 *   7 6 5
 *   8 7
 *   9
 * 
 * numericpattern59
 * 
 */
public class numericpattern59{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
              System.out.print(n-j+i+"  ");
            }
            System.out.println();
        }
    }   
}
