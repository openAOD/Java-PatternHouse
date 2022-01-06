/**
 * pattern to be printed 
 *    1 0 1 0 1 
 *    1 0 1 0 
 *    1 0 1 
 *    1 0 
 *    1 
 * numericpattern67
 * 
 */
public class numericpattern67{
    public static void main(String[] args) {
        int rows = 5;
       numericPattern(rows);
    }
    private static void numericPattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
            if(j%2==0)  System.out.print(1+"  ");
            else  System.out.print(0+"  ");
            }
            System.out.println();
        }
    }   
}
