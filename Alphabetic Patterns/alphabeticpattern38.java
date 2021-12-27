//    A
//   ABC
//  ABCDE
// ABCDEFG
//ABCDEFGI


/**
 * alphabeticpattern38
 */
public class alphabeticpattern38 {

    public static void main(String[] args) {

        int rows = 6;
        alphabetPattern38(rows);
    }

    private static void alphabetPattern38(int n) {

        int alphabet = 64;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                
                 System.out.print((char) (alphabet + j+1));
            }
            System.out.println();
        }
    
    }
}
