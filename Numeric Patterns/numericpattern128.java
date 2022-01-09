import java.util.Scanner;

public class NumericPattern128 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 1; i <= height; i++) {
        
            for (int j = i; j <= height; j++) {
                System.out.print(j + " ");
            }
            for(int j = i-1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 1 2 3 4 5
// 2 3 4 5 1
// 3 4 5 2 1
// 4 5 3 2 1
// 5 4 3 2 1
