/**
 * pattern to be printed 
 * 
 *    15 14 13 12 11
 *    10 9 8 7
 *    6 5 4 
 *    3 2
 *    1
 * 
 * numericpattern62
 * 
 */
public class numericpattern62{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        int c=n*(n-2);
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
              System.out.print(c+"  ");
              c--;
            }
            System.out.println();
        }
    }   
}

