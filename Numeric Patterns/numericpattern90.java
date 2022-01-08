import java.util.Scanner;

public class NumericPattern90 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 1; i <= height; i++) {
        
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for(int k = i; k <= 5; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 1 2 3 4 5
//   2 3 4 5
//     3 4 5
//       4 5
//         5
