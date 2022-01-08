import java.util.Scanner;

public class NumericPattern87 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = height; i >= 1; i--) {
        
            for (int j = 1; j <= height-i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 5 5 5 5 5
//   4 4 4 4
//     3 3 3
//       2 2
//         1
