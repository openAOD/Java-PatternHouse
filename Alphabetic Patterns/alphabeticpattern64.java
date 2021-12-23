/**
 * 
 * 
 * pattern to be printed
 * 
 *  E E E E E
 *  * D D D D
 *  * * C C C
 *  * * * B B
 *  * * * * A
 * 
 * alphabeticpattern64
 */
public class alphabeticpattern64 {
    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern64(rows);
    }

    private static void alphabetPattern64(int n) {

        int alphabet = 64;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n- i; j++) {
                System.out.print("* ");
            }
            for (int j = n-i; j <n ; j++) {
                System.out.print((char) (alphabet + i) + " ");
            }
            System.out.println();
        }

    }
}
