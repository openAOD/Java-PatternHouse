//pattern to be printed
//E E E E E
// D D D D
//  C C C
//   B B
//    A

/**
 * alphabeticpattern33
 */
class alphabeticpattern33 {

    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern33(rows);
    }

    private static void alphabetPattern33(int n) {

        int alphabet = 64;
        for (char i = (char) n; i > 0; i--) {
            for (int index = n; index >=i; index--) {
                System.out.print(" ");
            }
            for (char j = i; j > 0; j--) {    
                System.out.print((char) (alphabet + i) + " ");
            }
            System.out.println();
        }
    }

}
