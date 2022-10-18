// program to print following pattern
// A
// A B
// A B C
// A B C D
// A B C D E

class alphabeticpattern10 {

    public static void main(String[] args) {

        int rows = 5;
        alphabet_rectangle(rows);
    }
    static void alphabet_rectangle(int n){

        int alphabet = 64;
        for (char i = 1 ; i <= n ; i++) {
            for (char j = 1 ; j <= i ; j++) {
                System.out.print((char)(alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}
