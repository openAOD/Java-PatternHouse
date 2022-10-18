/**
 * 
 * pattern to be printed 
 * 
 *         A
 *       A B
 *     A B C
 *   A B C D
 *     A B C
 *       A B
 *         A
 * 
 * 
 * alphabeticpattern53
 */
class alphabeticpattern53 {


    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern53(rows);
    }

    private static void alphabetPattern53(int n) {

        int alphabet = 64;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print((char) (alphabet+j) + " ");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 1; i--) {
            for (int j = 1; j <n- i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (alphabet+j) + " ");
            }
            System.out.println();
        }

    }
}



