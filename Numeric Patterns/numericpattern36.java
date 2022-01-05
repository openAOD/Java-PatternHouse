/**
 * pattern to be printed 
 * 
 *   2
 *   4 6
 *   8 10 12
 *   14 16 18 20
 *   22 24 26 28 30
 * numericpattern36
 * 
 */
public class numericpattern36{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        int c=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
              System.out.print(2*c+" ");
              c++;
            }
            System.out.println();
        }
    }   
}

