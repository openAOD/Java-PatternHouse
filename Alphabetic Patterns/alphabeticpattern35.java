//pattern to be printed
//A B C D E
// A B C D
//  A B C
//   A B
//    A

/**
 * alphabeticpattern35
 */
public class alphabeticpattern35 {
    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern35(rows);
    }

    private static void alphabetPattern35(int n) {

        int alphabet = 64;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
            System.out.print((char)(alphabet+j+1)+" ");    
            }
            System.out.println();
        }
    }

}

