import java.util.Scanner;

public class NumericPattern152 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for (int i = 1; i <= height; i++) {
            
            for(int j = 1;j <= height - i; j++) {
                    System.out.print("* ");
            }
            
            for(int j = 1;j <= i; j++) {
                    System.out.print(i + " ");
            }
            
            System.out.println();
        }
    }
}

// Sample Input :- 5
// Output :-
// * * * * 1
// * * * 2 2
// * * 3 3 3
// * 4 4 4 4
// 5 5 5 5 5
