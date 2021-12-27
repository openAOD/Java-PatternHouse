//pattern to be printed
//    A
//   ABA
//  ABCBA
// ABCDCBA
//ABCDEDCBA

/**
 * alphabeticpattern40
 */
public class alphabeticpattern41 {

    public static void main(String[] args) {

        int rows = 6;
        alphabetPattern41(rows);
    }

    private static void alphabetPattern41(int n) {

        int alphabet = 64;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++) {
                
                 System.out.print((char) (alphabet + j));
            }
            for (int j = i-1; j >=1; j--) {
                
                System.out.print((char) (alphabet + j));
           }
            System.out.println();
        }
    
    }
}

