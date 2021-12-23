/**
 * 
 * pattern to be prointed
 * 
 * 
 *       1
 *     1 2 1
 *   1 2 3 2 1
 * 1 2 3 4 3 2 1
 * 
 * numericpattern106
 */
public class numericpattern106 {
    public static void main(String[] args) {

        int rows = 4;
        numericPattern106(rows);
    }

    private static void numericPattern106(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=  i ; j++) {
                System.out.print((j) + " ");
            }
            for (int j = 1; j <  i ; j++) {
                System.out.print((i-j) + " ");
            }

            System.out.println();
        }

    }

}
