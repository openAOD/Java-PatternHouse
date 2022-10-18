/**
 * 
 * pattern to be printed 
 * 
 *  IIIIIIIIII
 *   GGGGGGG
 *    EEEEE
 *     CCC
 *      A
 * 
 * alphabeticpattern44
 */
class alphabeticpattern44 {
    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern44(rows);
    }

    private static void alphabetPattern44(int n) {

        int alphabet = 64;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2*(n - i)-1 ; k++) {
                System.out.print((char)(alphabet+(2*n-1)-2*i) + " ");
            }
            System.out.println();
        }

}
}

