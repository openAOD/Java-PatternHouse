// program to print following pattern
// A A A A A
// B B B B B
// C C C C C
// D D D D D
// E E E E E

class alphabeticpattern1 {

    public static void main(String[] args) {

        int rows = 5;
        alphabet_rectangle(rows);
    }
    static void alphabet_rectangle(int n){

        int alphabet = 65;
        for (char i = 0 ; i < n ; i++) {
            for (char j = 0 ; j < n ; j++) {
                System.out.print((char)(alphabet) + " ");
            }
            alphabet++;
            System.out.println();
        }
    }
}



