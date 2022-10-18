// program to print following pattern
// E E E E E
// D D D D
// C C C
// B B
// A

class alphabeticpattern16 {

    public static void main(String[] args) {

        int rows = 5;
        alphabet_triangle(rows);
    }
    static void alphabet_triangle(int n){

        int alphabet = 64;
        for (char i = (char) (n); i > 0 ; i--) {
            for (char j = 1 ; j <= i ; j++) {
                System.out.print((char)(alphabet + i) + " ");
            }
            System.out.println();
        }
    }
}
