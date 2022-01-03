/**
 * pattern to be printed 
 * 
 *  1 3 5 7 9
 *  3 5 7 9 11
 *  5 7 9 11 13
 *  7 9 11 13 15
 *  9 11 13 15 17
 * numericpattern16
 * 
 */
public class numericpattern16 {
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int k=0;
            for (int j = 0; j < n; j++,k+=2) {
                System.out.print(k+1+(i-1)*2+" ");
            }
            System.out.println();
        }
    }   
}
