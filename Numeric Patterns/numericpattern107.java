
/**
 * 
 * pattern to be printed 
 * 
 *          1
 *        1 2 1
 *      1 2 4 2 1
 *    1 2 4 8 4 2 1
 *  1 2 4 8 16 8 4 2 1
 * 
 * 
 * numericpattern107
 */

import java.lang.Math;

class numericpattern107 {
    public static void main(String[] args) {

        int rows = 5;
        numericPattern107(rows);
    }

    private static void numericPattern107(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=  i ; j++) {
                System.out.print((int)Math.pow(2, j-1) + " ");
            }
            for (int j = 1; j <  i ; j++) {
                System.out.print((int)Math.pow(2, i-j-1) + " ");
            }

            System.out.println();
        }

    }

}
