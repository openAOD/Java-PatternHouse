// program to print following pattern
// E F G H I
// D E F G
// C D E
// B C
// A

public class alphabeticpattern20 {

    public static void main(String[] args) {

        int rows = 5;
        alphabet_triangle(rows);
    }
    static void alphabet_triangle(int n){

        int alphabet = 64;
        char k;
        for (char i = (char) n; i > 0 ; i--) {
            k=i;
            for (char j = 1; j <= i ; j++, k++) {
                System.out.print((char)(alphabet + k) + " ");
            }
            System.out.println();
        }
    }
}
