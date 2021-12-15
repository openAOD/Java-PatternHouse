
//pattern to be printed
//A B C D E
//1 2 3 4
//A B C
//1 2
//A

public class numericpattern202 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            char value = row % 2 == 0 ? '1' : 'A';
            for (int col = n-row+1; col > 0 ; col--) {
                System.out.print(value + " ");
                value++;
            }

            System.out.println();
        }
    }
}
