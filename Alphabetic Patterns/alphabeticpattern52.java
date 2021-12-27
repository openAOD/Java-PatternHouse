/**
 * 
 * pattern to be printed 
 * 
 *        A
 *      B B
 *    C C C
 *  D D D D
 *    E E E 
 *      F F
 *        G
 * alphabeticpattern52
 */
public class alphabeticpattern52 {


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
                System.out.print((char) (alphabet+n-i) + " ");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 1; i--) {
            for (int j = 1; j <n- i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (alphabet+2*n-i-2) + " ");
            }
            System.out.println();
        }

    }
}


