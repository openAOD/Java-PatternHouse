/**
 * 
 * pattern to be printed
 * 
 * E F O P Y
 * D G N Q X
 * C H M R W
 * B I L S V
 * A J K T U
 * 
 * 
 * alphabeticpattern55
 */
public class alphabeticpattern55 {

    public static void main(String[] args) {

        int rows = 5;
        alphabetPattern55(rows);
    }

    private static void alphabetPattern55(int n) {

        int alphabet = 64;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n; j++) {
                System.out.print((char) (alphabet + i + j) + " ");
            }
            System.out.println();
        }

    }
}