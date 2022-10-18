/**
 * 
 * pattern to be printed
 * 
 * * * * * A
 * * * * B A
 * * * C B A
 * * D C B A
 * E D C B A
 * 
 * 
 * alphabeticpattern63
 */
class alphabeticpattern63 {
    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern63(rows);
    }

    private static void alphabetPattern63(int n) {

        int alphabet = 64;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print((char) (alphabet +n-j+1) + " ");
            }
            System.out.println();
        }

    }
}
