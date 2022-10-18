/**
 * pattern to be printed
 * 
 *  5 A A A A 
 *  4 4 B B B
 *  3 3 3 C C
 *  2 2 2 2 D
 *  1 1 1 1 1
 * 
 * 
 * alphabeticpattern57
 */
class alphabeticpattern57 {
    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern57(rows);
    }

    private static void alphabetPattern57(int n) {

        int alphabet = 64;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print((i)+ " ");
            }
            for (int j = n-i+1; j < n; j++) {
                System.out.print((char) (alphabet +n-i+1) + " ");
            }
            System.out.println();
        }

    }
}

