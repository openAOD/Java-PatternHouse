/**
 * 
 * pattern to be printed 
 * 
 *       1
 *     2 3 2
 *   3 4 5 4 3
 * 4 5 6 7 6 5 4 
 * 
 * numericpattern110
 * 
 */
class numericpattern110 {

    public static void main(String[] args) {
        int rows = 4;
        numericPattern110(rows);
    }
    private static void numericPattern110(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("  ");
            }
            int c=0;
            for (int j = 1; j <=  i ; j++) {
                System.out.print((i+j-1) + " ");
                c =i+j-1;
            }
            for (int j = 1; j <  i ; j++) {
                System.out.print((c-j) + " ");
            }

            System.out.println();
        }

    }

}
