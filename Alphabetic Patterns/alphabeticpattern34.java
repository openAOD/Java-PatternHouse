//pattern to be printed
//E D C B A
// D C B A
//  C B A
//   B A
//    A



/**
 * alphabeticpattern34
 */
class alphabeticpattern34 {

    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern34(rows);
    }

    private static void alphabetPattern34(int n) {

        int alphabet = 64;
        for (char i = (char) n; i > 0; i--) {
            for (int index = n; index >=i; index--) {
                System.out.print(" ");
            }
            for (char j = i; j > 0; j--) {    
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }

}

