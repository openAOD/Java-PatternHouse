//pattern to be printed
//    A
//   BBB
//  CCCCC
// DDDDDDD
//EEEEEEEEE

/**
 * alphabeticpattern36
 */
class alphabeticpattern36 {

    public static void main(String[] args) {

        int rows = 6;
        alphabetPattern36(rows);
    }

    private static void alphabetPattern36(int n) {

        int alphabet = 64;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                 System.out.print((char) (alphabet + i));
            }
            System.out.println();
        }
    }

}
