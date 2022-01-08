import java.util.Scanner;

public class NumericPattern133 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        int k = 1;
        for (int i = 1; i <= height; i++) {
        
            for (int j = 1; j <= height; j++) {
                System.out.print(k++ + " ");
                
                if(k == 9) {
                    k = 1;
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 1 2 3 4 5
// 6 7 8 1 2
// 3 4 5 6 7
// 8 1 2 3 4
// 5 6 7 8 1
