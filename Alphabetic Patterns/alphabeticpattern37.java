//pattern to be printed
//    A
//   CCC
//  EEEEE
// IIIIIII


/**
 * alphabeticpattern37
 */
public class alphabeticpattern37 {
    public static void main(String[] args) {

        int rows = 6;
        alphabetPattern37(rows);
    }

    private static void alphabetPattern37(int n) {

        int alphabet = 64;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                
                 System.out.print((char) (alphabet + 2*i-1));
            }
            System.out.println();
        }
    
    }
}