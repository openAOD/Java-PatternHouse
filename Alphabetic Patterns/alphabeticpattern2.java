// program to print following pattern
// A B C D E
// A B C D E
// A B C D E
// A B C D E
// A B C D E

public class alphabeticpattern2 {

    public static void main(String[] args) {

        int rows = 5;
        alphabet_rectangle(rows);
    }
    static void alphabet_rectangle(int n){

        int alphabet = 65;
        for (char i = 0 ; i < n ; i++) {
            for (char j = 0 ; j < n ; j++) {
                System.out.print((char)(alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}
