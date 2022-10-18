// program to print following pattern
// A
// B B
// C C C
// D D D D
// E E E E E

class alphabeticpattern9 {

    public static void main(String[] args) {

        int rows = 6;
        alphabet_rectangle(rows);
    }
    static void alphabet_rectangle(int n){

        int alphabet = 64;
        for (char i = 0 ; i < n ; i++) {
            for (char j = 1 ; j <= i ; j++) {
                System.out.print((char)(alphabet) + " ");
            }
            alphabet++;
            System.out.println();
        }
    }
}
