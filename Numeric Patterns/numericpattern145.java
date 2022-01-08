import java.util.Scanner;

public class NumericPattern145 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 0; i < height; i++) {
        
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            for(int j = 0;j < height-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// 0 1 2 3 4
// 1 0 1 2 3
// 2 1 0 1 2
// 3 2 1 0 1
// 4 3 2 1 0
