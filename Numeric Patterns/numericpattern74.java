import java.util.Scanner;

public class NumericPattern74 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
      
        int c = 5;
        for (int i = height; i >= 1; i--) {
        
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for(int k = c; k <= height; k++) {
                System.out.print(i + " ");
            }
            c--;
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//         5
//       4 5
//     3 4 5
//   2 3 4 5
// 1 2 3 4 5
