/**
 * 
 * pattern to be printed
 * 
 *           1
 *         2 3 4
 *        5 6 7 8 9
 *    10 11 12 13 14 15 16
 * 17 18 19 20 21 22 23 24 25
 * 
 * numericpattern104
 */
public class numericpattern104 {
    public static void main(String[] args) {

        int rows = 5;
        numericPattern104(rows);
    }

    private static void numericPattern104(int n) {
        int c = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {

                System.out.print((c) + " ");
                c++;
            }
            System.out.println();
        }

    }

}
