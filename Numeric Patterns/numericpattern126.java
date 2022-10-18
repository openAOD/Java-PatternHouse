import java.util.Scanner;

class NumericPattern126 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 1; i <= height; i++) {
        
            for (int j = i; j <= height; j++) {
                System.out.print(j + " ");
            }
            for(int j = 1; j <= i-1; j++) {
                System.out.print(height + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 1 2 3 4 5
// 2 3 4 5 5
// 3 4 5 5 5
// 4 5 5 5 5
// 5 5 5 5 5
