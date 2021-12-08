// program to print following pattern
// A B C D E
// A B C D
// A B C
// A B
// A

public class alphabeticpattern15 {

    public static void main(String[] args) {

        int rows = 5;
        alphabet_triangle(rows);
    }
    static void alphabet_triangle(int n){

        int alphabet = 65;
        for (char i = 1 ; i <= n ; i++) {
            for (char j = 0 ; j < n-i+1 ; j++) {
                System.out.print((char)(alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}
