/**
 * pattern to be printed 
 * 
 *   1
 *   3 5
 *   5 7 9
 *   7 9 11 13
 *   9 11 13 15 17
 * numericpattern33
 * 
 */
public class numericpattern33{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
              System.out.print(2*(i+j)-1+" ");
            }
            System.out.println();
        }
    }   
}
