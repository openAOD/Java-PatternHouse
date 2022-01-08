import java.util.Scanner;

public class NumericPattern79 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int c = 1;
        for (int i = 1; i <= height; i++) {
        
            for (int j = 1; j <= height-i; j++) {
                System.out.print("  ");
            }
            int n = c;
            while(n > 0) {
                System.out.print(n%10 + " ");
                n = n/10;
            }
            c = c*11;
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
//         1
//       1 1
//     1 2 1
//   1 3 3 1
// 1 4 6 4 1
