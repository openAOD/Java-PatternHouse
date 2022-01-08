import java.util.Scanner;

public class NumericPattern73 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int c = 1;
        for (int i = height; i >= 1; i--) {
        
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= c; k++) {
                System.out.print(i + " ");
            }
            c++;
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//         5
//       4 4
//     3 3 3
//   2 2 2 2
// 1 1 1 1 1
