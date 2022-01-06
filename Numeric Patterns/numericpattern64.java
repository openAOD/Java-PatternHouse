/**
 * pattern to be printed 
 * 
 *    5 9 12 14 15
 *    4 8 11 13
 *    3 7 10
 *    2 6
 *    1
 * numericpattern64
 * 
 */
public class numericpattern64{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        for (int i = n; i > 0; i--) {
            int c=0;
            for (int j = 0,k=n-1; j < i; j++,k+=n) {
            System.out.print(i+k-n-c+1+"  ");
            c+=j+1;
            }
            System.out.println();
        }
    }   
}

