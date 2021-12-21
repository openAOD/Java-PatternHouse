/**
 * 
 * pattern to be printed
 * 
 * D
 * D C
 * D C B
 * D C B A
 * D C B
 * D C
 * D
 * alphabeticpattern46
 */
public class alphabeticpattern46 {

    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern46(rows);
    }

    private static void alphabetPattern46(int n) {

        int alphabet = 64;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print((char) (alphabet + n - j) + " ");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (alphabet + n - j) + " ");
            }
            System.out.println();
        }

    }
}