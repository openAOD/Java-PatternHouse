
//pattern to be printed
//1 2 3 4 5
//A B C D
//1 2 3
//A B
//1

public class numericpattern204 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            char value = row % 2 == 1 ? '1' : 'A';
            for (int col = n-row+1; col > 0 ; col--) {
                System.out.print(value + " ");
                value++;
            }

            System.out.println();
        }
    }
}