//pattern to be printed
//    A
//   CBA
//  EDCBA
// GFEDCBA
//IHGFEDCBA


/**
 * alphabeticpattern39
 */
public class alphabeticpattern39 {

    public static void main(String[] args) {

        int rows = 6;
        alphabetPattern39(rows);
    }

    private static void alphabetPattern39(int n) {

        int alphabet = 64;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i*2-1; j >=1; j--) {
                
                 System.out.print((char) (alphabet + j));
            }
            System.out.println();
        }
    
    }
}

