/**
 * 
 * pattern to be printed 
 * 
 *         0
 *       1 0 1
 *     2 1 0 1 2
 *   3 2 1 0 1 2 3
 * 4 3 2 1 0 1 2 3 4
 * 
 * 
 * numericpattern105
 */
public class numericpattern105 {
    public static void main(String[] args) {

        int rows = 5;
        numericPattern105(rows);
    }

    private static void numericPattern105(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=  i ; j++) {
                System.out.print((i-j) + " ");
            }
            for (int j = 1; j <  i ; j++) {
                System.out.print((j) + " ");
            }

            System.out.println();
        }

    }

}
