import java.util.Scanner;

public class NumericPattern286 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int height = s.nextInt(); // Input height of the pattern
        
        for(int i = 1; i <= height; i++) {
    
            for(int j = 0; j < i+1; j++) {
                System.out.print("  ");
            }
            
            for(int j = i; j <= (2*height) - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        for(int i = 1; i < height; i++) {
    
            for(int j = 0; j < height-i+1; j++) {
                System.out.print("  ");
            }
            
            for(int j = height-i; j <= height + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// Sample Input :- 4
// Output :-
// 1 2 3 4 5 6 7
//   2 3 4 5 6
//     3 4 5
//       4
//     3 4 5
//   2 3 4 5 6
// 1 2 3 4 5 6 7
