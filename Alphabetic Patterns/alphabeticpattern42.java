/**
 * * Pattern to be printed 
 *     
 *        A
 *      B C B
 *    C D E D C
 *  D E F G F E D
 *E F G H I H G F E 
 * 
 *    
 * alphabeticpattern42
 */
public class alphabeticpattern42 {
    public static void main(String[] args) {

        int rows = 6;
        alphabetPattern42(rows);
    }

    private static void alphabetPattern42(int n) {

        int alphabet = 64;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                 System.out.print((char) (alphabet + i+j)+" ");
            }
            for (int j = i-1; j > 0; j--) {
                System.out.print((char) (alphabet + i+j-1)+" ");
           }

            System.out.println();
        }
    }

}

