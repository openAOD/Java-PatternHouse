// program to print following pattern
// E D C B A
// D C B A
// C B A
// B A
// A

public class alphabeticpattern18 {

    public static void main(String[] args) {

        int rows = 5;
        alphabet_triangle(rows);
    }
    static void alphabet_triangle(int n){

        int alphabet = 64;
        for (char i = (char) n; i > 0 ; i--) {
            for (char j = i; j > 0 ; j--) {
                System.out.print((char)(alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}
