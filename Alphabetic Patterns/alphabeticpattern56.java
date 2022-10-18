/**
 * 
 * pattern tpo be printed
 * 
 * A B C D E
 * B C D E A
 * C D E A B
 * D E A B C
 * E A B C D
 * 
 * alphabeticpattern56
 */
class alphabeticpattern56 {

    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern56(rows);
    }

    private static void alphabetPattern56(int n) {

        int alphabet = 64;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (alphabet + n - i + 1 + j) + " ");
            }
            for (int j = i; j < n; j++) {
                System.out.print((char) (alphabet - i + 1 + j) + " ");
            }
            System.out.println();
        }

    }
}
