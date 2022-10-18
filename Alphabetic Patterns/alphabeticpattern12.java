// program to print following pattern
// E
// D D
// C C C
// B B B B
// A A A A A

class alphabeticpattern12 {

    public static void main(String[] args) {

        int rows = 5;
        alphabet_triangle(rows);
    }
    static void alphabet_triangle(int n){

        int alphabet = 64;
        for (char i = (char) (n); i > 0 ; i--) {
            for (char j = (char) (n); j >=i ; j--) {
                System.out.print((char)(alphabet + i) + " ");
            }
            System.out.println();
        }
    }
}
