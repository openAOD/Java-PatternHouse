import java.util.Scanner;

class NumericPattern88 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = height; i >= 1; i--) {
        
            for (int j = 1; j <= height-i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :- 
// 1 2 3 4 5
//   1 2 3 4
//     1 2 3 
//       1 2
//         1
