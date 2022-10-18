
/**
 * pattern to be printed 
 * 
 * D
 * C D
 * B C D
 * A B C D
 * B C D
 * C D
 * D
 * 
 * alphabeticpattern47
 */
class alphabeticpattern47 {


    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern47(rows);
    }

    private static void alphabetPattern47(int n) {

        int alphabet = 64;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print((char) (alphabet-1+(i+j) ) + " ");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (alphabet+n-1-(i-j)) + " ");
            }
            System.out.println();
        }

    }
}