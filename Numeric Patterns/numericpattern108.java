/**
 * 
 * pattern to be printed 
 * 
 *           1
 *         2 1 2
 *       3 2 1 2 3
 *     4 3 2 1 2 3 4
 *   5 4 3 2 1 2 3 4 5
 * 
 * 
 * numericpattern108
 */
class numericpattern108 {
    public static void main(String[] args) {

        int rows = 5;
        numericPattern108(rows);
    }

    private static void numericPattern108(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=  i ; j++) {
                System.out.print((i-j+1) + " ");
            }
            for (int j = 1; j <  i ; j++) {
                System.out.print((j+1) + " ");
            }

            System.out.println();
        }

    }

}

