// program to print following pattern
// E D C B A
// E D C B A
// E D C B A
// E D C B A
// E D C B A

class alphabeticpattern4 {

    public static void main(String[] args) {

        int rows = 5;
        alphabet_rectangle(rows);
    }
    static void alphabet_rectangle(int n){

        int alphabet = 64;
        for (char i = (char) n; i > 0 ; i--) {
            for (char j = (char) n; j > 0 ; j--) {
                System.out.print((char)(alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}
