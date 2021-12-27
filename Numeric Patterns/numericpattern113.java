/**
 * 
 * pattern to be printed 
 * 
 *  5 5 5 5 5 5 5 5 5
 *    4 4 4 4 4 4 4
 *      3 3 3 3 3
 *        2 2 2
 *          1
 * 
 * numericpattern113
 */
public class numericpattern113 {

    public static void main(String[] args) {
        int rows = 5;
        numericPattern113(rows);
    }
    private static void numericPattern113(int n) {
        n+=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <=  i; j++) {
                System.out.print("  ");
            }
        
            for (int j = 1; j <= 2* (n-i) -1; j++) {
                System.out.print((n-i) + " ");
                
            }
            System.out.println();
        }

    }

}
