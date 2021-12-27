/**
 * 
 * pattern to be printed 
 * 
 * 
 *  E D C B A
 *  * D C B A
 *  * * C B A
 *  * * * B A
 *  * * * * A
 * 
 * 
 * alphabeticpattern65
 */
public class alphabeticpattern65 {

    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern65(rows);
    }

    private static void alphabetPattern65(int n) {

        int alphabet = 64;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n- i; j++) {
                System.out.print("* ");
            }
            for (int j = n-i; j <n ; j++) {
                System.out.print((char) (alphabet + n-j) + " ");
            }
            System.out.println();
        }

    }
}
