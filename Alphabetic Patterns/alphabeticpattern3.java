// program to print following pattern
// E E E E E
// D D D D D
// C C C C C
// B B B B B
// A A A A A

public class alphabeticpattern3 {
    public static void main(String[] args) {

        int rows = 5;
        alphabet_rectangle(rows);
    }
    static void alphabet_rectangle(int n){

        int alphabet = 64;
        for (char i = (char) (n); i > 0 ; i--) {
            for (char j = (char) (n); j > 0 ; j--) {
                System.out.print((char)(alphabet + i) + " ");
            }
            System.out.println();
        }
    }
}
