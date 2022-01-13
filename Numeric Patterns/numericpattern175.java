import java.util.Scanner;

public class NumericPattern175 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for(int i = height; i >= 1; i--) {
            
            for(int j = 1; j <= i; j++) {
                if(i % 2 == 0) {
                    System.out.print(j + " ");
                }
                else {
                    System.out.print(6 - j + " ");
                }
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 5 4 3 2 1
// 1 2 3 4
// 5 4 3
// 1 2
// 5
