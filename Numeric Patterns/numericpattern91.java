import java.util.Scanner;

class NumericPattern91 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = height; i >= 1; i--) {
        
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
// 5 4 3 2 1
//   4 3 2 1
//     3 2 1
//       2 1
//         1
