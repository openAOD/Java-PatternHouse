// program to print following pattern
// E
// E D
// E D C
// E D C B
// E D C B A

class alphabeticpattern11 {

    public static void main(String[] args) {

        int rows = 5;
        alphabet_triangle(rows);
    }
    static void alphabet_triangle(int n){

        int alphabet = 64;
        for (char i = (char) n; i > 0 ; i--) {
            for (char j = (char) n; j >= i ; j--) {
                System.out.print((char)(alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}
