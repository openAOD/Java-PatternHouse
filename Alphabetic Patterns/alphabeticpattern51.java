/**
 * 
 * pattern to be printed 
 * 
 *        D
 *      C D
 *    B C D
 *  A B C D
 *    B C D
 *      C D
 *        D
 * 
 * 
 * alphabeticpattern51
 */
class alphabeticpattern51 {


    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern51(rows);
    }

    private static void alphabetPattern51(int n) {

        int alphabet = 64;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print((char) (alphabet+j+i-1) + " ");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 1; i--) {
            for (int j = 1; j <n- i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (alphabet+n-i+j-1) + " ");
            }
            System.out.println();
        }

    }
}

