
/**
 * Pattern to be printed 
 *     
 *    * * * * A
 *    * * * B B
 *    * * C C C
 *    * D D D D
 *    E E E E E
 * alphabeticpattern62
 */
public class alphabeticpattern62 {


  public static void main(String[] args) {

        int rows = 6;
        alphabetPattern62(rows);
    }

    private static void alphabetPattern62(int n) {

        int alphabet = 64;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                 System.out.print((char) (alphabet + i)+" ");
            }
            System.out.println();
        }
    }

}
