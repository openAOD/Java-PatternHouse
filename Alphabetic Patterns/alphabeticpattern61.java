/**
 * 
 * pattern to be printed
 * 
 * A B C D E
 * A B C D *
 * A B C * *
 * A B * * *
 * A * * * *
 * 
 * 
 * alphabeticpattern61
 */
class alphabeticpattern61 {

    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern61(rows);
    }

    private static void alphabetPattern61(int n) {

        int alphabet = 64;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (alphabet + j + 1) + " ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
