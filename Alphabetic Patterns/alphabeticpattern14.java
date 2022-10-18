// program to print following pattern
// A A A A A
// B B B B
// C C C
// D D
// E

class alphabeticpattern14 {

    public static void main(String[] args) {

        int rows = 5;
        alphabet_triangle(rows);
    }
    static void alphabet_triangle(int n){

        int alphabet = 65;
        for (char i = 0 ; i <= n ; i++) {
            for (char j = i ; j < n ; j++) {
                System.out.print((char)(alphabet) + " ");
            }
            alphabet++;
            System.out.println();
        }
    }
}
