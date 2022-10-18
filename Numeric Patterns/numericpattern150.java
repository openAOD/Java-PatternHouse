import java.util.Scanner;

class NumericPattern150 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 1; i <= height; i++) {
        
            for (int j = 0; j <= height-i; j++) {
                System.out.print(height-i+1 + " ");
            }
            
            for(int j = 1;j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 5 5 5 5 5
// 4 4 4 4 *
// 3 3 3 * *
// 2 2 * * *
// 1 * * * *
