
// pattern to be printed
// A B C D E
//   1 2 3 4
//     A B C
//       1 2
//         A

public class numericpattern210 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n ; row++) {
            for (int spaces = 1; spaces <= row-1; spaces++) {
                System.out.print("  ");
            }
            char value = row % 2 == 0 ? '1' : 'A';
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
    }
}
