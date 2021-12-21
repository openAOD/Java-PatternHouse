/**
 * 
 * pattern to be printed 
 * 
 * A B C D E F G H I
 *   A B C D E F G
 *     A B C D E
 *       A B C
 *         A
 * 
 * 
 * alphabeticpattern45
 */
public class alphabeticpattern45 {

    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern45(rows);
    }

    private static void alphabetPattern45(int n) {

        int alphabet = 64;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2*(n - i)-1 ; k++) {
                System.out.print((char)(alphabet+k) + " ");
            }
            System.out.println();
        }

}
}