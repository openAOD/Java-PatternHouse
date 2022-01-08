import java.util.Scanner;

public class NumericPattern75 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        for (int i = 1; i <= height; i++) {
        
            for (int j = 1; j <= height-i; j++) {
                System.out.print("  ");
            }
            for(int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//         1
//       2 1
//     3 2 1
//   4 3 2 1
// 5 4 3 2 1
