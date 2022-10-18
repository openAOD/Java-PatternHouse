//pattern to be printed
//EEEEEEEEE
// DDDDDDD
//  CCCCC
//   BBB
//    A

/**
 * alphabeticpattern43
 */
class alphabeticpattern43 {

    
    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern43(rows);
    }

    private static void alphabetPattern43(int n) {

        int alphabet = 64;
        for (char i = (char) n; i > 0; i--) {
            for (int index = n; index >=i; index--) {
                System.out.print("  ");
            }
            for (int j = 2*i-1; j > 0; j--) {    
                System.out.print((char) (alphabet + i) + " ");
            }
            System.out.println();
        }
    }

}
