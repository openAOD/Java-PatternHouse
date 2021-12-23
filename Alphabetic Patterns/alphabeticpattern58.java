/**
 * 
 * pattern to be printed 
 * 
 *  A * * * *
 *  B B * * *
 *  C C C * *
 *  D D D D *
 *  E E E E E
 * 
 * 
 * alphabeticpattern58
 */
public class alphabeticpattern58 {

    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern58(rows);
    }

    private static void alphabetPattern58(int n) {

        int alphabet = 64;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print((char) (alphabet +n-i+1) + " ");
            }
            for (int j = n-i+1; j < n; j++) {
                System.out.print( "* "); 
            }
            System.out.println();
        }

    }
}


