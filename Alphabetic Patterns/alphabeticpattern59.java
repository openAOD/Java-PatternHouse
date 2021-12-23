/**
 * 
 * pattern to be printed
 * 
 * A * * * *
 * A B * * *
 * A B C * *
 * A B C D *
 * A B C D E
 * 
 * 
 * alphabeticpattern59
 */
public class alphabeticpattern59 {

    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern59(rows);
    }

    private static void alphabetPattern59(int n) {

        int alphabet = 64;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print((char) (alphabet + j + 1) + " ");
            }
            for (int j = n - i + 1; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
