// program to print following pattern
// E D C B A
// E D C B
// E D C
// E D
// E

class alphabeticpattern17 {

    public static void main(String[] args) {

        int rows = 5;
        alphabet_triangle(rows);
    }
    static void alphabet_triangle(int n){

        int alphabet = 64;
        for (char i = 1; i <= n ; i++) {
            for (char j = (char) n; j >= i ; j--) {
                System.out.print((char)(alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}
