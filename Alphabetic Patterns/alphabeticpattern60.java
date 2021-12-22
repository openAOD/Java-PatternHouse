/**
 * 
 * pattern to be printed 
 * 
 *  E E E E E
 *  D D D D *
 *  C C C * *
 *  B B * * *
 *  A * * * *
 * 
 * alphabeticpattern60
 */
public class alphabeticpattern60 {

    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern60(rows);
    }

    private static void alphabetPattern60(int n) {

        int alphabet = 64;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (alphabet +i) + " ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
